package programs.co.chandu;

public class IncorrectIdException extends RuntimeException {
    public IncorrectIdException(String msg) {//you are passing string to this constructor from ExceptionEx.java
        super(msg);//send this msg to RuntimeException class which has inbuilt method to print the SENDING message
        // (ie..,"msg" in this example
    }
}
