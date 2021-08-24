package com.example.demo.helpers;

import com.example.demo.mappers.ComplaintMapper;
import com.example.demo.models.Complaint;
import com.example.demo.repository.ComplaintRepository;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.apache.http.client.fluent.Request;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSVHelper {

    private static final String CSV_FILE_PATH = "D:\\demo\\src\\main\\resources\\data.csv";
    private static final String URL = "https://data.cityofnewyork.us/resource/qgea-i56i.csv?$limit=1000";

    public static List<CSVComplaint> csvToComplaint() throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH))
        ) {
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CSVComplaint.class)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return (List<CSVComplaint>) csvToBean.parse();
        }
    }

    public static void getSampleData(ComplaintRepository repository){

        try {
            File myFile = new File(CSV_FILE_PATH);
            Request.Get(URL).execute().saveContent(myFile);
            List<CSVComplaint> complaints = CSVHelper.csvToComplaint();
            for(CSVComplaint complaint : complaints){
                repository.save(ComplaintMapper.toComplaintFromCSV(complaint));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void exportCSV(ComplaintRepository repository){
        List<Complaint> allComplaints = repository.findAll();
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(CSV_FILE_PATH));
        ) {
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();

            beanToCsv.write(allComplaints);
        } catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }
    }


}
