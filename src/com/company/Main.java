package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       BankAccount bankAccount = new BankAccount();
       bankAccount.depozit(20000);
       while (true) {
          double result= scanner.nextDouble()+bankAccount.depozit(20000);
           System.out.println(result);
           System.out.println();
       }
    }
}
