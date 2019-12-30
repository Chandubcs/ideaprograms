package programs.co.chandu;

public class Student {
    private int id;

    private String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode()
    {
        return id;
    }

    @Override
    public  boolean equals(Object obj)
    {
        if (this==obj)
         {
          return true;
        }
        if(obj==null||!(obj instanceof Student))
        {
            return false;
        }
        Student s=(Student)obj;
        return this.id==s.id;
    }


}
