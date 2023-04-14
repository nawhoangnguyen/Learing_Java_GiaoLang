package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
       
        Dog chiHu = new Dog("CHI HUA HUA", 2021, 0.9);           
                chiHu.bark();
                
                Dog ngaoDa = new Dog("NGÁO ĐÁ", 2021, 60.5);
                       ngaoDa.bark();
                       
                       
             //tui muốn show toàn bộ info của tui, theo cách mới, cách toString()
             //object có nhiều hành động
        
       System.out.println("Show all info by using toString - a new behavior");
       String chDetails = chiHu.toString();
                   System.out.println("CH Details: " + chDetails.toString() );
                   System.out.println("NĐ Details: " + ngaoDa.toString());
         //hàm toString() rất đặc biệt, @Override
         //mục tiêu là show ra all of info đã đổ vào, hoăc chỉnh sửa
         //y chang như mở setting trong phone xem phần info đt
         System.out.println("Play with toString() - GỌi THẦM TÊN EM");
         System.out.println(chiHu);//chiHu là biến object, lưu tọa độ vùng new
                                   //lí thuyết in ra địa chỉ, thực tế J thì gọi là toString()
         System.out.println(ngaoDa);
         //NẾU KHUÔN KHÔNG CÓ HÀM TO STRING THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI
         //HAY GỌI TRỰC TIẾP, JVM, SẼ TỰ ĐỘNG SHOW RA CÁI VÙNG RAM CỦA OBJECT THÀNH CON SỐ HEXA
         //HASH NUMBER, NÉN TOÀN BỘ DÂT THÀNH 1 CON SỐ, MD5, SHA-256,...
         ngaoDa.getAge();
         System.out.println("NĐ age: " + ngaoDa.getAge());
         //xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm

    }   
}
// code ở đây là bÊN ngoài giống như khung bị lủng
//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM VÀ BIẾN PHẢI ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ SỐNG NÀO ĐÓ.
  