class School{
    String studentName;
    int id;

   static String schoolName;
   static int totalStudents;
 static{
    schoolName = "Saint Paul's Academy";
    totalStudents = 0;
 }
 School(String studentName, int id){
    this.studentName=studentName;
    this.id=id;
    System.out.println("name : " + studentName+ ", ID :" +id + ", schoolName :"+ schoolName);
    totalStudents++;
 }
 static void showtotalStudents(){
    System.out.println("totalStudents : " + totalStudents);
 }
}
public class launchstatic2 {
    public static void main(String[] args) {
        School.showtotalStudents();
        School stu1 = new School("Gauri", 13);
        School stu2 = new School("Shradha", 14);
    

        School.showtotalStudents();
        
    }
    
}
