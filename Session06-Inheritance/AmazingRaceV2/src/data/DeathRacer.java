package data;

//CLB CỦA NHỮNG GÃ THÍCH ĐUA ĐẾN CHẾT, GOM NHỮNG CLASS, OBJECT MÀ CÓ CHUNG 
//HÀNH ĐỘNG ĐUA, KO CARE CHUYỆN GÌ KHÁC
//CLB LÀ NƠI TẬP HỢP NHỮNG NGƯỜI CHUNG TIẾNG NÓI, HÀNH ĐỘNG, GIAO TIẾP/ INTERFACE
//CŨNG LÀ HÌNH THƯCS GOM KHUÔN, GOM OBJECT PHÂN LOẠI VỀ CÁI GÌ ĐÓ, NHÓM GÌ ĐÓ
//LỎNG LẺO HƠN KẾ THỪA, KO CARE ĐẶC ĐIỂM, DI TRUYÊN ĐĐ, CHUG HÀNH ĐỘNG VÀO 
//CHƠI CHUNG
//MOTOR, DOG, ...IS A MEMBER OF, IS A DEADRACER
//ANH EM MÌN LÀ STUDENT, SINH RA LÀ SV
//ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, CẦU THỦ, SÁT THỦ,... GAME THỦ
//ANH EM MÌNH NHÌN THEO DÒNG HỌ: CHÁU Ở NHÀ NGOAN LẮM
//1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON, HỘI NHÓM XÃ HỘI
//HỘI XÃ HỘI: CÙNG NHAU CHIẾN, LÀM GÌ ĐI!!!
//CLB chỉ quan tâm hành động, trong đây chỉ chứa hành động
//CLB để anh em tự mình hành động theo cách của mình
//vào CLB tiếng Anh mình speakEnglish theo giọng của mình!!!
//đua thì đua theo cách của mình: lạng lách, tháo thắng, tung mình trên yên xe
//cà chân chống tóe lửa,...
//Interface CLB để mọi người tự chơi theo cách của mình - chơi - hdoong là abstract
//CHỈ NÓI NỘI QUY CLB THOY HENG, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI
//CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT
//ko cần ghi ra từ khóa abstract ở cả tên cả clb và tên hàm
//VÌ CLB HÀM Ý/NGẦM HIỂU CHỈ CÓ NỘI QUY ĐỂ MỌI NGƯỜI THEO, NỘI QUY CHUNG CHUNG
//ĐỂ MỌI NGƯỜI THEO - IMPLEMENT - NGẦM HIỂU INTERFACE LÀ ABSTRACT
//ABSTRACT LÀ NÊU Ý TƯỞNG
//JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHƯNG...!!!
public interface DeathRacer {

    //phàm ai đã chọn nghề tham gia đua thủ, thì phải đua!!!
    //public abstract double runToDead(); //ko cần từ abstract
    public double runToDead(); //ko cần từ abstract

    public void showHowToDead(); //gáy bằng tổ quốc ghi công!!!

}
