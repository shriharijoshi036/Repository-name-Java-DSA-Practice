package Oopsfundamental.encapsulation;

public class employee {
    private int id = 102;
    private String name;
    private int salary;
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
class employee1{
    public static void main(String[] args) {
        employee employee = new employee();

        
        employee.setName("Aashish");
        employee.setSalary(30000);

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
     
    }
}
