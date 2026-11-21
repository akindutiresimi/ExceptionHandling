package exceptionHandlerNineteen;

public class Phone {
    private String name;
    private String number;

    public Phone(String firstName, String Number) throws CustomerizeException{

        if(name == null){
            throw new CustomerizeException("Phone name is null");
        }
        if(number == null){
            throw new CustomerizeException("Phone number is null");
        }

        this.name = firstName;
        this.number = String.valueOf(Number);
    }

    public static void main(String[] args) throws CustomerizeException{

        try{
            Phone phone = new Phone("Nokia", "12345678901");
        }
        catch (CustomerizeException exception){
            System.out.println(exception.getMessage());
        }
    }
}
