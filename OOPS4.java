public class OOPS4 {
    
    public static void main(String[] args) {
        Student s1 = new Student();
       s1.name = "Rohit";
          s1.roll =24;
         s1.password ="refdf"; 
        s1.marks[0] =100;
        s1.marks[1] =56;
        s1.marks[2] =67;
 Student s2 = new Student(s1); //copy of propeties of s1.
 s2.password = "xtr";

        for(int i=0; i<3; i++){
              System.out.println(s1.marks[i]);
        }
      
    }
}
    class Student{
       int marks[]; 
        int roll;
        String name;
        String password;
        //shallow copy constructor 
       // Student(Student s1){
           // marks = new int [3]  ; 
           // this.name=s1.name;
           // this.roll=s1.roll;
           // this.marks=s1.marks;
        //}
        Student(Student s1){
            //deep copy constructor
            marks = new int [3]  ;  //here new array for marks is formed therefore ther is no change in initial values of marks
            this.name=s1.name;
            this.roll=s1.roll;
            for (int i=0; i<marks.length; i++){
                this.marks[i]=s1.marks[i];
            }
        }

        Student(){
           marks = new int [3]  ;                                  
            System.out.println("Roll no. is 24.");
        }
        Student (String name,String password){  
             marks = new int [3]  ;                    
            this.name=name;
            this.password=password;
        }
        Student (int roll){  
            marks = new int [3]  ;                    
           this.roll=roll;
       }
      
       //A lazy copy is a combination of both shallow copy and Deep Copy. When initially copying an object, a (fast) shallow copy is used. A counter is also used to track
       // how many objects share the data. When the program wants to modify an object, it can determine if the data is shared (by examining the counter) and can do a
       // deep copy if necessary. Lazy copy looks to the outside just as a deep copy but takes advantage of the speed of a shallow copy whenever possible. The downside
       // are rather high but constant base costs because of the counter. Also, in certain situations, circular references can also cause problems.
       
//Ideally,A situation wherein copying an object causes a performance penalty but the objects are not being modified very frequently
// the Lazy copy would be advantageous in terms of performance.
    }



       
      
       
       
 