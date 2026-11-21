package exceptionHandlerTWentyTwentyOne;

public class ExceptionHandlerTwentyOne {
    public static void withdraw(double amount, double balance) throws Exception {
        try{
            amount = amount - balance;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic error handled inside the method.");
        }
        
    }
}
