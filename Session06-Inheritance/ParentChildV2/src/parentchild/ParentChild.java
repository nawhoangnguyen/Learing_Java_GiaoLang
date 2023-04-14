package parentchild;

import data.Child;
import data.Parent;

public class ParentChild {

    public static void main(String[] args) {
        playWithParentChild();
    }

    public static void playWithParentChild() {
        Parent p = new Parent("BIỆT THỰ", "1000BTC");
        p.showProfile();

        //KHAI CHA NEW CHA. CHẤM XỔ RA TẤT CẢ CỦA KHAI BÁO, CỦA CHA
        //KHAI KHUÔN NEW KHUÔN, XỔ RA TẤT CẢ KHUÔN, KO CARE CHA CON
        //KHAI GÌ CHẤM XỔ NẤY
        //KHAI CON NEW CON
        //CON : vùng nhớ Cha
        Child c1 = new Child("NHÀ PHỐ", "1000ETH", "GOLF");
        c1.sayHi();
        c1.showProfile();
        //KHAI CHA NEW CON
        //CHẤM XỔ RA GÌ
        Parent c2 = new Child("CĂN HỘ", "DOGECOIN", "DU THUYỀN");
        c2.showProfile();

        //mình là quý tộc, cư xử như quys tộc, dù mình vẫn có hoang dã riêng
        //KHAI CHA NEW CON CHỈ XỔ CHA ONLY, KHÔNG XỔ RIÊNG CON
        //NHƯNG TRONG RAM VẪN CLONE ĐỦ CHỈ CÓ ĐIỂU CON TRỎ KO VỚI TỚI
        //dùng kĩ thuật kéo sợi thun, kéo giãn xuống đáy new Con() lấy được
        //tọa độ vùng new Con, chốt deal, .sayHi() okie
        //Child tmp = //tọa độ new Con()
        Child tmp = (Child) c2; //vì c2 mày đang trỏ lưng chừng, vùng rộng hơn
        //là vùng Square, cho nên lấy tao tọa độ
        //new Square để tao cất giữ
        //kéo giãn con trỏ xuống đáy new Con()
        //lấy xong cất ngay tọa độ new Child() 2 chàng 1 nàng
        tmp.sayHi(); //DU THUYỀN
        tmp.showProfile();
        
        //kĩ thuật vi diệu hơn, chơi trực tiếp địa chỉ, ko qua biến con trỏ
        //học rồi, bài 7 cái trò liên quan con trỏ,         new Doog().bark()
        //(Child)c2. //dấu . cực mạnh về độ ưu tiên, nó gắn sát ngay với loại biến
                //c2. hiểu là Cha chấm, tức là vào vùng new Cha, sao thấy dị
            ((Child)c2).sayHi();
    }
}
