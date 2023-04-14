package data;
//1. đọc được câu IS A 1 chiều, TGV là 1 TG, extends

//2. khai báo đặc tính cho Con, nếu Con giống Cha về các đặc dieemr, để Cha lo
//   không cần làm lại, không cần khai báo đặc điểm

//3. phễu cho Con

public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    }//new TGV chính là new TG
     //cắt 1 TGV cũng chính là new 1 TG
    
    
    @Override
     public void paint() {
        System.out.printf("|TRIANGLE |%-15s|%-10s|%4.1f|%4.1f|  - |%7.2f \n", 
                                   owner, color, a, b,getArea());
    }
}
