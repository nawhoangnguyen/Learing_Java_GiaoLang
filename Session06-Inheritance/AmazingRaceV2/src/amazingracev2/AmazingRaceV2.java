package amazingracev2;

import data.*;
import java.util.*;


public class AmazingRaceV2 {
public static void main(String[] args) {
    runToDead();
    }
public static void playAnonymous(){
    //List list = new ArrayList();
    //abstract, interface đó, 20 hàm ko code
    List list = new List() {
        @Override
        public int size() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean isEmpty() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean contains(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Iterator iterator() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object[] toArray(Object[] a) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean add(Object e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean remove(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean containsAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean addAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean addAll(int index, Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean removeAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean retainAll(Collection c) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object get(int index) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object set(int index, Object element) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void add(int index, Object element) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object remove(int index) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public int indexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public int lastIndexOf(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public ListIterator listIterator() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public ListIterator listIterator(int index) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public List subList(int fromIndex, int toIndex) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
}



    public static void runToDead(){
        Dog d1 = new Dog("NGÁO ĐÁ", 2021, 50.0);
        //chấm full hàm của Con, đủ code hàm Cha, CLB
        
        //@onthego
        DeathRacer mnnCTT = new DeathRacer() {
            //VÙNG KO GIAN CỦA CLASS MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG
            //VÙNG NÀY CHÍNH LÀ PHẦN MỞ RÔNGJ CỦA CHA/CLN
            //BA SẼ LÀ CÁNH CHIM (new/super() new DeathRacer) 
            //đưa con extends/implement thật xa thật nhiều
            //ta có quyền làm như truyền thống ,thêm đặc điểm...
            //đừng lạm dụng, on-the-go thì nên quan tâm phần đang tham gia
            public static final double MAX_SPEED = 50;
            
            @Override
            public double runToDead() {
            return new Random().nextDouble() * MAX_SPEED * 3;
                    }
//annonymous làm biếng tạo class rời cho cả abstract class và interface
            //bên abstact thì ta còn có đặc điểm của cha cho để xài
            //annonymous của interface, đua thì đua đi, hỏi han làm chi, hok có info
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|2015|%5.1f|\n", 
                                  "MERMAID-RACER","MNN CTT",runToDead());
            }
        };
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        //chấm full hàm Cha, Khai Cha, chạy ko sợ vì đa hình Con qua mặt
        //tổ lái con trỏ được, new Dog mà sợ gì
        //tao là "danh nghĩa Cha" thì chỉ xổ Cha hoy, học ồi
        //mày biết bố tao là ai ko???, hù theo kiểu Bố
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        //ngộ nhỡ dấu chấm thì sao???
        //chấm chỉ xổ full CLB,2 hàm runToDead() showHowToDead()
        //tao là đua thủ chỉ quan tâm đua thoy
        //chạy éo sợ vì Con qua mặt, có đủ hàm Override đã làm rồi, đa hình tiếp
        //ép con trỏ đc luôn, new Dog mà sợ gì
        
        Motor m1 = new Motor("EXCITE", "150.0 CM3", "59F9-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0 CM3", "59F6-79797");
        
        //mnn em vẫn là một Racer, có hành động đua gấp 3 lần giới hạn
        //vật lí của người cá, em xứng đáng gia nhập clb đua
        DeathRacer racer[] = {mnnCTT,d1, (Dog)d2, d3, m1, m2};
        //racer[0] = new Dog(...);
        //racer[1] = new Dog(...);
        //toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowTo()
        //Con tự lo, Con Motor chạy theo Motor, Con Dog chạy theo Dog
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}
// INTERFACE CŨNG LÀ 1 DẠNG CLASS "CHA", VÌ CLASS LÀ GOM NHÓM VÀ ĐẶT TÊN NHÓM
//"CHA" NÀY CHỈ CÓ CÁC HÀNH ĐỘNG(ABSTRACT, KO CODE, JDK 8-9 CHO PHÉP COS CODE ĐẶC BIỆT)
//ĐÁM "CON", MEMBER CÓ NHIỆM VỤ TRIỂN KHAI/THI HÀNH HÀNH ĐỘNG CỦA "CHA"
//INTERFACE LÀ CLB CÓ NỘI QUY CHUNG CHUNG 
//INTERFACE LÀ NHỮNG TỔ CHỨC/HIỆP HỘI CUNG CẤP NHỮNG TIÊU CHUẨN TCVN LIỆT KÊ NHỮN
//NHỮNG HỘI VIÊN/CON PHẢI CÓ NHIỆM VỤ IMPLEMENTS TẤT CẢ
//HIỆP HỘI ĐO LƯỜNG TCVN ĐƯA RA TIÊU CHÍ VỀ ATTP (nồng độ/hàm lượng chất bảo quan trong tp)
//Các cơ sở sx căn theo tiêu chuẩn này làm các sản phẩm HVN CLC

//INTERFACE LÀ BỘ QUY TẮC HÀNH XỬ, CAM KẾT AI ĐÓ PHẢI CẦN THEO
//CỤ THỂ LÀM THẾ NÀO THÌ MỖI HỘI VIÊN PHẢI LO/LÀM

//*ỨNG DỤNG CỦA INTERFACE
//-Giúp 1 class/object có nhiều cách hành xử khác nhau, tui là member của Hội nào thì tui có hành 
//động của Hội đó, giúp cho 1 object/con người đóng nhiều vai, vai nào thì có hành động tương ứng
//Chính là 1 "hình dạng" của đa kế thừa -multi-inheritance
//-Trong java 1 class con chỉ có tối đa 1 cha - đơn kế thừa, extends đúng 1 class Cha, single-
//inheritance. C++ nhiều Cha, đa kế thừa
//Cha1: hàm f()... có code
//Cha2: hàm z()... hàm f() có code
//Cha3: hàm f()... có code
//Nếu con kế thừa cả cha 1, cha2, cha3
//hỏi rằng con chấm f() lấy hàm của Ai??????
//-> Tang gia bối rối, ambigous, gọi ai bây giờ vì ai cũng có hàm f()

//Java fix bằng cách: Con chỉ kế thừa duy nhất 1 Cha 
//Cha hàm f() có code hay ko ko care
//Con kế thừa chỉ Cha, chấm f() thì????. Cha có f() có code xài luôn
//                                      abstract f() thì Con phải code, chấm chạy luôn@
//Nhưng C++ đa kế thừa Con có quyền có bị ảnh hưởng bởi nhiều Cha, mỗi Cha cho 1 tí hàm
//Con sẽ đa dạng hành động từ các Cha
//Nay Java Con 1 Cha, nhưng lại đc quyền tham gia nhiều CLB!!! INTERFACE
//         Con 1 Cha, nhưng vào chơi nhiều CLB, chơi CLB nào thì có hđ CLB đó, vẫn đảm bảo tiêu chí
//Con có nhiều hành động từ bên ngoài, giống như con có hdd từ nhiều Cha
// Interface/CLB C1 hàm abstrac....f() ko code
//               C2 hàm abstract...f() ko code
//               C3 hàm abstract...f() ko code

//Con extend Cha như bt, implements/tham gia CLB C1, C2, C3
//                       Con ơi mày phải có code ngay f()
//                          @override f()
//KO CÒN BỐI RÔIF() VÌ CHỈ CÓ DUY NHẤT 1 PHIÊN BẢN CODE F()
//INTERFACE CŨNG LÀ 1 DẠNG CỦA "KẾ THỪA" HÀNH ĐỘNG, CHUNG HÀNH ĐỘNG
//INTERFACE LÀ BỘ QUY TẮC HÀNH XỬ/ỨNG XỬ/CAM KẾT AI ĐÓ THAM GIA THÌ THÌ PHẢI THEO HÀNH ĐỘNG
//ĐÃ CAM KẾT NHƯNG SÁNG TAỌ TRONG HÀNH ĐỘNG(IMPLEMENT)

//*CODE VIẾT SAO?
//public class Con/Hội-Viên implements CLB1,
//Lưu ý: 1 con tối đa 1 Cha nhưng nhiều CLB
//@override tất cả các hành động của các CLB, tham gia nhiều thì phải hoạt động nhiều;
//}
//CLB ko có đặc điểm cho nên ko có phễu/constructor- Nhưng có hàm abstract. Nhưng khi new Con
//thì CLB vẫn sẽ được new để "Ba" sẽ là cánh chim, đưa Con extends @override
//Member/Con vẫn có 1 vùng RAM của CLB - chứa hàm abstract, con trỏ vẫn trỏ lưng chừng CLB
//vẫn @override vì Con có hàm trùng tên Cha và có code tự làm
//Vẫn theo mô hình RAM của abstract class/Cha truyền thóng. Con to hơn Cha/CLB về vùng RAM
//super() Cha CLB là super() ngầm
//@override tất cả hành động của Cha
//@override tất cả các hành động của các CLB, tham gia nhiều thì phải hoạt động nhiều;
//}

//Con đóng N vai: vai dòng họ, vai CLB, giống ngoài đời
//Nếu xui Cha, CLB có cùng tên hàm f() ngoài những hàm khác, thì Con có bị bối rối ko?
//Con ko bối rối, vì f() của Cha và các CLB toàn là abstract, Con phải cài code @override
//duy nhất hàm f() éo sợ ambigous
//đường nào con cũng @ qua mặc cha, clb để xài con, các cha và clb chỉ nói mà không làm!!!

//ANNONYMOUS
//object vãng lai tham gia CLB, vậy mày cũng phải hành xử như việc mày tham gia thường xuyên
//phải có hành động tương ứng mới được tham gia, chỉ mgay lúc đó thoy, ON-THE-GO

//GHÉ NGANG MÀ CHƠI, THÌ PHẢI CHƠI/HÀNH XỬ NHƯ NGƯỜI TA ĐANG CHƠI

//bản chất ta có 1 nhóm nào đó trước đó, nhưng tả chỉ cần HÒA NHẬP LÚC NÀY, CHƠI LÚC NÀY, THAM GIA
//LÚC NÀY, KO CẦN BỘC LỘ RÕ TRƯỚC ĐÓ TA LÀ AI, NHÓM NÀO, CHỈ CẦN BIẾT JOIN NHÓM MỚI LÚC NÀY
//cắt 1 hình ngẫy nhiên(object rồi đó) mà ko biết tên gọi riêng của nhóm là gì/class gì
//gọi theo tên phân loại chung, nhóm Cha chung -> ọnect thuộc class CHƯA XÁC ĐỊNH, object thuộc class
//ANNONYMOUS
//Căn theo Cha/phân loại chung mà gọi. Hình ngẫu nhiên đó gọi là HH
//Shape x = new Shape(...){
//@override
//Hàm của phân loại chung, class cha abstract;
//};
//~~~ Shape r = new Rectangle(...); //khi đã biết object thuộc nhóm rõ ràng trước đó Rectangle
//CLBCờ x = new Student(..); //một sinh viên tham gia CLB cờ - Code sẵn @override
//DeathRacer m = new Motor(...) //motor đi học còn tham gia đua code sẵn runtodead(....)@override
//gã ghes ngnag, ko chuyên nhưng ham vui, chơi thì chơi
//CLBcờ hãngom = new CLBCờ {
//@
//Mày ham chơi, ghé ngang tham gia, thì cos hành động tương ứng;
//};

//ABSTRACT CLASS VÀ INTERFACE ĐỀU LÀ 2 THỨ KO HOÀN HẢO, CHỈ NÓI MÀ KO TRIỂN KHAI LÀM
//CON/MEMBER CÀN PHẢI HOÀN TẤT NỐT CÂU CHUYỆN KO HAONF HẢO @OVERRIDE

//DÙNG THÊM KĨ THUẬT MƯỢN GIÓ BẺ MĂNG, MƯỢN CHA, CLB ĐỂ NEW RA OBJECT THUỘC NHÓM CHA/CLB
//                                              @OVERRIDE ON THE GO, TAKE-AWAY
//OBJECT VÃNG LAI, KO XÁC ĐỊNH NHÓM TRƯỚC MÀ MÚN THAM GIA CUỘC CHƠI, DÒNG HỌ, THÌ PHẢI HÀNH XỬ
//CƯ XỬ NHƯ DÒNG HỌ, MEMBER
//KO ỌI CHÍNH XÁC NHÓM CỦA BẠN, NHƯNG GỌI BẠN THEO NHÓM BẠN THAM GIA, THEO NHÓM BẠN CHƠI ĐƯỢC MÀ
//VÙNG RAM VÀ MỌI HÀNH XỬ CHẤM @ QUA MẶT NHƯ BÌNH THƯỜNG, DO LÀM BIẾNG TẠO CLASS RỜI - CONCRETE CLAS

//ỨNG DỤNG CỦA INTERFACE
//-LOOSE COUPLING (GẮN KẾT LỎNG LẺO) GIÚP CHO CÁCH TỔ CHỨC CÁC CLASS CÓ RÀNG BUỘC NHAU ĐỂ 
//LÀM NÊN CÂU CHUYỆN NHƯNG LẠI DỄ DÀNG MỞ RỘNG VÀ THAY ĐỔI
//-DÙNG INTERFACE LÀ CÁCH VIẾT CODE GIÚP LINH HOẠT, DỄ DÀNG THAY ĐỔI CODE MÀ KO PHẢI SỬA PHẦN CODE CŨ
//, DÙNG DỄ DÀNG MỞ RỘNG CODE, THÍCH ỨNG CHO TƯƠNG LAI...
//-INTERFACE LÀ CÁCH KẾT GIAO, MỞ RỘNG GIAO TIẾP KẾT NỐI VỚI XUNG QUANH
//-COMPARABLE/COMPARATOR -> DÍNH ĐẾN LOOSE COUPLING

//*MỤC TIÊU CUỐI CÙNG/TỐI THƯỢNG CỦA INTERFACE: LÀ ĐỂ CHƠI CHUNG VỚI NHAU!! DÙ BẠN KHÁC BIỆT TRONG HÀNH XỬ
//MỖI THẰNG ĐUA KHÁC NHAU, NHƯNG CÙNG ĐƯỜNG ĐUA
//MỖI THẰNG HÚT KHÁC NHAU, NHƯNG CÙNG CLB PHÊ CẦN
//MỖI BẠN ĐÁNH CỜ KHÁC NHAU, NHƯNG CÙNG VÁN CỜ
//MỖI CARD ĐỒ HỌA KHÁC NHAU VỀ NĂNG LỰC XỬ LÍ, NHƯNG CHUNG KHE PCI-EX
//MỖI THIẾT BỊ ĐIỆN KHÁC NHAU VỀ CÔNG NĂNG/TÍNH NĂNG SỬ DỤNG, NHƯNG CHUNG Ổ CẮM 220V