public class OOPS15 {
    //super(),   super.color
    public static void main(String[] args) {
        Horse h = new Horse();
       System.out.println( h.color);
    }
}
class Animal{
    String color;
}
class Horse extends Animal{
    Horse(){
        super.color="Brown";     //called the upper class and got color brown printed
    } 
}
