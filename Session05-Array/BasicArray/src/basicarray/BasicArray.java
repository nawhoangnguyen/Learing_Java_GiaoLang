package basicarray;

/**
 *
 * @author USER
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithPrimitiveArray();
        //playWithPrimitiveArrayV2();
        //playWithStudentObject();
        //playWithStudentArray();
        //playWithObjectArray()
        //sortObjectArray();
        //sortPrimitiveArray();
        sortObjectArrayV2();
    }

    public static void sortObjectArrayV2() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "An Nguyễn", 2001, 10.0);
        arr[1] = new Student("SE123457", "Bình Lê", 2000, 10.0);

        System.out.println("Before sorting by gpa:");
        for (Student arr1 : arr) {
            arr1.showProfile();
        }

        //TUYẾT ĐỐI KHÔNG DÙNG TOÁN TỪ > < = CHO CÁC BIẾN OBJECT, VÌ ĐI SO SÁNH
        //TỌA ĐỘ, ĐỊA CHỈ LÀ VÔ NGHĨA 
        //CHẤM BÊN TRONG ĐỊA CHỈ, CHẤM BÊN TRONG TỌA ĐỘ, VÀO TRONG OBJECT
        //VÀO TRONG VALUE PHỨC TẠP, LẤY VALUE KHÁC RA MÀ XEM, MÀ SO SÁNH
        //SV1 SO SÁNH SV2 LÀ VỚ VẨN, S1. ĐIỂM SO SÁNH VỚI SV2. ĐIỂM CÒN CÓ LÍ!!!
        //tao ngồi ghế 0 mà điểm lại lớn hơn mày ngồi ghế 1
        //swap thoy, swap điểm là ăn đòm, swap con trỏ . thôi
        if (arr[0].getGpa() > arr[1].getGpa()) {

            Student temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;

        }

        //NEW BÌNH ĐANG ĐƯỢC 2 CON TRỎ CÙNG TRỎ, CHỨNG MINH
        System.out.println("After sorting by gpa:");
        for (Student arr1 : arr) {
            arr1.showProfile();
        }

        //phần tử đầu của mảng thay vì trỏ vùng new 9, nay nó trỏ new 5
        //SẮP XẾP MẢNG OBJECT, THÌ VÙNG NEW GIỮ NGUYÊN
        //ĐỔI CÁCH TRỎ CỦA CÁC [I] Ở TRONG MẢNG
        //[THẰNG ĐẦU MẢNG] trỏ vùng new nhỏ
        //[THẰNG KẾ MẢNG] trỏ vùng new to
    }

    public static void sortPrimitiveArray() {
        int a = 9;
        int b = 5;

        //int a trước, b sau, giảm dần value 9 5
        //tui muốn tăng dần về value         5 9
        System.out.println("a: " + a + "|b: " + b);
        //backup a 9 trước khi a chơi nhỏ 5

        //chỉ đổi, sắp xếp khi bị lộn xộn thứ tự, khi a > b lộn xộn tăng dần
        //NẾU ĐỨNG TRƯỚC MÀ LỚN HƠN VỀ VALUE, RÕ RÀNG PHẢI ĐỔI VALUE
        //if(a > b)thì mới swap
        if (a > b) {
            int temp = a;
            a = b;//tao cần value nhỏ, vì tao ngồi đầu tiên, nên mang nhỏ, mày nhỏ
            //cho tao đi
            b = temp; //vẫn còn 9 backup
        }

        System.out.println("After sorting a: " + a + "|b: " + b);
        //backup a 9 trước khi a chơi nhỏ 5
    }

    public static void sortObjectArray() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "An Nguyễn", 2001, 9.0);
        arr[1] = new Student("SE123457", "Bình Lê", 2000, 5.0);
        //[0] đừng trỏ điểm to, sẽ bị in trước, in trước thì ko giảm dần
        //[0] nên trỏ điểm nhỏ thì hay hơn

        Student temp = arr[0];//cho tớ temp trỏ điểm 9 với heng
        arr[0] = arr[1];      //đầu bảng xing trỏ 5 thay vì 9                          //int a = 5;, int b = a; //cho tao xin value của mày
        arr[1] = temp;        //chỗ ngồi kế đầu bảng xin trỏ lai 9 ngày xưa của anh [0]

        //NEW BÌNH ĐANG ĐƯỢC 2 CON TRỎ CÙNG TRỎ, CHỨNG MINH
        System.out.println("After sorting by gpa:");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();

        }
        //phần tử đầu của mảng thay vì trỏ vùng new 9, nay nó trỏ new 5
        //SẮP XẾP MẢNG OBJECT, THÌ VÙNG NEW GIỮ NGUYÊN
        //ĐỔI CÁCH TRỎ CỦA CÁC [I] Ở TRONG MẢNG
        //[THẰNG ĐẦU MẢNG] trỏ vùng new nhỏ
        //[THẰNG KẾ MẢNG] trỏ vùng new to

    }

    public static void playWithObjectArray() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "An Nguyễn", 2001, 9.0);
        arr[1] = new Student("SE123457", "Bình Lê", 2000, 5.0);
        System.out.println("The student list:");
        for (Student x : arr) {
            //x = arr[0];->arr[1]; //2 chàng x và arr[0] cùng trỏ new An Nguyễn
            //        x và arr[1]               Bình Lê
            x.showProfile();
        }
        //sắp mảng tăng dần theo điểm tb
        //lí thuyết, bạn [0] sẽ phải có điểm 5
        //               [1]                 9      
    }

    public static void playWithStudentArray() {
        //lưu hồ sơ 10 bạn sinh viên
        //logic 10 biến + 10 tên tắt + 10 nhát new() tức là value á
        //lưu 10 số tự nhiên
        //10 biến/tên tắt + 10 value đơn
        //int a1, a2, a3, a4
        int arr[] = new int[10]; //arr[0] ~ int x; arr[1] ~ int y
        //=value đơn từ từ
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;//Khai báo lẻ

        //       x[0] x[1] x[2] x[3] x[4]
        Student list[] = new Student[10];//đừng nhầm lẫn khi new, 2 loại ngoặc
        //ngoặc () gọi phễu 1 object 
        //[] tao cần ? biến đối tượng
        //[]là dành cho nhiều tên, nhiều biến nhiều tên gọi tắt
        //[] dành cho nhiều biến, nhiều tên gọi tắt
        list[0] = new Student("SE123456", "An Nguyễn", 2001, 5.6);
        list[1] = new Student("SE1234567", "Bình Lê", 2000, 5.7);
        list[2] = new Student("SE123458", "Cường Võ", 1999, 5.8);

        //mấy con trỏ con lại mang giá trij gì??biến Student chưa gán mang 
        //giá trị 
        //từ list[3]...list[9] là cái gì??? 0 là DEFAULT
        //                                       TRỎ VÀO TỌA ĐỘ 0 CỦA RAM, ĐỊA CHỈ 0 CỦA RAM
        //                                       BYTE ĐẦU TIÊN TRONG THANH RAM TOÀN LÀ SỐ 0FF0FF0FF 
        //tức là byte đầu tiên (thứ 0)tọa độ thứu 0 của ram toàn số 0
        //byte NULL BYTE KHÔNG CÓ GÌ CẢ, TOÀN 0, 
        //IN MẢNG CÁI COI
        System.out.println("The list of students");
        for (Student list1 : list) {
            list1.showProfile();
            //giải thích tao chỉ là 1 biến Student x thoy mà
        }
        s1 = null;//tao trỏ đáy ram heng, null heng, làm biếng new
        //có value rồi, số 0, tọa độ 0 ở đáy rám, đi vào chỉ thây 0000

        s1.showProfile();//có mẹ gì mà show,NULLPOINTEREXCEPTION
        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG LÀ : BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GÁN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, KHÔNG FOR ĐẾN .LENGHT
        //BỌ DEFAULT VỚI PRIMTIVE, BỊ NULL VỚI MẢNG OBJECT

    }

    public static void playWithStudentObject() {
        Student x;//tớ sẽ nói về 1 đứa heng
        x = new Student("Se123456", "An Nguyễn", 2001, 5.6);
        x.showProfile();
    }

    public static void playWithPrimitiveArrayV3() {
        //int arr1[50]; chửi không cho kích thước khi khai báo
        int arr2[] = {5, 10, 15, 25, 20};// có 5 biên int, thêm arr2 là biến
        //~arr[0][1] [2] [3] [4] ~~ int a=5
        //   sỉ                      lẻ
        //new ngầm int[5] rồi gán
        int arr3[] = new int[]{5, 10, 15, 20, 25}; //giống cách trên, explicit
        //int ar
    }

    public static void playWithPrimitiveArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //bien ct  new Object()
        //bien rèf new Object()
        double arr[] = new double[10]; //default gán hết = 0
        //new() là phễu để đúc object!!!!!!!!!!
        //em muốn có 365 biến double, nó là biến lẻ nè
        //ar[0], arr[1], arr[i]....
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;

        System.out.println("The array has values of (for i))");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe array has values of (for each))");
        for (double x : arr) {
            System.out.print(x + " ");

        }

        //get() set() ko có mà thay = chơi trực tiếp []
        //thay đổi value bên trong biến/phần tử
    }

    public static void playWithPrimitiveArray() {
        //double vol[365]; //Java caams khai báo kích thước mảng, số phần tử trong[]

        //float v[365] = {0, 0, 5, 10, 15};
        float v[] = {0, 0, 5, 10, 15, 20, 25}; //mảng có 7 phần tử, có sẵn lun value
        //7 biến float v[0] = 0; v[1] = 0; v[2]=5,...
        //7 biến float nằm trên HEAP, có new ngầm đấy, có malloc()đấy
        System.out.println("The array has values of (printed by individual)");
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        v[0] = 6868;
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + "");

        }
        //ta có thể xem mảng như là 1 tập hợp các value trong dấu {} giống Toán
        //ta có thể xài khái niệm với mọi, để duyệt qua toàn bộ mảng
        System.out.println("\nThe array v has values of (using for each)");
        for (float x : v) {
            //x = v[0], x = v[1], x = v[2], x = v[i] với mọi x là 1 biến lẻ, = từng
            //thằng lẻ trong mảng sỉ
            //sout(v[i])~~~~~~~~~~~~~~~~~~~~~sout(x)
            System.out.print(x + " ");
        }
    }
}
