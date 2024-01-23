package com.ozael.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer workedDays;

    public Payment() {
    }

    public Payment(String name, Double dailyIncome, Integer workedDays) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.workedDays = workedDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Integer getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(Integer workedDays) {
        this.workedDays = workedDays;
    }

    public double getTotal() {
        return workedDays * dailyIncome;
    }

}
