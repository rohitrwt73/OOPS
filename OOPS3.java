public class OOPS3 {
    //here 2 types of constructors are discussed
    public static void main(String[] args) {
        Student s1 = new Student(); //non parameterized constructors.
        Student s2 = new Student("Rohit");//parameterized constructors.
        System.out.println(s2.name);
    }}
    class Student{
        int roll;
        String name;
        Student(){                                    //non parameterized constructors.
            System.out.println("Roll no. is 24.");
        }
        Student (String name){                     // parameterized constructors.
            this.name=name;
        }
    } //this incidence when we create objects and according to them a constructor is called in same code is called contructructor overloading.

