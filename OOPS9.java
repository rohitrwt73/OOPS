public class OOPS9 {
    //method overloading (compile time ) polymorphism
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(9,8));
        System.out.println(calc.sum((float)4.9,(float)5.5));
        System.out.println(calc.sum(9,8,7));

    }}
    class Calculator{
        int sum(int a, int b){
            return a+b;
        }
        float sum(float a, float b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+b+c;
        }
    }

