public class OOPS13 {
    //Abstract --> mutiple inheritance...here we maike multiple interfaces for 1 class.
    public static void main(String[] args) {
        Omnivores human = new Omnivores();
        human.grasseating();
        human.meateating();
    }
}
interface Herbivores{
    void grasseating();
}
interface Carnivores{
    void meateating();
}
class Omnivores implements Herbivores,Carnivores{
public void grasseating(){
    System.out.println("Eats grass.");
}
public void meateating(){
    System.out.println("Eats meat.");
}
}

