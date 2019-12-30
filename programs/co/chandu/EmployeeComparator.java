package programs.co.chandu;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee emp1,Employee emp2)
    {
        if(emp1.getId()>emp2.getId())
        {return 1;

    }
        if(emp1.getId()>emp2.getId())
        {
            return -1;
        }
        else
            return 0;
}
}
