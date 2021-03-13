package com.company;

public class BankAccount {
    private double amout;



    public double depozit(double sum){

        return amout-=sum;
    }

    public int withDraw(int sum) throws LimitExsepshion {
        if (sum<amout) {
            throw new LimitExsepshion("Сумму снять", 0.9);
        } else

        return (int) (amout = -sum);

    }


    public double getAmout() {
        return amout;
    }
}
