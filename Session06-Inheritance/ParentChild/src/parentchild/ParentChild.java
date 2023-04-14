package parentchild;

import data.Child;
import data.Parent;

public class ParentChild {
    public static void main(String[] args) {
        playWithParentChild();
    }
    public static void playWithParentChild(){
        Parent p = new Parent("BIỆT THỰ", "1000BTC");
        p.showProfile();
        
        //KHAI CHA NEW CHA. CHẤM XỔ RA TẤT CẢ CỦA KHAI BÁO, CỦA CHA
        //KHAI KHUÔN NEW KHUÔN, XỔ RA TẤT CẢ KHUÔN, KO CARE CHA CON
        //KHAI GÌ CHẤM XỔ NẤY
        
        //KHAI CON NEW CON
        //CON : vùng nhớ Cha
        Child c1 = new Child("NHÀ VƯỜN", "1000ETH");
        c1.showProfile();
        //KHAI CHA NEW CON
        //CHẤM XỔ RA GÌ
        Parent c2 = new Child("CĂN HỘ", "DOGECOIN");
        c2.showProfile();
    }
}
