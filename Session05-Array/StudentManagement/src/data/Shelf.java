package data;

import java.util.Scanner;

public class Shelf {
    //đặc điểm của cái tủ bất kì là gì?: màu sơn:_; giá tiền:_; nhà sx:_
    //sôs ngăn/không gian chứa đồ:___các món đồ nhét vào, món đồ là object
    //chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    //tủ sẽ chứa 1 list/mảng/danh sách các đối tượng
    //ứng dụng của mảng, góp phần tạo dựng nên object khác
    //OOP: tìm các object, chúng phối hợp, trộn nhau

    private String color;
    private String label; //nhãn dán tủ để nói tủ đựng loại hồ sơ nào

    //ta focus vào câu chuyện chính: kệ/tủ/phòng chứa những món gì, sinh ra để làm gì    
    private Student arr[] = new Student[500];
    private int count = 0; //đưa qua phễu oke, nhưng giá trả là người ta new Tủ (600 món đang có)
    //tăng dần khi mình thêm đồ vào tủ

    private Scanner sc = new Scanner(System.in); //mua Tủ cài sẵn code
    //một cái tủ mới mua về, có 0 món đồ...

    //Tủ có sẵn 500 chỗ đựng sẵn
    //new số phần tử là thành công cho biến mảng
    //khai báo mảng là khai báo số biến...
    //mua tủ có số ngăn chứa, chưa quan tâm đồ
    //có nhiều kĩ thuật khởi động kích thước mảng
    //đổ kích thước mảng qua phễu - Tủ đặt riêng số ngăn
    //new luôn kích thước default khi khai báo Tủ, new Tủ có sẵn kích thước
    //biến thì cần gán value.
    //primitive = value; //literal 5 10 15 3.14
    //object thì = new 1 cái gì đó
    //gán trực tiếp ko qua phễu, vì phễu cùng phải đổ vào nó lúc new/clone
    //gán qua phễu 
    //mảng here nghĩa là không gian/khả năng chứa của 1 tủ, chưa nói cụ thể từng
    //món đồ
    //biến mảng nó cần phải được new, hàm ý có bao nhiêu chỗ, new mảng để ở đâu
    //số phần tử mảng
    //Tủ này đựng hồ sơ sv, sure, ko thể nhét 1 lần 500 hồ sơ, vô lía
    //do đó ta sẽ đưa từ từ từng new Student(hồ sơ cụ thể vào trong tủ)
    //do đó ta sẽ đưa từ từ từng new Student(hồ sơ cụ thể) vào trong Tủ
    //triết lí ai có nhiều infor, gã đó lo xử lí, hàm thuộc về object
    //đổ màu sắc, label
    //kích thước Tủ có sẵn default 500
    public Shelf(String color, String label) {//int size để new mảng
        this.color = color;
        this.label = label;
        //lí thuyết khi new Shelf() mua Tủ mới, ta có sẵn arr -> 500 biến sv
        //Tủ có 500 chỗ
        //Tủ linh hoạt kích thước, Tủ đặt riêng, đưa size vào đây
        //arr = new Student(size)

    }

    //hành động xử lí data, Tủ có chỗ thì nhét đồ/cất đồ - ADD
    //                      Tủ kiếng thì cho mình xem được các món đồ - PRINT
    public void addAStudent() {
        //một hồ sơ SV cụ thể sẽ được lưu vào mảng, mảng lưu được nhiều data[i] = 
        //...
        //nhập hồ sơ sv từ bàn phím ~~~~ đăng kí member của web-site
        int yob;
        String id, name;
        double gpa;
        //int count = 0; //mỗi lần gọi hàm, add() bắt đầu count = 0 vô lí
        //count phải là đặc điểm của Tủ, đầy đủ hay chưa
        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        //ngoài đời đếm từ 1, lừa đảo chỉ số i 1 tí, i chạy như cũ,
        //đếm đôn lên 1 giá trị

        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();  //TODO: tên rỗng

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine()); //MyToys.

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine()); //MyToys.

        arr[count] = new Student(id, name, yob, gpa);

        count++; //VIP, quan trọng, giống for chạy slow-motion

        System.out.println("Add a new student profile successfully");

    }
    //đã có sv nhập vào, mua đồ bỏ vào Tủ, ngắm nghía thoy
    //nhìn qua cửa kiếng, duyệt qua giá sách...

    public void printStudentList() {
        System.out.println("There is/are " + count + "student(s) in the list");
//        for (Student x : arr) {
//            x.showProfile();
//        } /null pointer đấy
        for (int i = 0; i < count; i++) {
            arr[i].showProfile();

        }
    }

    //tui Tủ có nhiều sv, tui offer cái search cho bạn
    //y chang Google tui nhớ được đặc điểm các webstie, gõ keyword tui tìm cho
    //gõ mã số sv tui tìm cho
    public void searchAStudent() {
        String id;
        System.out.println("Input the id that you want to search: ");
        id = sc.nextLine();
        //quét từ đầu đến count mảng, lôi từng sv ra hỏi, ma số mấy, == mã id cần tìm không ?
        for (int i = 0; i < count; i++) {
            if (arr[i].getId().equalsIgnoreCase(id) == true) {
                //String là object, ko dùng ==, học riêng
                System.out.println("Student found!!! Here he/she is");
                arr[i].showProfile();
                return;//thoát hàm luôn vì tìm thấy duy nhất rồi
            }
        }//hết for
        System.out.println("Student not found!!!");
    }

}
