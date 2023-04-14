package basicarray;

import java.util.Scanner;

public class Sorting {

    //main() bên kia là main() default, mặc định, đứng ở bất kì class nào
    //F6 đều chạy main() default
    //main() thứ 2 muốn chạy, thì bắt buộc phải mở nó lên, Shift F6
    public static void main(String[] args) {
        System.out.println("Ahihi");
        //sortPrimitiveArray();
        //sortPrimitiveArrayV2();
        //sortStudentList();
        inputStudentList();
    }

    //CHƯA OOP 100% OOP ~~ 55%
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        //có thể khai báo mảng 500 sv có sẵn 500 chỗ
        //có thể hỏi muốn bao nhiêu, thì new bấy nhiêu
        //có 1 cách xịn sò hơn, khỏi hỏi bao nhiêu, đưa bao nhiêu có bấy nhiêu
        //đưa new Student() vào
        //là có chỗ, mảng linh hoạt, co giãn kích thước - Collections Framework
        int count, yob;
        double gpa;
        String id, name;

        System.out.print("How many students do you want to input?: ");
        count = Integer.parseInt(sc.nextLine());
        Student[] arr = new Student[count]; //chưa biết bao nhiêu sv??

        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
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

            arr[i] = new Student(id, name, yob, gpa);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void sortStudentList() {
        //KHAI BÁO MẢNG OBJECT CÁCH 1
//        Student arr[] = new Student[5];
//        arr[0] = new Student("SE9", "CHÍN", 19, 9.0);
//        arr[1] = new Student("SE5", "NĂM", 15, 5.0);
//        arr[2] = new Student("SE8", "TÁM", 18, 8.0);
//        arr[3] = new Student("SE2", "HAI", 12, 2.0);
//        arr[4] = new Student("SE7", "BẢY", 17, 7.0);

        //KHAI BÁO MẢNG OBJECT CÁCH 2  
        Student arr[] = new Student[]{
            new Student("SE9", "CHÍN", 19, 9.0),
            new Student("SE5", "NĂM", 15, 5.0),
            new Student("SE8", "TÁM", 18, 8.0),
            new Student("SE2", "HAI", 12, 2.0),
            new Student("SE7", "BẢY", 17, 7.0),};

        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student temp = arr[i];//điểm 0 ổn, thì đổi gọi tên, trỏ
                    arr[i] = arr[j];
                    arr[j] = temp;
                }//hoán đổi việc trỏ đúng vào vùng new có data điểm phù hợp
                //thứ tự, đổi việc/thứ tự gọi tên sinh viên
                //thay vì gọi điểm cao, gọi điểm thấp trước, vẫn gọi từ [0]
                //đầu danh sách
            }
        }

        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }

    }

    public static void sortPrimitiveArrayV2() {

        int arr[] = new int[]{1000, -1000, 20, -20, 1000, 30, -3000};
        //                    [0]   [1]    [2]
        arr[0] = 1000;
        System.out.println("The array before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.printf("\n");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //i luôn nhỏ hơn j, trước j trong mảng
                    int temp = arr[i];  //đứng trước mà bày đặt đòi lớn hơn                  
                    arr[i] = arr[j]; //thì swap
                    arr[j] = temp;

                }

            }
        }

        System.out.println("The array after sorting ascending:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void sortPrimitiveArray() {

        int arr[] = new int[]{1000, -1000, 20, -20, 1000, 30, -3000};
        //                    [0]    đổi
        //                  -1000   1000    
        //                                 ko  ko   ko    ko  có
        //                  -3000
        //sắp xếp tăng dần.

        System.out.println("The array before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
            //sắp xếp tăng dần: thằng đứng trước phải nhỏ hơn thằng sau bất kì vị trí nào trên mảng
            //if (thằng trước > thằng sau) -> swap
            //tao cần [0] mày phải nhỏ nhất trong cả đám
            //lấy tao [0] đi so với tất cả phần còn lại, if không ổn thì đổi
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) { //[0] đi so với còn lại, bất ổn thì đổi
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }

        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[1] > arr[i]) { //[0] đi so với còn lại, bất ổn thì đổi
                int temp = arr[1];
                arr[1] = arr[i];
                arr[i] = temp;
            }

        }
        //-3000 1000  20  -20 1000 30 -1000
        //-3000  20  1000 -20 1000 30 -1000
        //-3000 -20  1000  20 1000 30 -1000
        //-3000 -1000 1000  20 1000 30 -20

        System.out.println("The array after sorting ascending:");
        for (int x : arr) {
            System.out.print(x + " ");

        }

    }

}
