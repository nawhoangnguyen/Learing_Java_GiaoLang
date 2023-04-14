package data;

//1. Thấy có Is A, extends
//2. Đặc điểm cho Con, đồng nhất hoặc dị biệt
//3. Phễu
//4. 1 CLASS CHỨA HÀM ABSTRACT KO CODE, THÌ CLASS ĐÓ
//CON thừa kế abstract calss, mày có 2 lựa chọn, ko hơn
//hoặc mày -abstract, thừa kế abstract luôn, trở thành khái niệm
//hoặc mày phải viết code cho hàm abstract của cha, vì m đủ info để làm
//mày là cụ thể rồi, vì mọi thứ trong mày là rõ ràng
//CON VIẾT CODE CHO HÀM CHA, CHA NÓI CON LÀM, IMPLEMENT ABSTRACT METHODS
// implement the body of Parent's abstract methods
//  Cha nói ý tưởng, Con thực hiện
// Con ko thực hiện, như Cha, thì đời Cháu làm,
// còn ko nữa thì Chắt hoặc gì đó
//  Nếu ko chịu làm tiếp, mãi mãi nói ko làm..
//  VÔ SINH, KO THỂ NEW ĐC 1 OBJECT TỪ CHA, CON LUÔN, VÌ CẢ 2 KO ĐỦ CODE
// KO SINH ĐC OBJECT DO KHUÔN KO HOÀN HẢO !!!
public class Rectangle extends Shape {

    protected double a;
    private double b;

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
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
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner, color, borderColor, a, b, getArea());
    }

}
