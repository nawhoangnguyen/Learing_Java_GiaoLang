package data;

public class Triangle {

    protected String owner;
    protected String color;
    protected double a, b, c;
    
    //nếu đưa 3 cạnh cà chớn thì sao???
    //tổng 2 cạnh bk phải lớn hơn cạnh kia, bắt buộc
    //có 3 cách xử lí: chặn nhập từ Scanner, trước khi dổ
    //                 default, mày cà chớn mày default
    //ném vào mặt mày cái ngoại lệ, chủ động bảo JVM giết app đi
    //kĩ thuật cấm new
    //int yob = sc.nextInt();
    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "owner=" + owner + ", color=" + color + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    //toàn bộ các hàm + phễu ở trên quá quen
    //1 nhóm dev quyết định làm 1 thư viện class riêng giống Scanner, Math
    //và giúp ta loại bỏ hết đoạn code ở trên khi tạo class
    //chỉ gõ vài dòng là tui mún có cst, get(), set() là xong
    //khi F6, thư viện này sẽ tự động generate ra đoạn code nhàm chán ơ trên
    //thư viện LOMBOK
    public double getPerimeter() {
        return a + b + c;
    }

    public Double getArea() {
        //cthuc Heron: sqrt(p * (p - a) * ); p = (a + b + c) / 2
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
     
    public void paint() {
        System.out.printf("|TRIANGLE |%-15s|%-10s|%4.1f|%4.1f|%7.2f|%7.2f \n", 
                                   owner, color, a, b,c, getArea());
    }
}
