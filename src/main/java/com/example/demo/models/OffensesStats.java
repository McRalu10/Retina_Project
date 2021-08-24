package com.example.demo.models;

import lombok.Getter;

@Getter
public class OffensesStats {
    private final int KY_CD;
    private final Long count;

    public OffensesStats(int KY_CD, Long count) {
        this.KY_CD = KY_CD;
        this.count = count;
    }
}
