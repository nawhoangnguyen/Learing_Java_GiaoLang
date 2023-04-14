package data;

//khuôn dùng để đúc ra các object, đối tượng cần lưu trữ info
//thứ làm ra dể bán
//khuôn phải kín, và có miệng hay phễu để đổ/hứng/chế vật liệu hay dâta vào
public class Dog {
    // trong đây chứa đặc điểm chi tiết các đặc điểm khuôn và object tương lai sẽ có
    //khuôn design ra sao mai mốt object i như vậy
    private String name;
    private int yob;
    private double weight; // này là biên và value đưa vào
   //tạo khuôn thì phải có phễu, nên tạo phễu
    public Dog(String iName, int iYob, double iWeight){ // tạo phễu để đổ data vào
        name = iName;
        yob = iYob;
        weight = iWeight;
        
    }
    //phễu còn gọi là constructor,hàm khởi tạo, hàm đúc, hàm tạo dựng 
    //vì thông qua nó vật liệu chạy vao(data) đúc ra object
    //CONSTRUCTOR, PHỄU LÀ HÀM CỰC KÌ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJECT
    //MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA VẬT LIỆU VÀO TỨC LÀ CÓ 1 OBJECT MỚI
    //PHẾU LÀ HÀM ĐẶC BIỆT KHÔNG CÓ GIÁ TRỊ TRẢ VỀ, KHÔNG CÓ VOID LUÔN
    //tên của nó phải giống hoàn toàn class
    
    //viết các hàm xử lí data, ví dụ như giao tiếp hỏi năm sinh
    //mày hỏi tao trả lời, vì ba má đã fill yob = 2001
    //object thì sẽ gọi là hành động, behaviour,xưr lí tính toán trên biến được 
    //đổ value từ lúc đúc ra
    
    //hàm gọi n lần tương đương với các hành động mà obj nào đó lặp đi lặp lại
    //hành động của obj gọi đc n lần trên obj đó
    public void bark(){
        System.out.println("gogogogo...... my name is " + name);
        System.out.println("gogogogo...... my yob is " + yob);  
        
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    
    //thay dổi info ba má đã từng cho lúc ba má new/đúc ra mình
    public void setNewWeight(double newWeight){
       weight = newWeight;
    }
    //vì mặc định info sẽ là giấu, khi mình giao tiếp mình mới bật nó ra
    //chia sẻ info khi được hỏi, đó chính là method hàm hành động get()
    public  int getYob(){
        return yob;
    }
}
// code ở đây là bene ngoài giống như khung bị lủng
