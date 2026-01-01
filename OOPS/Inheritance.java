package OOPS;


class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}


class shark extends Fish{
    String sharkfamily;
}

public class Inheritance {
    public static void main(String[] args) {
        shark tiger = new shark();
        tiger.sharkfamily="tigershark";
        System.out.println(tiger.sharkfamily); 
    }
}
