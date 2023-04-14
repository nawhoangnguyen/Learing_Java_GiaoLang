/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fu.util;

import java.util.Scanner;

//đây là Class, Khuông, chứa, có đặc điểm/hành động/chứa các món đồ chơi dùng chung
//cho mọi nơi - vì nó không nhớ cái gì cho riêng tư của nó
//LIBRARY - nơi chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau
public class MyToys {

    //đặc điểm/hành vi là static, cho người ta xem sờ biết thì là public
    //không nhớ cái gì của riêng mình
    //Math : hầu hết static
    //String: vừa non-static, vừa có static
    //System: hầu hết static
    public static final double PI = 3.14;
//final tương đương với constant bên C, biến không cho thay đổi value, trừ lần đầu
//khai báo
//HẰNG SỐ
//CHO SỜ NHƯNG KHÔNG ĐƯỢC SỬA
    private static Scanner sc = new Scanner(System.in);
    //đẩy Scanner ra ngoài xài chung cho các hàm static của chúng ta
     public static int getAnInteger(String inputMsg) {
        int n;
        

        do {
            try {
                System.out.print(inputMsg);
                //n = sc.nextInt();
                n = Integer.parseInt(sc.nextLine());
                return n;
               
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer?");
            }
        } while (true) ;
    }

    //trong quá trình làm app, việc nhập số lặp lại nhiều lần
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn-try-cathc-do-while
    //tách việc nhập số nguyên thành 1 hàm, gói chửi bới, trôi lệnh, nhập lại vào 1 chỗ
    //ta hứng két quả trả về từ hàm, lấy để dùng, MyToys nhớ con số nafy làm gì
    //Math.sqr(4) -> mình dùng,Math không cần nhớ, không cần non-static
    //new mà trả về ko cho người ta dùng, không cần nhớ, dùng nhiều ram làm gì,STatic là thượng sách
    public static int getAnInteger() {
        int n;
       
        do {
            try {
                System.out.print("Input an integer : ");
                //n = sc.nextInt();
                n = Integer.parseInt(sc.nextLine());
                return n;
               
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer?");
            }
        } while (true) ;
    }

}
