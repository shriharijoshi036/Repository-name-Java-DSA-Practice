package Oopsfundamental.constructor;

public class Dog {
    private int cost;
    private String name;
    private String color;
    Dog (int cost, String name, String color){
        this.cost = cost;
        this.name= name;
        this.color = color;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
   
        }

     class dog1{
        public static void main(String[] args) {
            Dog Dog = new Dog(5000, " lobbo", "black");
            System.out.println(Dog.getCost());
            System.out.println(Dog.getName());
            System.out.println(Dog.getColor());
        }
    }
