package data;

import java.util.*;

public class Cabinet {

    //có nhãn, màu sắc,...éo quan tâm, quan tâm chính là chứa nhiều hồ sơ
    private List<Student> arr = new ArrayList<>();//cần túi Doraemon trước
    //bỏ đồ vào túi là chuyện khác

    private Scanner sc = new Scanner(System.in);

    //ko cần phễu, vì ko cần gán gì cả, có sẵn hết rồi
    //arr là biến con trỏ, cần trỏ vùng new Cái Túi, tao cần Túi trước đã
    //éo quan tâm trong Túi có gì, add từ từ cũng đc
    //phễu để đổ value, có value sẵn thì cần gì phễu
    //constructor rỗng, default, empty, chả đổ éo gì vào, vì mọi thứ bên 
    //trong đã sẵn sàng, để cho đẹp, còn những ý nghĩa khác học sau!!!
    public Cabinet() {
        
    }
    
    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input a student profile #" + (arr.size() + 1));

        //CÒN TRÙNG ID TRONG GIỎ, THÌ KO CHO THOAT - LOOP BẤT TẬN
        while (true) {
            System.out.println("Input id: ");
            id = sc.nextLine().trim().toUpperCase(); //chấm nhiều thế
            //cắt trắng dư, đổi  qua Hoa
            //OBJECT TRẢ VỀ CHẤM TIẾP
            //STRING HỌC RIÊNG
            Student xxx = searchAStudent(id);
            if (xxx == null) {
                break; //id vừa gõ éo tồn tại trong Túi
            } else {
                System.out.println("ID duplication!!! Try with another one");
            }
            //CẤM TRÙNG ID CHÍNH LÀ HÌNH THỨC CỦA PRIMARY KEY BÊN DATABASE/KHÓA CHÍNH
            //CỦA 1 TABLE!!!
        }
        System.out.println("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        //MyToys

        System.out.println("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add a new student successfully");
        
    }
    
    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The cabinet is empty. Nothing to print");
            return;
        } //có gì mà in thoát hàm

        //tủ có gì mới đến đây
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    //ta sẽ làm hàm search sv. Hàm này dùng cho nhiều mục đích
    //1. search 1 sv theo id đưa vào!!!!
    //2. dùng lại ở các chỗ khác, các chỗ/nơi có nhu cầu tìm sv theo id để rồi làm gì tiếp
    //   - kiểm tra xem id có tồn tại chưa ở hàm add() 1 sv, cấm trùng id
    //   - cập nhật 1 hồ sơ sv, hồ sơ nào, thì phải search
    //   - xóa 1 sv, coi sv có tồn tại hay ko đã, search tiếp
    public Student searchAStudent(String id) {
        if (arr.isEmpty()) {
            return null; //ko có hồ sơ mà tìm, trả về null
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        } //tìm thấy trả về thẻ/card trên đó có ghi tọa độ vùng new

        return null;
    }

    //hàm này bao hàm ở trên, dùng lại hàm ở trên
    public void searchAStudent() {
        String id;
        System.out.println("Input student id to search a profile: ");
        id = sc.nextLine();
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND!!!");
        } else {
            System.out.println("STUDENT FOUND!!!");
            System.out.println("Here he/she is");
            xxx.showProfile();
        }
        
    }
    
    public void updateAStudent(Student x, double newGPA) {
        if (x != null)
        x.setGpa(newGPA);
 
    }

    //bổ sung theme hàm update để reuse mức linh hoạt
    public void updateAStudent(String id, double newGPA) {
        //đi tìm sv đã r đi tìm
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND. Nothing to update");
        } else {
            System.out.println("Before");
            xxx.showProfile();
            System.out.println("After");
            xxx.setGpa(newGPA);
        }
    }

    //SỬA INFO, SỬA ĐIỂM THAY ĐIỂM MỚI DO KẾT THUC HỌC KÌ CÓ ĐIỂM MỚI RỒI
    public void updateAStudent() {
        String id;
        double newGpa; //INT PRICE, GIÁ TIỀN KIỂU INT HẢ????
        
        System.out.println("Input student id to update a profile: ");
        id = sc.nextLine();
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND! No student to be updated ");
        } else {
            System.out.println("STUDENT FOUND!!!");
            System.out.println("Here he/she is before updating gpa");
            xxx.showProfile();

            //mời nhập điểm mới
            System.out.println("Input new gpa: ");
            newGpa = Double.parseDouble(sc.nextLine());
            xxx.setGpa(newGpa);
            System.out.println("Here he/she is after updating gpa");
            xxx.showProfile();
        }
    }
    
}
