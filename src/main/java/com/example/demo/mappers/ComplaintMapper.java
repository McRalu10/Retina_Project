package com.example.demo.mappers;

import com.example.demo.DTO.CreateRequest;
import com.example.demo.helpers.CSVComplaint;
import com.example.demo.models.Complaint;
import com.example.demo.models.ComplaintBuilder;


public class ComplaintMapper {

    public static Complaint toComplaintFromCSV(CSVComplaint csv){
        return new ComplaintBuilder(Long.parseLong(csv.getCMPLNT_NUM()))
                .setADDR_PCT_CD(Integer.parseInt(csv.getADDR_PCT_CD()))
                .setBORO_NM(csv.getBORO_NM())
                .setCMPLNT_FR_DT(csv.getCMPLNT_FR_DT())
                .setCMPLNT_FR_TM(csv.getCMPLNT_FR_TM())
                .setCMPLNT_TO_DT(csv.getCMPLNT_TO_DT())
                .setCRM_ATPT_CPTD_CD(csv.getCRM_ATPT_CPTD_CD())
                .setHADEVELOPT(csv.getHADEVELOPT())
                .setHOUSING_PSA(csv.getHOUSING_PSA())
                .setJURIS_DESC(csv.getJURIS_DESC())
                .setJURISDICTION_CODE(Double.parseDouble(csv.getJURISDICTION_CODE()))
                .setKY_CD(Integer.parseInt(csv.getKY_CD()))
                .setPD_CD(Double.parseDouble(csv.getPD_CD()))
                .setLatitude(Double.parseDouble(csv.getLatitude()))
                .setLongitude(Double.parseDouble(csv.getLongitude()))
                .setLat_Lon(csv.getLat_Lon())
                .setPARKS_NM(csv.getPARKS_NM())
                .setSTATION_NAME(csv.getSTATION_NAME())
                .setLAW_CAT_CD(csv.getLAW_CAT_CD())
                .setLOC_OF_OCCUR_DESC(csv.getLOC_OF_OCCUR_DESC())
                .setPATROL_BORO(csv.getPATROL_BORO())
                .setTRANSIT_DISTRICT(Double.parseDouble(csv.getTRANSIT_DISTRICT()))
                .setCMPLNT_TO_TM(csv.getCMPLNT_TO_TM())
                .setOFNS_DESC(csv.getOFNS_DESC())
                .setPD_DESC(csv.getPD_DESC())
                .setPREM_TYP_DESC(csv.getPREM_TYP_DESC())
                .setRPT_DT(csv.getRPT_DT())
                .setSUSP_AGE_GROUP(csv.getSUSP_AGE_GROUP())
                .setSUSP_RACE(csv.getSUSP_RACE())
                .setSUSP_SEX(csv.getSUSP_SEX())
                .setVIC_AGE_GROUP(csv.getVIC_AGE_GROUP())
                .setVIC_RACE(csv.getVIC_RACE())
                .setVIC_SEX(csv.getVIC_SEX())
                .setX_COORD_CD(Integer.parseInt(csv.getX_COORD_CD()))
                .setY_COORD_CD(Integer.parseInt(csv.getY_COORD_CD()))
                .build();
    }

    public static Complaint toComplaint(CreateRequest request){
        return new ComplaintBuilder(request.getCMPLNT_NUM())
                .setKY_CD(request.getKY_CD())
                .build();
    }
}
