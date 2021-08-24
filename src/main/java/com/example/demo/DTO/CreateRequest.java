package com.example.demo.DTO;

import lombok.Getter;

@Getter
public class CreateRequest {
    private final Long CMPLNT_NUM;
    private final int KY_CD;

    public CreateRequest(Long CMPLNT_NUM, int KY_CD) {
        this.CMPLNT_NUM = CMPLNT_NUM;
        this.KY_CD = KY_CD;
    }
}
