package OOPS;

//interface implemntation and multiple inheritance through interface 

interface herbivore{
    void eatplants();
}

interface carnivore{
    void eatmeat();
}

class human implements herbivore,carnivore{
   public void eatplants(){
    System.out.println("eats plants");
    }

    public void eatmeat(){
        System.out.println("eat meat");
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        human h = new human();
        h.eatmeat();
        h.eatplants();
    }
}
