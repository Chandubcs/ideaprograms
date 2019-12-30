package programs.co.chandu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, Employee> map = new HashMap<>();

        Employee e1 = new Employee(1, "abc", 200);
        Employee e2 = new Employee(2, "def", 300);
        map.put(1, e1);
        map.put(2, e2);
        Employee emp1 = map.get(1);
        Employee emp2 = map.get(2);
        MapEx ex = new MapEx();
        ex.printByKeys(map);
        map.remove(1);
        ex.printByKeys(map);


    }

    public void printByEntries(Map<Integer, Employee> map) {
        Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
        for (Map.Entry<Integer, Employee> entry : entries) {
            int key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(value.getName());
        }
    }

    public void printByValues(Map<Integer, Employee> map) {
        Collection<Employee> values = map.values();
        for (Employee e : values) {
            System.out.println(e.getName());
        }

    }

    public void printByKeys(Map<Integer, Employee> map) {
        Set<Integer> keys = map.keySet();
        for (int key : keys) {
            Employee value = map.get(key);
            System.out.println(value.getName());
        }
    }

   /* public void addEmployee(Employee e) {
        int id = e.getId();
        if (id < 0)
            throw new UserDefinedException("wrong id");
    }

    */
}


