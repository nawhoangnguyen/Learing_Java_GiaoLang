package varnfun;

import java.util.Scanner;// tương đương với câu lệnh #include<stdio.h>

public class VarNFun {

    
    public static void main(String[] args) {
      int n = getAPositiveInteger();
        System.out.println("Your number: " + n);
      printIntegerList(n); //truyền tham trị pass by value
                           // value n của hàm main() sẽ được đưa qua ngõ/ngả
                           //phễu,máy xay,n main() đập ngang sang n của hàm 
                           //OOP pass by reference truyền tham chiếu,địa chỉ,con trỏ
//playWithBooleans();      
      //playWithCharacters();
      //playWithDoubles();
      //playWithIntegers();
      //playWithVariables();
    }
    public static int getAPositiveInteger(){
        //tên hàm là 1 biến được gắn value qua return
        int n;
        //nhập từ bàn phím, xài kĩ thuật OOP, chấm và bung lụa name.charAt()
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Input a positive integer: " );
        n = banPhimCuaTui.nextInt();
        return n; //getAPositiveInteger() = n
    }
    
   

    //in ra các số tự nhiên từ 1 đến 100
 public static void printIntegerList(int n){
     //in n số tự nhiên tính từ 1
    //hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số
    //đầu vào, mà phải khác tên trên data type chứ không phải khác trên tên biến
    //được gọi là OVERLOAD/OVERLOADING - quá tải hàm
    //vs. OVERRIDE
     //chỉ có ngáo mới scanf(n)here!! n đã có value khi xài
        //body of funct. nghiền, trộn xử lí với đầu vào giả định sẽ đưa qua tên gọi
        //giải quyêts trên công thức
        System.out.println("the list of " + n + " first numbers");
        
       for (int i = 1; i <= n; i++) {
           System.out.print(i + " ");
            
       }
    }
 
   
   
    public static void playWithBooleans() {
        //C: đúng: 1, > 0, sai: 0
        //Java: đúng: True, sai: False,-> boolean
        boolean marriedStatus = true;
        if(marriedStatus == true)//có ngoặc nhọn khi dùng hai lệnh trở lên
            System.out.println("Tui có gia đình rồi");
        else
            System.out.println("Tui chưa có gia đình");
        
    }
    
    public static void playWithCharacters() {
        //2 byte cho kiểu char , lưu bảng mã Unicode
        char m = '$';
        System.out.println("unit : " + m);
        //lưu tên thì sao? C: mảng kí tự, ko primitive nữa, bắt đầu phức tạp
        String name = "Nguyễn Thúc Thùy Tiên"; //đây là loại data type mới
        //do nó gom nhiều thức, nó phức tạp
        //nó là object data type, sẽ học sớm 
        System.out.println("My name is : " + name);
        System.out.println("My name's 1st letter  : " + name.charAt(0));
        System.out.println("My name in a lowercase  : " + name.toLowerCase());
        
       
    }
    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
    double pi = 3.14;        
    System.out.println("pi : " + pi);
    System.out.printf("pi : %.2f\n", pi); //cấm tuyệt đối không dùng %lf trong java
    
    float vat = 0.1F;
        System.out.println("vat : " + vat);
        
    
}
    public static void playWithIntegers() {
        int n = 39;//mọi con số, kí tự xuất hiện trong code đc gọi là literal value
                   //riêng số nguyên xuất hiện trong code thì mặc định là int
                   //mà int thì 4 byte
        System.out.println("n : " + n);
        
        long m = 3_000_000_000L;//thêm L đằng sau để máy hiểu là kiểu long không thì mặc định là int
        System.out.println("m : " + m);
        int status = 0xFA; //hệ 16 hexa
        System.out.println("status : " + status);
        int phone = 010; //0 hệ 8 octal
        System.out.println("phone : " + phone);
        
    }
    public static void playWithVariables(){
        //biến là 1 vùng ram được đặt tên, chiếm một số byte nhất định tùy loại
        //dữ liệu,thông tin mà nó chứa bên trong
        //là cách đặt tên cho 1 đại lượng,giá trị đơn, giá trị 
        int age = 20;
        int a = 10, b;
        b = 100;
        //4 biến này chưa 12 byte trong RAM
        System.out.println("age : " + age);
        int yob = 2003; //year of birth
        age = 2022 - yob;
        
        System.out.println("age again: " + age);
        
        System.out.println("age by using transitive tech: " + (2022 - yob));
    //thay đổi độ ưu tiên của phép toán
        System.out.printf("age printed by using %% as in C : %d\n ", (2022 - yob));
    //sử dụng C
    }
    
}
