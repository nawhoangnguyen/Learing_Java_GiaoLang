package data;

//Chơi thêm kế thừa, Motor is a kind of Vehicle (abstract class)
import java.util.Random;
//MOTOR MUA VỀ CHẠY ĐI HỌC, CHUYỆN BÌNH THƯỜNG, HÀM RUN()
//NHƯNG TRÊN ĐƯỜNG THẰNG VỚ VẨN NÀO ĐÓ NÓ NẸT-PÔ, MÌNH KÉO TAY GA MẠNH HƠN
//BỐC ĐẦU, VỌT XE, TỐC ĐỘ PHẢI DỮ HƠN BÌNH THƯỜNG, LÚC NÀY NGOÀI VIỆC MOTOR
//THÔNG THƯỜNG, TA CÒN LÀ ĐUA-THỦ NỮA, PHẢI LÀ ĐUA THỦ MỚI CÓ TỐC ĐỘ CAO
//GIA NHẬP HỘI ĐUA THOY, CHỈ ĐAU HOY
//TỚ CÒN LÀ 1 ĐUA-THỦ, KO DÙNG TỪ KHÓ EXTENDS, XÀI TỪ LÀ 1 MEMBER CỦA
//                                                      IMPLEMENTS
//                                          TỚ THAM GIA CLB, TRIỂN KHAI VIỆC ĐUA
//THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
//IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐAU MÀ KO CHỊU ĐUA SAO ĐC
//@OVERRIDE
//CLASS CHÍNH CỦA CHÚNG TA CỨ CÓ ĐẠC ĐIỂM HVI NHƯ BT
//CHÚNG TA THAM GIA CLB NÀO THÌ CÓ THÊM HDD CỦA CLB ĐÓ, @OVERRIDE HĐ ĐÓ
//TRONG TA CÓ NHIỀU HÀNH ĐỘNG ỨNG VỚI TỪNG CLB TA THAM GIA, HỢP LÍ NGOÀI ĐỜI
//ĐI VỚI BỤT MẶC ÁO CÀ SA, ĐI VỚI MA MẶC ÁO IAAYS
//VỀ LOGIC, TA CÓ THỂ THAM GIA N CLB, NHƯNG TA CHỈ CÓ 1 DÒNG HỌ
//TRONG JAVA, 1 CON TỐI ĐÃ 1 CHA, ĐƠN KẾ THỪA
//            1 CON THAM GIA N CLB, VẬY SẼ CÓ HD CỦA N CLB

//C++, 1 CON NHIỀU CHA LUÔN, ĐA KẾ THỪA!!!
public class Motor implements DeathRacer {

    public static final double MAX_SPEED = 180;
    private String model;  //Exciter 2021, Winner 2020
    private String volume; //số phân khối 125.0cm3
    private String vin;    //biển số, số khung, Vehicle Identifier Number

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }

    //hành vi xe máy là chạy, cos tốc độ được ghi nhận
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }                   //chạy ngẫu nhiên và ko quá 180 km

    //quay video và gáy tốc độ
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%-11s|%5.1f|", "MOTOR", model, volume, vin, run());
    }

    @Override
    public double runToDead() {
        //CHẠY tốc dộ cao hoy, dôn nong, xoáy nòng, ép dên, đôn dên
        return run() * 3; //run() giả sử được 150 x 3 đua đến chết còn gì?!
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%-8s|%-11s|%5.1f|\n",
                "MOTOR-RACER", model, volume, vin, run());
    }

}
