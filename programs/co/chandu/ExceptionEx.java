package programs.co.chandu;

public class ExceptionEx {
    private Employee employee;

    public static void main(String[] args) {
        ExceptionEx ex = new ExceptionEx();
        try {
            ex.execute3();

        }
        catch (IncorrectIdException e) {

            System.out.println("id incorrect");
        }
        catch(Exception e)
        {
            System.out.println("Exception stmt");
        }
    }


    public void execute3() {
        if (employee.getId() < 0) {
            IncorrectIdException exception = new IncorrectIdException("ID cant be null");
            throw exception;
        }
    }
}
