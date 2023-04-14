/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package craftsmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

/**
 *
 * @author Admin
 */
public class CraftsmanV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithShapes();
        sortShapes();
    }
    
    public static void sortShapes() {
        
        
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6.0);
        Shape d2 = new Disk("BÉ NA", "REAINBOW", "BORDEAUX", "<3", 6.0);
        
        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);
        
        //ta có thể khai báo 9 hình này đều là SHAPE, CỰC ĐẸP KHI NHÌN ĐỘI HÌNH
        //ĐỒNG NHẤT 
        //IN KẾT QUẢ KHI SORT DIỆN TÍCH
        
        System.out.println("THE BOX BEFORE SORTING\n");
        r1.paint(); //HÀM CỦA ?? CHẠY THẾ NÀO > CON, CON
        r2.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > CHA, CON OVERRIDE
        s1.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > CON, CON  
        s2.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > CHA, CON QUA MẶT  
        s3.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > ÔNG NỘI, CHÁU QUA MẶT  
        d1.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > CON, CON  
        d2.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > CHA, CON
        t1.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > CON, CON  
        t2.paint();//HÀM CỦA ?? CHẠY THẾ NÀO  > CHA, CON QUA MẶT
        
        System.out.print("\n\nTHE BOX AFTER SORTING\n\n");
        
        
//        Shape[] box = new Shape[9];
//
//        box[0] = r1;
//        box[1] = r2;
//        box[2] = d1;
//        
        
        Shape box[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};
        
        for (int i = 0; i < box.length - 1; i++) 
            for (int j = i + 1; j < box.length; j++) 
                if (box[i].getArea() > box[j].getArea()) {
                    Shape t = box[i];
                    box[i] = box[j];
                    box[j] = t;
                }
        
        for (Shape x : box) {
            x.paint();
        }
            
        
    
            
    }
    
    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);
        
        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", "<3", 6);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", ":x", 6);
        
        r1.paint(); //Con, RECTANGLE
        r2.paint(); //Cha, khi chạy qua mặt CHA, RECTANGLE, CHA éo có code kìa
        d1.paint(); //Con , DISK
        d2.paint(); //Cha, qua mặt cha
                
        
        //.PAINT chính là tính đa hình(POLYMORPHISM)
    
    }    
}
 
