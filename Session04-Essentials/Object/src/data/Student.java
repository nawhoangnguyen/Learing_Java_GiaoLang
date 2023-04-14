package data;




public class Student {
    private  String id;//static là vùng nhớ riêng, mà object nào cũng xài được, chung
    private String name;//vùng nhớ xài chung cho các object cùng nhóm/class
                              //dữ liệu đổ vao fhay chỉnh sửa ăn theo thằng cuối cùng được gán/đổ
    //CHÔT HẠ: KHÔNG DÙNG STATIC CHO NHỮNG THỨ ĐẶC ĐIỂM/HÀM MÀ CỦA RIENG TỪNG OBJECT
    //tui có mã số, bạn có ms, bạn kia có ms, nhưng đều là riêng của mỗi đứ
    //chung đặc điểm, khác value, vậy phải có biến clone riêng - NON-STATIC
    
    private int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id; //Instance variable
        this.name = name;
        this.yob = yob; 
        this.gpa = gpa;
    }

//    public Student(String SE172204, String s1, int i, int i0, int i1) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.2f|\n", id, name, yob, gpa);
    }
    
    public void showProfile(){
        System.out.printf("|%8s|%-25s|%4d|%4.2f|\n", id, name, yob, gpa);
        
    }
    
//    public static void sayHi(){
//        System.out.println("Hi everyone, my name ís: "+ name);
//        //System.out.println("By the way, my yob is "+ yob);
//    //static chỉ chơi với static vì cùng 1 khu vực, không chơi với non
//    //có quá trời khu vực yob đc clone biết lấy thằng l nào
//    }
}
