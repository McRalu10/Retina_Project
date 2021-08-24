package com.example.demo.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "complaints")
public class Complaint {

    @Id
    private Long CMPLNT_NUM;
    private  String CMPLNT_FR_DT;
    private String CMPLNT_FR_TM;
    private  String CMPLNT_TO_DT;
    private String CMPLNT_TO_TM;
    private int ADDR_PCT_CD;
    private  String RPT_DT;
    private int KY_CD;
    private String OFNS_DESC;
    private Double PD_CD;
    private String PD_DESC;
    private String CRM_ATPT_CPTD_CD;
    private String LAW_CAT_CD;
    private String BORO_NM;
    private String LOC_OF_OCCUR_DESC;
    private String PREM_TYP_DESC;
    private String JURIS_DESC;
    private Double JURISDICTION_CODE;
    private String PARKS_NM;
    private String HADEVELOPT;
    private String HOUSING_PSA;
    private int X_COORD_CD;
    private int Y_COORD_CD;
    private String SUSP_AGE_GROUP;
    private String SUSP_RACE;
    private String SUSP_SEX;
    private Double TRANSIT_DISTRICT;
    private Double Latitude;
    private Double Longitude;
    private String Lat_Lon;
    private String PATROL_BORO;
    private String STATION_NAME;
    private String VIC_AGE_GROUP;
    private String VIC_RACE;
    private String VIC_SEX;


    public Complaint(Long CMPLNT_NUM,  String CMPLNT_FR_DT, String CMPLNT_FR_TM,  String CMPLNT_TO_DT, String CMPLNT_TO_TM, int ADDR_PCT_CD,  String RPT_DT, int KY_CD, String OFNS_DESC, Double PD_CD, String PD_DESC, String CRM_ATPT_CPTD_CD, String LAW_CAT_CD, String BORO_NM, String LOC_OF_OCCUR_DESC, String PREM_TYP_DESC, String JURIS_DESC, Double JURISDICTION_CODE, String PARKS_NM, String HADEVELOPT, String HOUSING_PSA, int x_COORD_CD, int y_COORD_CD, String SUSP_AGE_GROUP, String SUSP_RACE, String SUSP_SEX, Double TRANSIT_DISTRICT, Double latitude, Double longitude, String lat_Lon, String PATROL_BORO, String STATION_NAME, String VIC_AGE_GROUP, String VIC_RACE, String VIC_SEX) {
        this.CMPLNT_NUM = CMPLNT_NUM;
        this.CMPLNT_FR_DT = CMPLNT_FR_DT;
        this.CMPLNT_FR_TM = CMPLNT_FR_TM;
        this.CMPLNT_TO_DT = CMPLNT_TO_DT;
        this.CMPLNT_TO_TM = CMPLNT_TO_TM;
        this.ADDR_PCT_CD = ADDR_PCT_CD;
        this.RPT_DT = RPT_DT;
        this.KY_CD = KY_CD;
        this.OFNS_DESC = OFNS_DESC;
        this.PD_CD = PD_CD;
        this.PD_DESC = PD_DESC;
        this.CRM_ATPT_CPTD_CD = CRM_ATPT_CPTD_CD;
        this.LAW_CAT_CD = LAW_CAT_CD;
        this.BORO_NM = BORO_NM;
        this.LOC_OF_OCCUR_DESC = LOC_OF_OCCUR_DESC;
        this.PREM_TYP_DESC = PREM_TYP_DESC;
        this.JURIS_DESC = JURIS_DESC;
        this.JURISDICTION_CODE = JURISDICTION_CODE;
        this.PARKS_NM = PARKS_NM;
        this.HADEVELOPT = HADEVELOPT;
        this.HOUSING_PSA = HOUSING_PSA;
        this.X_COORD_CD = x_COORD_CD;
        this.Y_COORD_CD = y_COORD_CD;
        this.SUSP_AGE_GROUP = SUSP_AGE_GROUP;
        this.SUSP_RACE = SUSP_RACE;
        this.SUSP_SEX = SUSP_SEX;
        this.TRANSIT_DISTRICT = TRANSIT_DISTRICT;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Lat_Lon = lat_Lon;
        this.PATROL_BORO = PATROL_BORO;
        this.STATION_NAME = STATION_NAME;
        this.VIC_AGE_GROUP = VIC_AGE_GROUP;
        this.VIC_RACE = VIC_RACE;
        this.VIC_SEX = VIC_SEX;
    }

    public Complaint() {

    }
}
