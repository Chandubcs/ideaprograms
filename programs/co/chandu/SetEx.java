package programs.co.chandu;

import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        SetEx ex=new SetEx();
        ex.execute();

    }
    Set<Employee> set=new LinkedHashSet<Employee>();
    public void execute()
    {
        Employee e1 = new Employee(-1, "chandu", 200.0);
        Employee e2 = new Employee(1, "chandu", 200.0);

        // set.add(e1);
        // set.add(e2);
        addEmployee(e1);
        addEmployee(e2);

        System.out.println(set);

    }

    public void print(Set set)
    {
        for(Object o:set)
        {
            Employee e=(Employee)o;//Casting to this specific subclass//always you should caste to subclass type,else error
            System.out.println(e.getId()+ " "+e.getName());
        }
    }
    public void addEmployee(Employee e)
    {
        if(e.getId()<0)
        {
            throw new IncorrectIdException("incorrect id");
            //(or)like this also possible
            // IncorrectException ie=new IncorrectException("incorrect id");
            // throw ie;

        }
        set.add(e);

    }
}

