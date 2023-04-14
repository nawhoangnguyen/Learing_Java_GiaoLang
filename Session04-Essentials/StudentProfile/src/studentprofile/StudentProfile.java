package studentprofile;

import java.util.Scanner;

public class StudentProfile {

    public static void main(String[] args) {
        inputProfile();
    }
//nhập thông tin cơ bản của sinh viên rồi in ra

    public static void inputProfile() {
        //không OOP, chỉ cần hiểu về việc nhập info trước đã, không chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        System.out.print("Input yob: ");
        //yob = sc.nextInt();//convert data từ bàn phím - là chuỗi thành số
        //dòng lệnh nextInt() để lại rác trong buffer, tệ nhất là enter, rác dấu cách + enter
        //xóa bộ đệm trước nhập chuỗi
             //sc.nextLine();//tà đạo
             
        //không tà đạo
        String tmpNum = sc.nextLine();
            yob = Integer.parseInt(tmpNum); //nexLine() hốt sạch buffer, loại bỏ buffer
                //loại bỏ enter, còn chuỗi số -> số
        
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name : " + name);
        System.out.println("Yob : " + yob);
        System.out.println("Address : " + address);

    }

}
