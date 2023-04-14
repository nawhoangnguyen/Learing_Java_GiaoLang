package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        //inputProfile();
        inputSProfile();
                         
    }

    //nhập thông tin cơ bản của sinh viên rồi in ra
    public static void inputSProfile() {
        //không OOP, chỉ cần hiểu về việc nhập info trước đã, không chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (69 < 79) {//cuộc chiến vô cực, lặp vô tận          
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do you know to input a positive number?");

            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name : " + name);
        System.out.println("Yob : " + yob);
        System.out.println("Address : " + address);

    }

    public static void inputProfile() {
        //không OOP, chỉ cần hiểu về việc nhập info trước đã, không chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //mặc định JVM sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        //đưa cho ta 1 cơ chế tự xử khi có cà chớn, chuyển quyền giết chóc cho mình
        //báo JVM biết đừng giết, tao tự xử, nhốt các lệnh cà chớn lại một cái SANDBOX
        try {
            //lệnh cà chớn nằm đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            //CPU sẽ chạy đến đây khi có cà chớn xảy ra
            //JVM không giết app như truyền thống
            //chỗ này là chỗ xử lí hậu quả cà chớn
            //e chính là lá thư/msg màu đỏ JVM gửi cho mình báo rằng có lỗi cà chớn nè
            //làn gì thì làm
            //EXCEPTION e = new Exception (nội dung lỗi mày đỏ đây nè .....);
            //về lí : e.xem lỗi, xử lí tự mình
            //về toán hóa mình chỉ tập trung phần xử lí lỗi biết thừa éo gõ đúng số mình cần
            //hay thì phải bắt nhập lại.
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name : " + name);
        System.out.println("Yob : " + yob);
        System.out.println("Address : " + address);

    }
}
