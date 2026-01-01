package OOPS;

abstract  class Animal{


    String color;


    //constructor
    Animal(){
        color="brown";
    }

    void eat(){
        System.out.println("animal eats..");
    }

    abstract void walk();
}

class horse extends  Animal{
    String changecolor(){
        return color="white";
        
    }

    void walk(){
        System.out.println("has 4 legs");
    }
}

class chicken extends  Animal{
    void walk(){
        System.out.println("has 2 legs");
    }
}




public class Abstraction {
    public static void main(String[] args) {
        horse h=new horse();
        h.walk();
        h.eat();
        System.out.println(h.color);//base class initialisation color
        System.out.println(h.changecolor());

        
        // chicken c= new chicken();
        // c.walk();
        // c.eat();
    }
}
