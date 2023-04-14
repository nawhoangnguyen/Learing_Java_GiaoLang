/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Admin
 */
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;
    
    //protected double a, b, c, radius,..;
    //ko được đưa cạnh vào đây vì:
    //chúng sẽ kế thừa hết các cạnh, do đó HV sẽ có nhiều cạnh, bán kinh
    //tròn thừa kế luôn cả cạnh
    //DỊ BIỆT THÌ PHẢI Ở TỪNG ĐỨA CON

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
    
    
       
    
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
    
            
    
    //diện tích và chu vi ko được xem là đặc tính, mà phải xem là hành vi
    //2 hàm tính S và P ở đâu? Con hay Cha, hay cả 2??
    //CẢ HAI: VỪA DI TRUYỀN, VỪA DỊ BIỆT
    
    //HÀM TRỪU TƯỢNG
//    public double getArea() {
//        return
//    }
//    
//    public double getPerimeter() {
//        return
//    }
    
   
        
    
    
}
