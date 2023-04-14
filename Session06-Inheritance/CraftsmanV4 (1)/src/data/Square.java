/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
 
/**
 *
 * @author Admin
 */

//Nên kế thừa ai??
//Shape: khai báo cạnh edge, phễu (super, đảo thứ tự biến nếu muốn)
//  get/set()
//  BẮT BUỘC PHẢI IMPLEMENTS

// ngon: Kế thừa mẹ nó Rectangle
//  Shape: là ông nội, cây gia phả xuất hiện

public class Square extends Rectangle {
    
   

    
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
        
    }

    
    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f|----|%7.2f|\n",
                            owner, color, borderColor, a, getArea());
    }
    

    
    
  
    
    
    

    
    
}
