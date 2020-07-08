import java.io.Serializable;

class Employee  implements Serializable{
    String name;
    int age;

    public Employee( String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Department implements Serializable{
    String name;
    Employee leader;

    public Department(String name, Employee leader){
        this.name = name;
        this.leader = leader;
    }
}