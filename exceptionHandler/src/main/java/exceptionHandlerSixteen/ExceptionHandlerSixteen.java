package exceptionHandlerSixteen;

import java.util.Scanner;

public class ExceptionHandlerSixteen {

    public static double withdraw(double balance, double amount)
            throws ExceptionA {

        if (amount > balance) {
            throw new ExceptionA("Amount is greater than balance");
        }

        else if (amount == 0) {
            throw new ExceptionB("Withdrawal amount must be greater than zero");
        }

        else if (amount < 0) {
            throw new ExceptionC("Withdrawal amount cannot be negative");
        }

        balance = balance - amount;

        return balance;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter your balance: ");
            double balance = input.nextDouble();

            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();

            double newBalance = withdraw(balance, amount);

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + newBalance);

        }

        catch (ExceptionA e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

    }

}
