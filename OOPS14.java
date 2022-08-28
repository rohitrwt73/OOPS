public class OOPS14 {
    //static keyword...becoz of this we dont have to create schoolName in memory more than once which saves memory.
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SSGK";
        Student s2=new Student ();
        s2.name="Golu";
         System.out.println(s2.name);
        Student s3=new Student ();
        s3.schoolName="jnu";
        
        System.out.println(s3.schoolName);
       
    }
}
class Student {
    int roll;
    String name;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
   String getName(){
        return this.name;
    }

}
