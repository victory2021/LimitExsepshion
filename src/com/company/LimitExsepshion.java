package com.company;

public class LimitExsepshion extends Exception{
    private String massage;
    private double remainingAmout;

    public LimitExsepshion(String massage, double remainingAmout) {
        this.massage = massage;
        this.remainingAmout = remainingAmout;
    }

    public double getRemainingAmout() {
        return remainingAmout;
    }
}
