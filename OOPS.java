public class OOPS {
    //this includes the access modifiers too.
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a Pen object
        p1.setColor ("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        BankAccount bc = new BankAccount();
        System.out.println(bc.username = "Rohit");
        bc.newPass("njhvvj");//we can change password but cannot access it.
        
    }
    }
    class Pen{
        //attributes and functions.
        String color;
        int tip;
        void setColor(String newColor){
            color= newColor;
        }
        void setTip(int newTip){
            tip = newTip;
        }
    }
    class BankAccount{
        public String username;
        private String password;
        public void newPass(String pwd){ //as this fn is inside the class we can use it to change password but password cannot be accessed
            password=pwd;
        }
    }

