//2.Write a program to create Account class, which is representing a bank account where we can deposit and withdraw
//  money. If user need to withdraw money which exceed our minimum bank balance then it will not be allowed, 
//  and will throw  InSufficientFundException(Custom Exception). Handle above exception and display proper error
//  message. [A] 

import java.util.Scanner;

class InSufficientFundException extends java.lang.Exception {

    InSufficientFundException(String msg) {
        super(msg);
    }
}

class MyBank {

    int acc_num;
    double balance;

    MyBank(int acc_num, double balance) {
        this.acc_num = acc_num;
        this.balance = balance;
    }

    double dispbal() {
        return balance;
    }

    void creditbal(double amt) {
        balance = balance + amt;
        System.out.println("Amount Credited Successfully");
    }

    void debitbal(double amt) throws InSufficientFundException {

        if ((balance - amt) < 1000) {
            throw new InSufficientFundException("Not Enough Balance");
        }

        balance = balance - amt;
        System.out.println("Amount Debited Successfully");
    }
}

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyBank b = new MyBank(111, 5000);

        while (true) {

            System.out.println("\n----------------------");
            System.out.println("1) Display Balance");
            System.out.println("2) Credit");
            System.out.println("3) Debit");
            System.out.println("4) Exit");
            System.out.println("----------------------");

            System.out.print("Enter Choice: ");
            int chr = sc.nextInt();

            try {

                switch (chr) {

                    case 1:
                        System.out.println("Account Number = " + b.acc_num);
                        System.out.println("Balance = " + b.dispbal());
                        break;

                    case 2:
                        System.out.print("Enter Amount to Credit: ");
                        double camt = sc.nextDouble();

                        b.creditbal(camt);
                        break;

                    case 3:
                        System.out.print("Enter Amount to Debit: ");
                        double damt = sc.nextDouble();

                        b.debitbal(damt);
                        break;

                    case 4:
                        System.out.println("Exit..........");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (InSufficientFundException e) {

                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}