/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author USER
 */
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;
    //protected double a, b, c, radius;
    //ko được đưa các cạnh vào đây vì:
    //chúng sẽ kế thừa hết, do đó HV sẽ có cạnh, nhiều nữa là khác, bk
    //tròn ,ngoài bk, thừa kế luôn cả cạnh
    //bk, canh là của  RIÊNG TỪNG ĐỨA CON, DỊ BIỆT THÌ PHẢI Ở TỪNG ĐỨA CON
    
    //CHA LÀ NHÂN TỬ CHUNG CHO CÁC CON, NGOÀI ĐỜI Y CHANG

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
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

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    public void Paint(){
         
    }
    //diện tích và chu vi không được xem là đặc tính, mà xem là hành vi
    //2 hàm tính S và P để ở đâu?? Con hay Cha, hay cả 2???
    
//    public double getArea(){
//        
//    } 
//    public double getPerimeter(){
//        
//    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
    //tao chỉ nói rằng HH có thứ này, còn mỗi đứa V,TR,Cn tự lo đi
    
    //CHA LÀ NHÂN TỬ CHUNG CỦA CÁC CON
    //ABSTRACT: KHÁI NIỆM, NÓI THOY, CHƯA CẦN CỤ THỂ
    //ABSTRACT CLASS: LÀ SỰ PHÂN LOẠI TRONG CUỘC SỐNG, TRONG TỰ NHIÊN
    //ĐỂ DỄ DÀNG NÓI VỀ CÁC OBJECT. XẢY RA CỰC NHIỀU TRONG C/S
    
}
