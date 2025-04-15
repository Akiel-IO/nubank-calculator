package com.skandinavia.service;

public class DailyInterestService {
    private final double interestRate = 0.095;
    private final double dailyInterestConversion = Math.pow((1 + interestRate), ((double) 1/365)) -1;

    public DailyInterestService() {
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getDailyInterestConversion() {
        return dailyInterestConversion;
    }

    public double calculateDailyReturn(double boxBalance, double dailyInterestConversion) {

        return boxBalance * (1 + dailyInterestConversion);
    }

    @Override
    public String toString() {
        return "DailyInterestService{" +
                "interestRate=" + interestRate +
                ", dailyInterestConversion=" + dailyInterestConversion +
                '}';
    }
}
