package com.example.demo.helpers;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CSVComplaint {

        @CsvBindByPosition(position = 0)
        private String CMPLNT_NUM;

        @CsvBindByPosition(position = 1)
        private String CMPLNT_FR_DT;

        @CsvBindByPosition(position = 2)
        private String CMPLNT_FR_TM;

        @CsvBindByPosition(position = 3)
        private String CMPLNT_TO_DT;

        @CsvBindByPosition(position = 4)
        private String CMPLNT_TO_TM;

        @CsvBindByPosition(position = 5)
        private String ADDR_PCT_CD;

        @CsvBindByPosition(position = 6)
        private String RPT_DT;

        @CsvBindByPosition(position = 7)
        private String KY_CD;

        @CsvBindByPosition(position = 8)
        private String OFNS_DESC;

        @CsvBindByPosition(position = 9)
        private String PD_CD;

        @CsvBindByPosition(position = 10)
        private String PD_DESC;

        @CsvBindByPosition(position = 11)
        private String CRM_ATPT_CPTD_CD;

        @CsvBindByPosition(position = 12)
        private String LAW_CAT_CD;

        @CsvBindByPosition(position = 13)
        private String BORO_NM;

        @CsvBindByPosition(position = 14)
        private String LOC_OF_OCCUR_DESC;

        @CsvBindByPosition(position = 15)
        private String PREM_TYP_DESC;

        @CsvBindByPosition(position = 16)
        private String JURIS_DESC;

        @CsvBindByPosition(position = 17)
        private String JURISDICTION_CODE;

        @CsvBindByPosition(position = 18)
        private String PARKS_NM;

        @CsvBindByPosition(position = 19)
        private String HADEVELOPT;

        @CsvBindByPosition(position = 20)
        private String HOUSING_PSA;

        @CsvBindByPosition(position = 21)
        private String X_COORD_CD;

        @CsvBindByPosition(position = 22)
        private String Y_COORD_CD;

        @CsvBindByPosition(position = 23)
        private String SUSP_AGE_GROUP;

        @CsvBindByPosition(position = 24)
        private String SUSP_RACE;

        @CsvBindByPosition(position = 25)
        private String SUSP_SEX;

        @CsvBindByPosition(position = 26)
        private String TRANSIT_DISTRICT;

        @CsvBindByPosition(position = 27)
        private String Latitude;

        @CsvBindByPosition(position = 28)
        private String Longitude;

        @CsvBindByPosition(position = 29)
        private String Lat_Lon;

        @CsvBindByPosition(position = 30)
        private String PATROL_BORO;

        @CsvBindByPosition(position = 31)
        private String STATION_NAME;

        @CsvBindByPosition(position = 32)
        private String VIC_AGE_GROUP;

        @CsvBindByPosition(position = 33)
        private String VIC_RACE;

        @CsvBindByPosition(position = 34)
        private String VIC_SEX;

        public String getADDR_PCT_CD() {
                if(ADDR_PCT_CD.isEmpty())
                        return "0";
                return ADDR_PCT_CD;
        }

        public String getKY_CD() {
                if(KY_CD.isEmpty())
                        return "0";
                return KY_CD;
        }

        public String getPD_CD() {
                if(PD_CD.isEmpty())
                        return "0.0";
                return PD_CD;
        }

        public String getJURISDICTION_CODE() {
                if(JURISDICTION_CODE.isEmpty())
                        return "0.0";
                return JURISDICTION_CODE;
        }

        public String getX_COORD_CD() {
                if(X_COORD_CD.isEmpty())
                        return "0";
                return X_COORD_CD;
        }

        public String getY_COORD_CD() {
                if(Y_COORD_CD.isEmpty())
                        return "0";
                return Y_COORD_CD;
        }

        public String getTRANSIT_DISTRICT() {
                if(TRANSIT_DISTRICT.isEmpty())
                        return "0.0";
                return TRANSIT_DISTRICT;
        }

        public String getLatitude() {
                if(Latitude.isEmpty())
                        return "0.0";
                return Latitude;
        }

        public String getLongitude() {
                if(Longitude.isEmpty())
                        return "0.0";
                return Longitude;
        }
}
