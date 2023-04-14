package craftsmanv4fixed;


import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class CraftSmanv4fixed {

    public static void main(String[] args) {
        //playWithShapes();
        //sortShapes();
        //playWithAnnonymousClass();
        sortShapesWithAnnonymous();
    }
       public static void sortShapesWithAnnonymous() {
           Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
               @Override
               public double getArea() {
               //cắt hình ngãu nhiên, ko gọi được là hình gì, S phải tự đo
               return 50;
               }
               
               @Override
               public double getPerimeter() {
               return 40;
               }
               
               @Override
               public void paint() {
                   System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n",
                           "TAKE-AWAY", owner, color, borderColor, " ", " ", getArea());
               }
           };
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);//khai ông nội new cháu
        //cùng gen di truyền dòng họ luôn

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 2.0);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", ":x", 1.0); //in tất cả xem sao
       

       
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, onTheGo};
        //                     box[0]  [1]
        //n chúng ta về chung 1 nhà rồi
        
        //ĐA HÌNH ĐẸP NÈ
        System.out.println("The list of shapes:");
        for (Shape x : arr) {
            x.paint();
        }
        //sắp xếp tăng dần theo S
        for (int i = 0; i < 8-1; i++) {
            for (int j =i +1 ; j < 8; j++) {
                if(arr[i].getArea() > arr[j].getArea()){
                    Shape temp =arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("The list of shapes sorting ascending by area");
        for (Shape x : arr) {           
            x.paint();
        }
    }
    
    public static void playWithAnnonymousClass(){
        //Shape vangLai = new NonName(....); //bên trong phải full code cho Cha
        //Shape x       = new HCN(....);
        //CẮT NGẪU NHIÊN LÀM SAO BIẾT BAO NHIÊU CẠNH MÀ ĐƯA VÀO??
        //CHỈ ĐƯA ĐƯỢC MÀU, TẶNG AI
        //NẾU MUNS RÕ RÀNG THÌ CẮT V, TR, CN, TGI, HBH, MÙI TÊN,....
        Shape vangLai = new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
            @Override
            public double getArea() {
            return 50; //vì hình cụ thể, ko theo hình dạng nào, ta tự do
                    }
            
            @Override
            public double getPerimeter() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
            @Override
            public void paint() {
            //khai báo là  Con Shape vẫn kế thừa như bt
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|\n", owner, color, borderColor, getArea());
            }
        }; //VIP
        //mày là 1 hình thoải mái vào mảng Shape sort nếu mún
        //mày vẫn là Shape, kiểu Shape, có đủ code cho hàm Cha
        //kĩ thuật mượn gió bẻ măng, mượn Cha tạo Con, mượn Shape new Con
        //NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH GÕ CODE OVERRIDE
        //THỎA CÔNG THỨC CON = NEW CHA + @OVERRIDE
        //CHỈ XÀI CÁCH NÀY NẾU CHỈ CẦN LÀM 1 OBJECT ON THE GO, MÀ LÀM BIỀNG
        //LÀM KHUÔN CON RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN
        vangLai.paint();
    }

    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5, 8);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6, 5);

        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 8);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 6);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 7);//khai ông nội new cháu
        //cùng gen di truyền dòng họ luôn

        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", ":x", 6);

        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3.0, 4.0, 5.0);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6.0, 8.0, 10.0);

        //in tất cả xem sao
        r1.paint(); //Con new Con
        r2.paint(); //Ông Nội new Con
        s1.paint(); //Con new Con
        s2.paint(); //Cha new Con
        s3.paint(); //Ông Nội new Cháu
        d1.paint(); //Con new Con
        d2.paint(); //Ông Nội new Con
        t1.paint(); //Con new Con
        t2.paint(); //Ông Nội new Con

        //CHẤP TẤT CẢ, CON CÓ CODE, CHÁU CÓ CODE SẼ CHẠY QUA MẶT ÔNG NỘI
        //cùng là hàm paint() nhưng có N cách chạy/implement khác nhau tùy ngữ
        //cảnh(nếu Con Con qua mặt, Cháu Cháu qua mặt Cha, Ông Nội)
        //từ 1 hàm paint() ánh xa ra N cách viêt code/implement/thực thi lúc chạy
        //gọi là hiện tượng đa ánh xạ, đa hình dạng, 50 sắc thái, đa nhân cách
        //thiên biến vạn hóa, transformer,
        //TÍNH ĐA HÌNH (DẠNG) CỦA 1 CÁI TÊN HÀM, GIÚP LINH HOẠT VIẾT CODE, DỄ MỞ
        //RỘNG CODE THEO TÌNH HUỐNG NGỮ CẢNH (V THEO V, TR THEO TR, CN THEO CN)
        //VẪN GỌI CHUNG 1 TÊN GỌI PAINT()TỪ TỔ
        //KĨ THUẬT ĐA HÌNH DẠNG CÀI ĐẶT VÀ CHẠY KIỂU NÀY, KĨ THUẬT LINH HOẠT
        //NÀY ĐƯỢC GỌI LÀ TÍNH ĐA HÌNH - POLYMORPHISM
        //sắp xếp tăng dần theo S
//      Shape[] box = new shape[9]; //có 9 hình sẽ được cắt, hình mẹ nào từ từ
//      //box[0] = new Rectange(), new Square disk ....
//      box[0] = r1;
//      box[1] = r2;
//      box[2] = d1;
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};
        //                     box[0]  [1]
        //n chúng ta về chung 1 nhà rồi
        
        //ĐA HÌNH ĐẸP NÈ
        System.out.println("The list of shapes:");
        for (Shape x : arr) {
            x.paint();
        }
        //sắp xếp tăng dần theo S
        for (int i = 0; i < 7-1; i++) {
            for (int j =i +1 ; j < 7; j++) {
                if(arr[i].getArea() > arr[j].getArea()){
                    Shape temp =arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("The list of shapes sorting ascendin by area");
        for (Shape x : arr) {           
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
