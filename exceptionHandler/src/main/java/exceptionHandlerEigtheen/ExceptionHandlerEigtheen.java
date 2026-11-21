package exceptionHandlerEigtheen;

public class ExceptionHandlerEigtheen {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception exception) {
            throw exception;
        }
    }

    private static void someMethod2() throws Exception {
        throw new Exception("An exception happened");
    }
}