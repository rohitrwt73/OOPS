public class OOPS8 {
    //Hybrid Inheritance
    public static void main(String[] args) {
        Section2 s2 = new Section2();
        s2.name();
    }
}
class School{
    void name (){
        System.out.println("Rohit,Mohit, Golu,Somu");
    }
}
class Standard1 extends School{
    void name (){
        System.out.println("Golu");
    }
}
class Standard2 extends School{
    void name(){
        System.out.println("Rohit");
    }
}
class Section1 extends Standard1{
    void name(){
        System.out.println("Roh");
    }
}
class Section2 extends Standard2{
    void name(){
        System.out.println("R");
    }
}
