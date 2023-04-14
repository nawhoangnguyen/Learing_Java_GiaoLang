/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author USER
 */
public class Rectangle extends Shape {
    
    private double a, b; //width, length

    public Rectangle(String owner, String color, String borderColor,double a, double b) {
        super(owner, color, borderColor); //Ba sẽ là cánh chim, đưa con extends
        this.a = a;//1st statement
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "a=" + a + ", b=" + b +",owner = "+ owner + '}';
    }

    //truyền thống cũ Cha Con là Con thừa kế toàn bộ từ Cha, Cha có gì
    //Con có nấy, Con có quyền biến dị
    //Nếu cha abstract/trừu tượng, hữu hình mà vô hình: có S, P, nhưng ko cụ thể
    //để tính, Shape là 1 khái niệm nói về cái gì gì đó có bề mặt, màu sắc, đường nét
    //Nếu Cha abstract - chứa hàm ko có code/tên hàm/ý tưởng
    //thì Con: chỉ có 2 lựa chọn
    //    Cha nói, Con làm biếng ko làm, ko viết code cho hàm Cha
    //             Con lúc này sẽ chứa hàm abstract luôn (thừa kế mà)
    //         nếu Con abstract, chắc chắn chưa tính đc S luôn
    //kahi đó về mặt lí thuyết, Cha ko có code, chưa làm
    //                          Con ko có code, chưa làm
    //                          ko ổn để đúc, y chang ý tưởng bản Concept
    //Concept đâu có chạy đc, hoặc là ko hoàn hảo, ko bán ko xài được
    //Cha abstract, Con làm biếng abstract, KO THỂ NEW OBJECT VÌ CHẤM KO CÓ
    //CODE -> DÒNG HỌ VÔ SINH, KO NEW ĐC OBJECT, DO KO HOÀN HẢO
    //VẬY PHẢI CÓ AI ĐÓ ĐỦ CODE, TỨC LÀ CHÁU CHẮT PHẢI CÓ CODE, CẦN KHUÔN
    //HOÀN HẢO ĐỂ ĐÚC
    //LỰA CHON 2: CON PHẢI VIẾT CODE CHO ABSTRACT CỦA CHA
    //NGOÀI ĐỜI: ĐỜI CHA CHƯA LÀM ĐƯỢC, CON LÀM TIẾP
    //           CHỈ TAY: TAO CHỈ NÓI VẬY THÔI,
    //           CON HOÀN THIỆN NỐT KHUÔN, HÀM TÍNH S() P() PHẢI LÀM
    //           LÀM ĐC, VÌ Ở CON ĐÃ CÓ BIẾN DỊ ĐỦ CẠNH ĐỂ LÀM
    //HIỆN TƯỢNG VIẾT CODE CHO HÀM ABS CỦA CHA, ĐC GỌI LÀ
    //IMPLEMENT THE PẢENT'S ABSTRACT METHODS
    //implement the body of abstract method
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|Rectangle |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2fn|\n",
                owner, color, borderColor, a, b, getArea());
    }

}
