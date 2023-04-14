package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        //có khuông r, lấy khuông ra để đổ info vào
        //i chang việc làm thẻ căn cước: lấy thông tin -> in lên thẻ
        //sau khi in xong có đc object thuộc nhóm vừa đó
        //đặt tên gọi tắt cho object để dễ dàng nói chuyện và tham chiếu đến

        Dog chiHu = new Dog("CHI HUA HUA", 2022, 0.9);
        //biến, tên tắt
        chiHu.bark();

        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2022, 60.5);
        ngaoDa.bark();

        //chiHu sủa trở lại
        System.out.println("Chi Hu Hu barks again");
        chiHu.bark();
        //nếu bark() ko mà ko gắn đối tường obj vào thì ai sủa    
        //HÀN ĐỘNG PHẢI GẮN VỚI OBJECT, THÔNG QUA DẤU CHẤM.

//new là xin vùng ram mới đủ chưá info của 1 Dog sẽ đc đúc, đc đổ data
//có 2 vung ram dành cho 2 object nên ngáo đá không đè lên chiahua
        System.out.println("After overweight");
        chiHu.setNewWeight(5.5);
        chiHu.bark();

        //hàm lấy get(), giống việc hỏi trực tiếp tên tuổi
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " + chYob);
        System.out.println("ND YOB" + ngaoDa.getYob());
    }
}
// code ở đây là bÊN ngoài giống như khung bị lủng
//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM VÀ BIẾN PHẢI ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJECT, THỰC THỂ SỐNG NÀO ĐÓ.

