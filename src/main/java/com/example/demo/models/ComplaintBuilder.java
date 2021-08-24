package com.example.demo.models;

public class ComplaintBuilder {
    private Long cmplnt_num;
    private  String cmplnt_fr_dt;
    private String cmplnt_fr_tm;
    private  String cmplnt_to_dt;
    private String cmplnt_to_tm;
    private int addr_pct_cd;
    private  String rpt_dt;
    private int ky_cd;
    private String ofns_desc;
    private Double pd_cd;
    private String pd_desc;
    private String crm_atpt_cptd_cd;
    private String law_cat_cd;
    private String boro_nm;
    private String loc_of_occur_desc;
    private String prem_typ_desc;
    private String juris_desc;
    private Double jurisdiction_code;
    private String parks_nm;
    private String hadevelopt;
    private String housing_psa;
    private int x_coord_cd;
    private int y_coord_cd;
    private String susp_age_group;
    private String susp_race;
    private String susp_sex;
    private Double transit_district;
    private Double latitude;
    private Double longitude;
    private String lat_lon;
    private String patrol_boro;
    private String station_name;
    private String vic_age_group;
    private String vic_race;
    private String vic_sex;

    public ComplaintBuilder(Long cmplnt_num){
        this.cmplnt_num = cmplnt_num;
    }

    public ComplaintBuilder setCMPLNT_FR_DT( String cmplnt_fr_dt) {
        this.cmplnt_fr_dt = cmplnt_fr_dt;
        return this;
    }

    public ComplaintBuilder setCMPLNT_FR_TM(String cmplnt_fr_tm) {
        this.cmplnt_fr_tm = cmplnt_fr_tm;
        return this;
    }

    public ComplaintBuilder setCMPLNT_TO_DT( String cmplnt_to_dt) {
        this.cmplnt_to_dt = cmplnt_to_dt;
        return this;
    }

    public ComplaintBuilder setCMPLNT_TO_TM(String cmplnt_to_tm) {
        this.cmplnt_to_tm = cmplnt_to_tm;
        return this;
    }

    public ComplaintBuilder setADDR_PCT_CD(int addr_pct_cd) {
        this.addr_pct_cd = addr_pct_cd;
        return this;
    }

    public ComplaintBuilder setRPT_DT( String rpt_dt) {
        this.rpt_dt = rpt_dt;
        return this;
    }

    public ComplaintBuilder setKY_CD(int ky_cd) {
        this.ky_cd = ky_cd;
        return this;
    }

    public ComplaintBuilder setOFNS_DESC(String ofns_desc) {
        this.ofns_desc = ofns_desc;
        return this;
    }

    public ComplaintBuilder setPD_CD(Double pd_cd) {
        this.pd_cd = pd_cd;
        return this;
    }

    public ComplaintBuilder setPD_DESC(String pd_desc) {
        this.pd_desc = pd_desc;
        return this;
    }

    public ComplaintBuilder setCRM_ATPT_CPTD_CD(String crm_atpt_cptd_cd) {
        this.crm_atpt_cptd_cd = crm_atpt_cptd_cd;
        return this;
    }

    public ComplaintBuilder setLAW_CAT_CD(String law_cat_cd) {
        this.law_cat_cd = law_cat_cd;
        return this;
    }

    public ComplaintBuilder setBORO_NM(String boro_nm) {
        this.boro_nm = boro_nm;
        return this;
    }

    public ComplaintBuilder setLOC_OF_OCCUR_DESC(String loc_of_occur_desc) {
        this.loc_of_occur_desc = loc_of_occur_desc;
        return this;
    }

    public ComplaintBuilder setPREM_TYP_DESC(String prem_typ_desc) {
        this.prem_typ_desc = prem_typ_desc;
        return this;
    }

    public ComplaintBuilder setJURIS_DESC(String juris_desc) {
        this.juris_desc = juris_desc;
        return this;
    }

    public ComplaintBuilder setJURISDICTION_CODE(Double jurisdiction_code) {
        this.jurisdiction_code = jurisdiction_code;
        return this;
    }

    public ComplaintBuilder setPARKS_NM(String parks_nm) {
        this.parks_nm = parks_nm;
        return this;
    }

    public ComplaintBuilder setHADEVELOPT(String hadevelopt) {
        this.hadevelopt = hadevelopt;
        return this;
    }

    public ComplaintBuilder setHOUSING_PSA(String housing_psa) {
        this.housing_psa = housing_psa;
        return this;
    }

    public ComplaintBuilder setX_COORD_CD(int x_coord_cd) {
        this.x_coord_cd = x_coord_cd;
        return this;
    }

    public ComplaintBuilder setY_COORD_CD(int y_coord_cd) {
        this.y_coord_cd = y_coord_cd;
        return this;
    }

    public ComplaintBuilder setSUSP_AGE_GROUP(String susp_age_group) {
        this.susp_age_group = susp_age_group;
        return this;
    }

    public ComplaintBuilder setSUSP_RACE(String susp_race) {
        this.susp_race = susp_race;
        return this;
    }

    public ComplaintBuilder setSUSP_SEX(String susp_sex) {
        this.susp_sex = susp_sex;
        return this;
    }

    public ComplaintBuilder setTRANSIT_DISTRICT(Double transit_district) {
        this.transit_district = transit_district;
        return this;
    }

    public ComplaintBuilder setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public ComplaintBuilder setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public ComplaintBuilder setLat_Lon(String lat_lon) {
        this.lat_lon = lat_lon;
        return this;
    }

    public ComplaintBuilder setPATROL_BORO(String patrol_boro) {
        this.patrol_boro = patrol_boro;
        return this;
    }

    public ComplaintBuilder setSTATION_NAME(String station_name) {
        this.station_name = station_name;
        return this;
    }

    public ComplaintBuilder setVIC_AGE_GROUP(String vic_age_group) {
        this.vic_age_group = vic_age_group;
        return this;
    }

    public ComplaintBuilder setVIC_RACE(String vic_race) {
        this.vic_race = vic_race;
        return this;
    }

    public ComplaintBuilder setVIC_SEX(String vic_sex) {
        this.vic_sex = vic_sex;
        return this;
    }

    public Complaint build() {
        return new Complaint(cmplnt_num, cmplnt_fr_dt, cmplnt_fr_tm, cmplnt_to_dt, cmplnt_to_tm, addr_pct_cd, rpt_dt, ky_cd, ofns_desc, pd_cd, pd_desc, crm_atpt_cptd_cd, law_cat_cd, boro_nm, loc_of_occur_desc, prem_typ_desc, juris_desc, jurisdiction_code, parks_nm, hadevelopt, housing_psa, x_coord_cd, y_coord_cd, susp_age_group, susp_race, susp_sex, transit_district, latitude, longitude, lat_lon, patrol_boro, station_name, vic_age_group, vic_race, vic_sex);
    }
}