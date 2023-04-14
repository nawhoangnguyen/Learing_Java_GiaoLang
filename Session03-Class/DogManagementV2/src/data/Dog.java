package data;

public class Dog {//chế khuôn

    private String name;
    private int yob;
    private double weight;

    public Dog(String name, int yob, double weight) {
        this.name = name;  //this name là cái name cái biến trong cái hàm public dog
        this.yob = yob;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark() {
        //System.out.println("gogogogo...... my name is " + name);
        //System.out.println("gogogogo...... my yob is " + yob);

        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    //một object bất kì có nhiều info mô tả, ví dụ : xem đtdd trên tgdd, đập hộp  
    //có sách ghi thông sống luôn. Nhìn 1 cuốn sách trên mang, cầm tay: tác giả, ngày xb
//gặp chú CSGT show ra các info mình có: CCCD, Driver license,cavet,..
//đó là 1 hành động nên có của mỗi object, mô tả, đặc tả về object
//hành động này do ta chủ đông đưa ra hoặc tự gểnate theo template có sẵn
//template có sẵn java có thể giúp mình, mình không cần code

    @Override //khác overload đó nhen, dính đến kế thừa
    //cả 2 thằng đều liên quan đến khái niệm polymorphism
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //độ lại được quyền, vì chỉ cần trả chuỗi chứa info của mình
        // y chang mình làm card visit
        //String tmpMsg = String.format("|GOGO|%-10s|%4d|%4.1f|", 
        //       name, yob, weight);
        //  return tmpMsg;
        return String.format("|GOGO|%-10s|%4d|%4.1f|", 
                name, yob, weight);
    }
    
    //Hàm gắn việc xử lí info của chính object. Ai giàu info thì thằng đó xử lí
    public int getAge(){
        return 2022 - yob;
    }
    //viết code kiểu này gọi là hard-code, fix value, năm sau phải sửa code thì tuổi mởi đúng đúng
    //chuẩn: lấy giờ hệ thống Windows - yob;
    

}
// code ở đây là bene ngoài giống như khung bị lủng
