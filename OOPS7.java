public class OOPS7 {
    //  Hierarchial Inheritance
    public static void main(String[] args) {
     Bird sparrow= new Bird();
       sparrow.eats();
      sparrow.legs =2;
       System.out.println( sparrow.legs);
    }
}
class Animal{                         //base or parent class
    String color;
    int legs;
   void eats(){
        System.out.println("eats");
    }
    void breathes(){                           
        System.out.println("breathes");
    }
}
class Mammal extends Animal{                      //child or derived class
    void walk(){
        System.out.println("walks");
      }
    
    
}
class Bird extends Animal{                      //child or derived class
  void fly(){
    System.out.println("flies");
  }
}
class Fish extends Animal{                      //child or derived class
    void swim(){
      System.out.println("swims");
    }
  }

    

