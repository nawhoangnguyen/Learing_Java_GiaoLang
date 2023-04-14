package data;

//                  sự mở rộng, tiếp nối, phiên bản tiếp
//                  độ lại từ, chỉnh sửa thêm từ....Rectangle
//tui ko mún làm Khuôn từ đầu, tui dựa hơi, tui kế thừa, dùng lại 
//từ ai đó
//1. extends Class mình sẽ kế thừa
// Reactangle gọi là: Cha, parent, super, base
//  Square gọi là : Con, child, sub ,derived(dẫn xuất, chế ra từ)
//2. đặc tính/đặc điểm: HV là 1 dạng IS A (KIND OF, VERSION OF) HCN
//                                  thừa hưởng mọi thứ từ HCN
//                                  do đó ko cần làm lại những gì HCN Cha đã làm
//                                  XÀI LUÔN, KO COPY & PASTE
//TUI LÀ PHIÊN BẢN ĐẶC BIỆT CỦA ANH, BIẾN THỂ TỪ ANH, TUI PHẢI CÓ CÁI TỪ ANH TRƯỚC ĐÃ
//thừa hưởng thì ko cần làm lại, giống cha ko cần làm lại
//3. làm phễu cho Con như truyền thống
//phải để Con giữ bản sắc, nghĩa là tôn trọng phễu Con
//Con vẫn là Con, Con còn là phiên bản Ba
//V          V    V                    HCN
//nếu nhìn HCN thì cstor phải 4 tham số o, c, w, l
//          V thi  cstor phải 3 tham số o, c, edge
public class Square extends Rectangle {

    //phễu dùng để đúc 1 object, nhận vật liệu đi vào
    //đúc new Square() cắt 1 HV, thì chính là cắt 1 HCN
    //  new Square() chính là mình đang new 1 HCN, new Rectangle()
    //có 1 HV ra đời, chắc chắn cũng là có 1 HCN ra đời
    //đổ data từ phễu Con lên phễu Cha, đúc Cha, để có được o, c, w, l như ngày
    //xưa Con có
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }   //~~~~ new Rectangle(o, c, w, l);
//Kế thừa ko phải là copy/paste mà là dùng lại luôn
//DÙNG LẠI CỦA CHA, KO CẦN COPY GÌ CẢ, KO NHÂN BẢN CODE KIỂU BẤT ĐỒNG BỘ
//KẾ THỪA LÀ KHÁI NIỆM ĐỒNG BỘ
    
    
    @Override
        public void paint() {
        System.out.printf("|SQUARE  |%-15s|%-10s|%4.1f|  -  |%7.2f| \n", 
                                   owner, color, width,  getArea());
    }
}
