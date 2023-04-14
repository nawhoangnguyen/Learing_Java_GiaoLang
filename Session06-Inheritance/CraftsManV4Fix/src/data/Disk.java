/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author USER
 */
public class Disk extends Shape{
     public static final double PI = 3.14;
    private String smile; //<3,
    private double radius;

    public Disk( String owner, String color, String borderColor,String smile, double radius) {
        super(owner, color, borderColor); //1st Ba sẽ là cánh chim, đưa Con extends
        this.smile = smile;               //cắt 1 HTr chính là cắt 1 HH
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" + "smile=" + smile + ", radius=" + radius + '}';
    }

    @Override
    public double getArea() {
        return (radius * radius) * Disk.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius;
    }

    @Override
    public void paint() {
        System.out.printf("|Disk |%-10s|%-10s|%-10s|%3s|%4.1f|%7.2f|\n",
                    owner, color, borderColor, smile, radius, getArea());
    }
    
}
