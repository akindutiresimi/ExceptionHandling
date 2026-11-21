package exceptionHandlerSeventeen;
import java.io.IOException;

public class ExceptionHandlerSeventeen {

    public double withdraw(double balance, double amount)throws ExceptionA {

        if (amount > balance) {
            throw new ExceptionA("Amount is greater than balance");
        }
        else if (amount < 0) {
            throw new ExceptionB("Amount cannot be negative");
        }
        else {
            return balance - amount;
        }
    }

    public static void main(String[] args) {

        ExceptionHandlerSeventeen bank = new ExceptionHandlerSeventeen();

        try {
            bank.withdraw(50000, 60000);
        }
        catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }

        try {
            bank.withdraw(50000, -5000);
        }
        catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }

        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }

        try {
            throw new IOException("Input/Output error occurred");
        }
        catch (Exception exception) {
            System.out.println("Caught: " + exception.getMessage());
        }

    }
}