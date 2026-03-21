package Oopsfundamental.RunTimePolymorphism;

class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
    void running(){
        System.out.println("animal is running");
    }
}
class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger huntd and eat");
    }
    void running(){
        System.out.println("Tiger  is running for hunting");
    }

}
class Monkey extends Animal{
    void eat(){
        System.out.println("Monkey steals and eat");
    }
    void running(){
        System.out.println("Monkey steals and running");
    }
}
//creating parent reference class
class Forest{
    public void permit(Animal animal){
        animal.eat();
        animal.running();
    }
}

public class launchPoly{
    public static void main(String[] args) {
       Tiger t = new Tiger();
       Monkey m = new Monkey();
       Forest f = new Forest();
       f.permit(t);
       f.permit(m);
        
    }
}