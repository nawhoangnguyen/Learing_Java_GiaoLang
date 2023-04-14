/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import data.Student;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

/**
 *
 * @author USER
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        //playWithArrayList();
//        //sortArrrayListManually();
//        //playWithSet();
//
////    Student xxx = searchStudent("se12345");
////    if (xxx != null) //trả về đc 1 tọa độ, hồ sơ sv thì in ra
////    xxx.showProfile();
////    else
////            System.out.println("not found!!!!");
//        // sortStudentList();
//        List<Student> arr = initData(); //arr này đang trỏ vùng new tròng ArrayList() trong hàm đấy
//        System.out.println("The student list");
//        for (Student x : initData()) {//tao new 1 cái Giỏ, add sẵn đồ, ném ra
//            x.showProfile(); // 5 4 8 9 2
//
//        }
////        for (Student x : arr) {
////            x.showProfile();//5 4 8 9 2
////        }
//    }
    public static void main(String[] args) {
        List<Student> arr = initData();
        Student xxx = searchAStudent(arr, "se88888");
        if (xxx == null)
            System.out.println("Not found!!!");
        else{
            //xxx đang trỏ vùng new Student TÁM
                  xxx.showProfile(); 
                  //SỬA INFO VÌ CON TRỎ TA MÓC VÀO ĐC VÙNG NEW
                  xxx.setGpa(6868);
        }
        System.out.println("Check the student list after updating student SE8");
        for (Student x : arr) {
            x.showProfile();//6868
        }
    }

    //tên hàm trả về tương đương 1 giá trị. double <- sqr(number) {...}
    //                                      double result = sqrt(4);
    //            List<Student> arr
    public static List<Student> initData() { //tên hàm initData() chính
        //là 1 con trỏ vùng new 
        //ArrayList()
        //trong vùng Túi này có đồ gì, tính sau
        List<Student> arr = new ArrayList<>(); //1 cái Túi rỗng

        arr.add(new Student("SE55555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE44444", "BỐN PHẠM", 2003, 4.4));
        arr.add(new Student("SE88888", "TÁM TRẦN", 2003, 8.8));
        arr.add(new Student("SE99999", "CHÍN NGUYỄN", 2003, 9.9));
        arr.add(new Student("SE22222", "HAI LÝ", 2003, 2.2));
        //return arr //bên trong này !!!!! arr đã new ArrayList() add Student r
        return arr;

    }

    //BÀI HOÀN HẢO VỀ SEARCH, SORT, UPDATE
    //CHƯA TƯ DUY OOP, CHỈ MỚI LÀ THỬ NGHIỆM ĐỂ CHẠY
    //TƯ DUY OOP, MỌI HÀNH ĐỘNG/ĐĐ PHẢI GOM VỀ OBJECT, ENCAPSULATION
    //TƯ DUY OOP -> CÁI TỦ, ĐÃ HỌC RỒI
    //            Student x; tên hàm tương đương chính là biến con trỏ
    //                       tên hàm = tọa độ 1 vùng new Student nào đó là okie
    //                       trả về tham chiếu đến hồ sơ
    //                       return 1 tọa độ 1 vùng new
    //                       tọa độ đang nằm trong thẻ bài của arr
    //đưa 1 cái túi có sẵn SV bên ngoài đưa vào trong hàm
    //arr ở tham số hàm bản chất lại là 1 con trỏ, tham chiếu đến 1 cái
    //Túi new ở đâu đó. Kĩ thuật truyền tham chiếu/con trỏ/pass by reference
    //
    //TA SẼ LÀM CÁI HÀM TRẢ VỀ DANH SÁCH SV LUÔN, DÙNG NÓ NHƯ LÀ CÁI TÚI
    //CUNG CẤP DATA CHO MỌI HÀM KHÁC ĐỂ XỬ LÍ
    public static Student searchAStudent(List<Student> arr, String id) {
        if (arr.isEmpty()) {
            return null; //éo có sv, tìm làm gì, null đi cho rồi, trỏ đáy ram
        }//có sv rồi here
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            String tmpId = tmp.getId();
            if (tmpId.equalsIgnoreCase(id)) {
                return arr.get(i); //ném tọa độ SV trùng id cần tìm
            }                                   //ra tên hàm. Tên hàm trỏ vào vùng new
            //Student cần tìm id
        }
//đi hết for mà éo thấy tức là hok thấy, return cho trỏ vào đáy ram
//nguyên tắc trỏ null hoặc 
        return null;
    }

    public static void sortStudentList() {
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("SE55555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE44444", "BỐN PHẠM", 2003, 4.4));
        arr.add(new Student("SE88888", "TÁM TRẦN", 2003, 8.8));
        arr.add(new Student("SE99999", "CHÍN NGUYỄN", 2003, 9.9));
        arr.add(new Student("SE22222", "HAI LÝ", 2003, 2.2));

        System.out.println("The student list before sorting");
//         for (Student x : arr) {
//            x.showProfile();
//        }
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            tmp.showProfile();
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
        System.out.println("After sorting ascending by gpa");
        for (Student x : arr) {

            x.showProfile();
        }

    }

    //hàm trả về object, đẫ học trong bài 7 viên ngọc rồng
    //TRẢ VỀ OBJECT, ĐỌC ĐÚNG CHUẨN PHẢI LÀ: TRẢ VỀ TỌA ĐỘ VÙNG NEW
    //NEW CỦA OBJECT, TAO SẼ ĐƯA TỌA ĐỘ HỒ SƠ, TỌA ĐỘ BODY NẰM TRÊN
    //CHIẾN TRƯỜNG, TỌA ĐỘ/SỐ PHÒNG BỆNH NHÂN ĐANG ĐIỀU TRỊ
    //hàm nhận vào id sv mún tìm trong túi ArrayList
    //trả về thẻ bài, chứa tọa độ sv tìm thấy trùng id
    //túi chỉ chứa thẻ bài, đưa thẻ bài ~~~ đưa địa chỉ, đưa tọa độ
    public static Student searchStudent(String id) {
        List<Student> arr = new ArrayList<>();

        Student binh = new Student("SE99999", "BÌNH LÊ", 2003, 4.9);

        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);
        //còn nhiều sv nữa
        //logic, lôi từng thẻ bài ra get(i)
        //đc con trỏ/tọa độ sv rồi, hỏi id của sv(i) có trùng id đưa vào hol
        //,trùng, thì trả về tọa độ, thẻ bài
        //mỗi thẻ bài ứng 1 sv có id ở xa vùng new Student()
        //get thẻ bài thì hỏi tiếp id, so sánh id đưa vào    
        //trả về null nếu ko thấy, trỏ đáy ram
        //for từ đầu lôi từng bạn, hỏi từng id, if
        Student tmpStudent = arr.get(0);
        String tmpId = tmpStudent.getId(); //lấy được mà sv bạn thứ 0
        //String tmpId = arr.get(0).getId();
        //if(tmpId == id) return tmpStudent; //arr.get(0);
        if (tmpId.equalsIgnoreCase(id)) {
            return tmpStudent; //nếu == id, ném ra tọa độ trong thẻ bài
        }                               //thứ i, bài này là thứ 0

        return null; //nếu éo trùng id thì ko tìm thấy, trả về tọa độ 0

    }

    //Set là túi chung chung, hàng hiệu, éo chơi đụng hàng
    //ko cho add trùng, trỏ trùng vùng new
    //ko có 2,3, thẻ bài trỏ cùng 1 vùng new, cấm
    //mỗi thẻ bài 1 vùng new khác nhau
    //tương đương đếm số người vào lễ hội, xem phim  
    //mỗi người đếm đúng 1 lần
    //List hàng bình dân, đụng chan chát
    //có n thẻ bài trỏ trùng vùng new chẳng sao 
    //tương đương đếm số vé đã bán, éo quan tâm 1 người mua mấy vé
    //đếm số lượt người
    //Set hàng hiệu có 2 loại Con: HashSet và TreeSet
    //HashSet đồ vào thứu tự nào, ra có thể là thứu tự khác, khác ArrayList
    //ArrayList vào trước ngồi trước, vào sau ngồi sau, đi ra cx vậy, get(i)
    //đúng thứ tự vào
    //HashsSet: vào đầu tiên, ra có khi cuối cùng
    //TreeSet: vào cứ vào, tao sẽ sắp xếp riêng theo cách của tao 
    //         thẻ bài vào là được sẵp xếp theo cách nào đó, HỌC SAU< INTERFACE
    //CẢ 2 THẰNG NÀY ÉO CÓ HÀM GET(I) LẤY RA, VÌ THỨU TỰ ĐÃ BỊ XÁO TRỘN RỒI
    //FOR QUÉT HẾT, FOR EACH, KO FOR I
    //DO KO GIỐNG NHƯ LÚC VÀO!!!
    public static void playWithSet() {
        Set<Student> arr = new HashSet();
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        Student binh = new Student("SE99999", "BÌNH LÊ", 2003, 4.9);
        arr.add(binh); //ArrayList in ra 3, HarshSet in ra mấy

        arr.add(new Student("SE123457", "CƯỜNG VÕ", 2003, 9.0));

        arr.add(new Student("SE123457", "CƯỜNG VÕ", 2003, 9.0));
        //HOK PHẢI ADD TRÙNG NHA, CÓ NEW CÓ VÙNG NHỚ MỚI
        //DATA TRONG NEW TRÙNG, QUAN TÂM ÉO GÌ, VÙNG NEW MỚI MÀ
        //TRONG GIỎ CHƯA THẺ BÀI TRỎ ĐẾN

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    //chơi với loại túi co giãn về dung lượng
    //Túi List có khả năng sort tự động, mình sẽ học sau
    //vì nó dính đến Interface
    //mình vẫn có thể sort bằng tay, tự viết kiểu 2 vòng for
    public static void sortArrrayListManually() {
        List<Student> arr = new ArrayList<>();
        //túi rỗng, chưa có con trỏ nào, chưa có thẻ bài ghi địa chỉ
        //chiến sĩ nào đó
        Student binh = new Student("SE99999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0)); //add thẻ bài, add tọa độ vào vùng new Student()
        //new Student cứ nằm thoải mái trong HEAP
        //bệnh nhân cứ về phong, bs đã có ds ở phòng bs
        arr.add(binh); //add thẻ bì, add tọa độ ở phong bệnh nhân
        arr.add(binh); //add trùng vô tư, 3 thẻ bài trong túi
        //2 thẻ trỏ trungg 1 con người
        System.out.println("The student list");
        for (Student x : arr) {
            //x = từng thẻ bài, mỗi thẻ bài là 1 tọa độ vùng new
            //x chính là chứa tọa độ vùng new
            x.showProfile();
        }
        System.out.println("The student list(printed by using i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); //arr[i].showProfile();
            //Student tmp = arr.get(i);
            //tmp.showProfile();
        }//get(ra con trỏ thứ i ,thẻ bài thứu i)
        //trong thẻ bài thứu i chứa tọa độ vùng new Student
        //get(i) chính là biến sv thứu i trong giỏ/mảng
        //chấm tiếp để vào vùng new, con trỏ cuối (đếm từ 0)

        //GIỎ NÀY CHO PHÉP LOẠI BỎ 1 MÓN ĐỒ, TƯƠNG ĐƯƠNG VỚI
        //LOẠI BỎ HẲN 1 CON TRỎ RA KHỎI GIỎ. MẢNG KO CÓ, FIXED
        arr.remove(2); //thẻ bài bạn Bình trỏ lần 2 á loại bỏ
        //mất 1 thẻ bài cuối
        System.out.println("The lastest student list(printed by using i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); //arr[i].showProfile();
            //Student tmp = arr.get(i);
            //tmp.showProfile();
        }

        //thẻ bài 0 luôn trỏ vùng new AN 9
        //thẻ bài 1 luôn đang trỏ vùng new BÌNH 4.9
        //mảng đang giảm dần, ta cần tăng dần về điểm
        //logic: điểm ai nấy giữ, chỉ đổi thẻ baì thôi
        //đổi chỗ trỏ trong thẻ bài
        //thẻ bài 0 phải trỏ vào BÌNH 4.9 
        //thẻ bài 1 phải trỏ vào AN 9
        //arr.get(i) lấy thẻ bìa thứ i, lấy được tọa độ vùng new Student(i)
        //arr.set(i, tọa độ vùng new Student khác)
        //thẻ bài thứ i sẽ trỏ vào vùng new KHÁC
        Student tmp = arr.get(0); //tmp trỏ vùng thẻ bài 0, đang AN 9
        //      tmp = arr[i]; //mảng có sẵn khay [i] chọn
        //                    //túi mở ra để lấy[i], .get(i)
        arr.set(0, arr.get(1)); //thẻ bài 0 lưu tọa độ của thằng thẻ 1
        //thẻ 1 đang trỏ BÌNH 4.9
        arr.set(1, tmp); //thẻ bài 1 trỏ cùng tọa độ tmp
        //tmp = trỏ vào get(0) cũ, AN 9
        System.out.println("The student list after sorting ascending by gpa (printed by using i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); //arr[i].showProfile();
            //Student tmp = arr.get(i);
            //tmp.showProfile();
        }

    }

    public static void playWithArrayList() {
        //Student[] arr = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô
        //món đồ phải đi mua, new, thảy vào
        //tên mảng chính là má mì, quản lí nhiều đò, tên túi luôn

        //List arr = new ArrayList(); //đựng lộn xộn đủ loại con trỏ
        //đúng nghĩa tú Doraemon, món gì cũng đựng, đựng tham chiếu hoy nha
        //nhét đc NhanVien, GiangVien, Animal, Dog,..
        //túi đồng nhất chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList();
        //List<Student> arr = new ArrayList<>();
        //List<Student> arr = new ArrayList<Student>();
        //arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //nhét đồng nhất món đồ dễ chấm chung đc, đa hình đc

        //MỞ NGĂN TỦ;TÚI, NHÉT ĐỒ VÔ
        //arr[i] = new Student (...); //mảng
        //arr.add(new Student(...)); //lưu con trỏ hoy, new Student()thoải mái
        //bên ngoài, vùng HEAP
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        arr.add(s1); //giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        //2 chàng 1 nàng
        arr.add(s2); //sinh ra thêm con trỏ nữa [1]
        //add() vô tận, mảng [lenght - 1] hết mức
        //new cứ nằm HEAP, sv cứ ở nhà, CN cứ ở xưởng, BN cứ ở phòng

        //add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        //sinh ra con trỏ
        arr.add(s1); //add trùng nè 1 tên người vào danh sách,
        //Set ko báo lỗi, chỉ lấy 1...đừng đi vào chi tiết vội vã!!!!

        arr.add(new Student("SE99999", "CHÍN PHẠM", 2003, 9.0));
        //         new cứ lên  HEAP mà nằm, Bệnh nhân cứ về phong, tớ nắm thẻ bài
        //1 con trỏ được add vào

        //hỏi xem túi đang có bao nhiêu
        //arr.length hỏi túi mà, hỏi má mì mà, hỏi tên mảng mà
        System.out.println("The bag has: " + arr.size() + " món đồ");
        //4sv in ra, nhưng thực ra chỉ có 3 sv, do có người đếm trùng

        //in mọi người ra
        //tủ có gì, chứa bên trong 1 đống con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList[con-trỏ1, con-trỏ2, con-trỏ3, con-trỏ4, ...nếu add() thêm
        //add() đâyr vào 1 con trỏ, tọa độ, thẻ bài
        //get(vị trí thẻ bài muốn lấy), trả về tọa độ con trỏ thứ i
        //                              trả về địa chỉ vùng new đang trỏ
        //[i] lấy đc tham chiếu của bạn thứi
        //get(i) lấy đc chỗ ngồi tham chiếu con trỏ thẻ bài thứ i
        //a, thẻ này trỏ bạn sv kia kài
        //in bạn đầu tiên
        //arr[i].showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0); //trả về tọa độ con trỏ thẻ bài tọa độ thứ 0
        //trả về tọa độ gán vào biến Student khác nắm cùng tọa đọ okie
        System.out.println("The student list");
        xxx.showProfile();

        //bạn 1 get(1), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ
        //cùng làm gì?
        arr.get(1).showProfile(); //á đù trả về con trỏ, hoc rồi 7 viên ngọc rồi

        System.out.println("In xịn sò");
        for (Student x : arr) { //éo sợ NULL POINTER add() đến đâu thêm con trỏ đến đó
            //x = arr.get(i) = arr[i]
            x.showProfile();

        }
        System.out.println("In xịn sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            //arr[i].showProfile();
            arr.get(i).showProfile();
        }
        //có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, món đồ, gạch tên
        //1 người khỏi danh sách,
        //vùng new Student() bị mất hay ko tùy vào mấy con trỏ trỏ nó, học rồi
        //size() giảm liền , mảng éo có, fix cứng số con trỏ
        //set() đảo con trỏ, trỏ sang vùng khác(get() hàm set() xưa nay của
        //các object)
    }

}
