public class OOPS5 {
    //Inheritance
    public static void main(String[] args) {
        Fish shark= new Fish();
        shark.eats();
    }
}
class Animal{                         //base or parent class
    String color;
   void eats(){
        System.out.println("eats");
    }
    void breathes(){                           
        System.out.println("breathes");
    }
}
class Fish extends Animal{                      //child or derived class
    int fins;
    void swim(){                           
        System.out.println("swims");
    }
}
