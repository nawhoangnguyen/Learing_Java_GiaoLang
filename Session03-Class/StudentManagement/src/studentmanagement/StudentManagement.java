package studentmanagement;

import data.Student;
import java.util.Scanner;


public class StudentManagement {
    public static void main(String[] args) {
     saveStudents();
        //inputAStudent();    
    }
    
    //nhập từ bàn phím
    //cần Scanner object bàn phím. ÔOP cái gì cũng là object
    //máy cam, scanner ở tiện photo, bàn phím cơ, touchpad -> thuôc nhóm 
    //quét dữ liệu đưa vào máy tính
    //Do đos class scanner xuất hiện muốn thì new để cho nó xuất hiện
    //từ bàn phím đi vào ram, do đó phải có biến
  public static void inputAStudent(){
       String id, name;
      int yob;
      double gpa;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input id: ");
      id = sc.nextLine();
     
      System.out.print("Input name: ");
      name = sc.nextLine();
      
      System.out.print("Input yob: ");
      yob = sc.nextInt();
      
      System.out.print("Input gpa: ");
      gpa = sc.nextDouble();
      
      Student x = new Student(id, name, yob, gpa);
        x.showProfile();
  }
  
  //hard-code
  public static void saveStudents(){
     
      Student an = new Student("SE172204", "An", 2003, 8.9);
      Student binh = new  Student("SE1704953", "Binh", 2001, 0.9);
              
              an.showProfile();
              binh.showProfile();
              
      //chấm xổ gì, Access Modifier/Access Specifier
      System.out.println("An name (directly): "+ an.name);
      System.out.println("An name (directly): " + an.getName());
      
      //vì sờ được trực tiếp cái name/biến/instance variable
      //an.name = "Không học bài";
      Student.name = "CÀY RANK HƠN CÀY CODE";
      System.out.println("Binh name (directly): "+ binh.name);
      System.out.println("An name again (directly): "+ an.name);
      
   System.out.println("Student name again (directly): "+ Student.name);
      
      an.showProfile();
  
      //sayHi() mà đang là static
      binh.sayHi();
      an.sayHi();
      Student.sayHi();//tên class chấm static vì là đồ chung cho multiple objects
  }
        
}
//Static ăn theo thằng cuối cùng
