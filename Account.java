package vaishnav.vipul;

import java.util.Scanner;

public class Account {

    private int currBalance;

    private void setCurrBalance(int amount) {
        this.currBalance = amount;
    }

    private void deposit() {
        System.out.print("Enter the debit amount: ");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        this.currBalance += amount;
        System.out.println("Your current account balance is " + this.currBalance);
    }

    private void withdraw() {
        System.out.print("Enter the credit amount: ");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        if (amount > this.currBalance) {
            System.out.println("Insufficient balance in current account. Withdrawal can't be processed");
        }
        this.currBalance -= amount;
        System.out.println("Your current account balance is " + this.currBalance);
    }

    private void addInterest() {
        System.out.print("Enter the interest rate: ");
        Scanner in = new Scanner(System.in);
        double rate = in.nextDouble();
        this.currBalance += this.currBalance * rate;
        System.out.println("Your current account balance is " + this.currBalance);
    }

    public void task() {
        System.out.print("Enter the amount you want your account to initialise with: ");
        Scanner in = new Scanner(System.in);
        setCurrBalance(in.nextInt());
        System.out.println("Now, your current account balance is " + this.currBalance);

        int taskCode = 0;
        while (taskCode != -1) {
            System.out.println("Enter the task code: (1 for deposit; 2 for withdrawal; 3 for add interest; -1 for safe exit) ");
            taskCode = in.nextInt();

            if (taskCode == 1) {
                deposit();
            } else if (taskCode == 2) {
                withdraw();
            } else if (taskCode == 3) {
                addInterest();
            } else if (taskCode == -1) {
                System.out.println("Safe Exit");
            }
        }
    }
}

