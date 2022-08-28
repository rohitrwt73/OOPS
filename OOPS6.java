public class OOPS6 {
    // multi level Inheritance
    public static void main(String[] args) {
     Dog doggy= new Dog();
       doggy.eats();
       doggy.legs =2;
       System.out.println( doggy.legs);
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
class Mammal extends Animal{                      //child or derived class
    int legs;
    
    
}
class Dog extends Mammal{                      //child or derived class derived from derived class
    int breed;
}
    
