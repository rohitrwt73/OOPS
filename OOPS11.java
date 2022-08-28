

public class OOPS11 {
    //Abstraction -->Abstract class.
    public static void main(String[] args) {
        Horse mus = new Horse();
        mus.eat();
        mus.walk();
       System.out.println( mus.color);
    }
}
abstract class Animal {      //abstract class can have abstract or non abstract functions and also contain constructors.
    String color;
    abstract void walk();    //abstract func does not contaib curly braces.
   void eat (){
    System.out.println("Animal eats.");
     }  
     Animal(){                 //constructor it also initialize variable in child class.
        color = "Brown";
    } 
} 
class Horse extends Animal{
    void walk (){
        System.out.println("walks on 4 legs");
    }
    void changeColor(){
        color= "Dark Brown";
    }
}
class Chicken extends Animal{
    void walk (){
        System.out.println("walks on 2 legs");
    }
    void changeColor(){
        color= "white";
    }
}