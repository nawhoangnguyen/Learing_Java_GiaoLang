
package data;
//Nên kế thừa ai??
//Shape: khai báo cạnh edge, phễu (super, đảo thứ tự biến nếu muốn)
//  get/set()
//  BẮT BUỘC PHẢI IMPLEMENTS

// ngon: Kế thừa mẹ nó Rectangle
//  Shape: là ông nội, cây gia phả xuất hiện


//Nếu V kế thừa Shape: khai báo edge, viết code cho 3 hàm của Cha
//                                    implement all abstract methods
//              HCN: ko khai báo gì, trừ phi muốn khác HCN vài đđ
//                                   ko cần làm 3 hàm luôn Cha CN lo giùm
//                                   nếu muốn chỉ cần duy nhất paint() là đủ
//                                   Shape là Ông Nôi, cây gia phả
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
    

    
    
