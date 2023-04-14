package craftsman;

import data.Disk;
import data.Rectangle;
import data.RightTriangle;
import data.Square;
import data.Triangle;

public class Craftsman {

    public static void main(String[] args) {
        //cutShapes();
        //sortShapes();
        //playWithChildClass();
        playWithTriangles();
    }

    public static void playWithTriangles() {
        Triangle t1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        t1.paint();

        //RightTriangle rt1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        RightTriangle rt1 = new RightTriangle("MÁ", "PINK", 6, 8);
        rt1.paint();

        Triangle rt2 = new RightTriangle("BÉ NA", "RAINBOW", 6, 8);
        //  Tg          đc xem là, is a <-------TGV
        //khi chấm thì hàm của ai, quant trọng là khai báo gì
        //tao xem new RT() là, gọi tên tắt là TG
        //rt2. xổ ra toàn là TG
        rt2.paint(); //chấm Cha nhưng khi chạy là con
        //Cha ngồi im, Con qua mặt, Con được ưu tiên Cha Con trùng hành động
    }

    public static void playWithChildClass() {
        Square s1 = new Square("TÍA", "PINK", 3.0);
        //trong ram sẽ là: new Square() vùng Square được clone
        //                 new Rectangle() super() vùng Square có o, c, w, l = nhau
        s1.paint(); //lấy của Cha xài, xám nhẹ, ko đen đậm kiểu chính chủ
        //bị in ra RECT... in đúng nhưng ko hay, lí do xài đồ của Ba
        //thì theo Ba
        //muốn thừa kế gia sản ko, tao sang tên cho, học ngon đi Con

        //vi diệu tập 1
        Rectangle r1 = new Rectangle("MÁ", "PINK", 4.0, 5.0);
        r1.paint();

        //vi diệu tập 2
        Rectangle s2 = new Square("BÉ NA", "RAINBOW", 4.0);
        s2.paint(); //PAINT() CỦA CHỮ NHẬT, CHẠY THỬ COI
        //SQR CON ĐÃ QUA MẶT CHA, CHA NGỒI IM ĐỂ CON LO

    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        Rectangle rectArr[] = new Rectangle[9];
        Square s1 = new Square("MÁ", "PINK", 3.0);
        //9 biến Rect, rectArr[0]..... [8]
        //~~~ lớp có 30 ghế ngồi, nhưng chưa có bạn nào
        //rectArr[i] = cần lắm luôn 1 tọa độ vùng new/clone Student(...);
        //éo quan tâm new cũ mới, chỉ quan tâm tọa độ new Rectangle
        rectArr[0] = r1; //2 chàng 1 nàng
        //chứng minh
        //        rectArr[0].paint();
        //        rectArr[0].setOwner("TÍA YÊU!!!");
        //        r1.paint(); //TÍA YÊU
        rectArr[1] = new Rectangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[2] = new Rectangle("BÉ NA", "RAINBOW", 2.0, 1.0);

        //hình vuông sắp xếp vào chung mảng luôn
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);

        //HV LÀM SAO Ở CHUNG MẢNG CHỮ NHẬT ĐƯỢC, VÀ NGƯỢC LẠI, VÀ CÒNG TRÒN
        //CHÚNG TA KHÔNG CÙNG HỆ, CÙNG LOẠI, LÀM SAO CHUNG MẢNG
        //MẢNG KHAI BÁO NHIỀU BIẾN CÙNG KIỂU, V, TR, CN KHÁC KIỂU KO CHUNG MẢNG
        //KO CHUNG MẢNG, KO FOR TỰ ĐỘNG, KO SORT CHUNG
        //SORT RIÊNG 3 MẢNG NÓI LÀM GÌ   
        //CẦN 1 MẢNG GÌ ĐÓ CHỨA VUÔNG, CN, TR, .....- FOR CÁI GÌ ĐÓ, ĐẢO GÌ ĐÓ
        //SORT ĐC CẢ ĐÁM -> MẢNG GÌ ĐÓ LÀ CÁI GÌ???
        //muốn sắp xếp các obj thì phải vào chung mảng
        //vào chung mảng mới for chung được
        //???? arr[] = new ???[9]
        //arr[0] = new Rectangle(....);
        //arr[1] = new Square (...);
        System.out.println("The reactangle list before sorting");
//        for (Rectangle x : rectArr) {
//            x.paint(); //x = arr[i] x và [i] cùng trỏ vùng new Student()
//        } //cấm for hết mảng nếu mảng chưa full, CHỈ FOR ĐẾN CHỖ GÁN THẬT
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
        }
        System.out.println("After sorting");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }

    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();

        Square s1 = new Square("MÁ", "PINK", 3.0);
        s1.paint();

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "<3", 2.0);
        d1.paint();

    }

}
