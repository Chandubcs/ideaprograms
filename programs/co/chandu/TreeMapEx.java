package programs.co.chandu;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {


        Map<Integer, Employee> map = new TreeMap<>(new EmployeeKeyComparator());//only this line changes from previous Map program
//As we provided OUR comparator which overrides original one,it sorts according to OUR conds in that function
        Employee e1 = new Employee(1, "abc", 200);
        Employee e2 = new Employee(2, "def", 300);
        map.put(1, e1);
        map.put(2, e2);
        Employee emp1 = map.get(1);
        Employee emp2 = map.get(2);
        TreeMapEx ex = new TreeMapEx();
        ex.printByKeys(map);
        map.remove(1);
        ex.printByKeys(map);
    }
    /*
    public void addEmployee(Employee e)
    {
        if(e.getId()<0)
        {
            throw new IncorrectIdException("incorrect id");
            //(or)like this also possible
            // IncorrectException ie=new IncorrectException("incorrect id");
           // throw ie;

        }
        map.put(id,e);
    }

     */


        public void printByEntries(Map<Integer,Employee>map)
        {
            Set<Map.Entry<Integer,Employee>>entries =map.entrySet();
            for(Map.Entry<Integer,Employee>entry:entries)
            {
                int key=entry.getKey();
                Employee value=entry.getValue();
                System.out.println(value.getName());
            }
        }
        public void printByValues(Map<Integer,Employee>map)
        {
            Collection<Employee> values=map.values();
            for(Employee e:values)
            {
                System.out.println(e.getName());
            }

        }
        public void printByKeys(Map<Integer,Employee>map)

        {
            Set<Integer> keys=map.keySet();
            for(int key:keys)
            {
                Employee value=map.get(key);
                System.out.println(value.getName());
            }
        }

    }


