package main;

import data.Student;

public class Stage {

    public static void main(String[] args) {
        //checkObjectv7();
        Student ahihi = checkObjectV8(); //ahihi lwuu tọa độ của AN trong hàm thảy ra ngoài
        ahihi.showProfile();
    }
    
    //Hàm trả về 1 object hẻ thày
    //đọc chuẩn : hàm trả về 1 tọa độ của object nào đó
    //vì trả được tọa được nghĩa là sờ được object, có tọa độ chấm là tới object
    
    // Student x;
    public static Student checkObjectV8() {//~~ Student x = sẽ là 1 vùng new
        Student x; 
        
        x = new Student("SE172204", "An", 2003, 8.9);
       return x; //Vietsub : x đang lưu tọa độ của vùng clone AN, hướng 6<
       //thảy tọa độ đó cho tên hàm, tên hàm là 6m hướng 6m 
        
        
    }
    
    public static void checkObjectV7() {
        Student x; //khai báo biến, khai báo con trỏ, nhưng trưa trỏ ai
        //tao với mày nói về thằng x kia đi
        int a;
        a=10;
        
        x = new Student("SE172204", "An", 2003, 8.9);
        //à nó đây nè
        
        
    }


    public static void checkObjectV6() {

        //câu chuyện sinh rồi chết non
        //câu chuyện vô danh tên gọi
        //object ko thèm, ko có tên goi, vẫn hành xử được
        //Student s1 = new Student("SE172204", "An", 2003, 8.9);
        //đã tương đương tọa độ rồi, thảy tọa độ đó đi đâu hoy
        //thảy cho biến object nào đó giữ giùm tọa độ
        //biến đó mà chấm nghĩa là tọa độ chấm
        //vì biến có tọa độ từ new. CHỐT HẠ : NEW NẮM TỌA ĐỘ
        //chấm là vào trong tọa độ xem có cái gì, trong object có gì
        
        new Student("SE172204", "An", 2003, 8.9).showProfile();

        //ko thèm đặt tên cho object để giao tiếp, để object tự giao tiếp
        //aka anonymous object, object was created without a name, a reference
        //XUẤT HIỆN XONG, GÁY XONG, KHÓC XONG, GARBAGE COLLECTOR PHÁT HIỆN KO CON TRỎ
        //GIẾT,CLEAR
        //MUÔN RE-USE LẠI VÙNG NEW, TỐI THIỂU ÍT NHẤT 1 TÊN GỌI, 1 BIẾN OBJECT
        //ĐỂ CÒN CHẤM TIẾP
    }

    public static void checkObjectV5() {
        //câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("SE172204", "An", 2003, 8.9);
        Student x = s1; //mày là biến lưu tọa độ vùng new, cho tao tọa độ đi

        s1.showProfile();
        x.showProfile();  //An đã trở lại, backup tọa độ new vào 1 biến khác cùng kiểu
        //chứng minh 2 chàng trỏ đúng 1 nàng
        //chàng 1 tát, chàng 2 thấy
        s1.setName("Mình chơi ú tìm heng");
        //trong vùng clone new An đã bị thay đổi name thành Mình chơi ú tìm heng
        System.out.println("After tát");
        //không thèm hỏi s1, hỏi luôn x xem sao
        x.showProfile();

        //nhiều tên cùng tham chiếu 1 object
        //tí, tèo -> (Mình,...)
        //hoàng, gl, xàm, đa cấp, cp -> (Tui)
        //cùng một tên ám chỉ nhiều object khác 
        //sếp = ST
        //sêp = gã trả lương
        //Thay đổi value của biến
        //Một object có nhiều người nhìn, tham chiếu
    }

    public static void checkObjectV4() {
        Student s1 = new Student("SE172204", "An", 2003, 8.9);
        Student x = s1; //mày là biến lưu tọa độ vùng new, cho tao tọa độ đi
        //nếu tao tự new như mày, không lẽ, sai, ra vùng clone mới

        //int a = 10;
        //int b = a; //cho tao value của mày tao muốn lấy value của mày
        //trước khi s1 trỏ tọa độ mới, backup tọa độ cũ
        //giữ lại được An
        s1 = new Student("SE172204", "Lộc Phát", 2003, 8.9);
        s1.showProfile();//LP
        x.showProfile();  //An đã trở lại, backup tọa độ new vào 1 biến khác cùng kiểu
    }

    public static void checkObjectV3() {
        Student s1 = new Student("SE172204", "An", 2003, 8.9);

        s1 = new Student("SE172204", "Lộc Phát", 2003, 8.9);
        //Con diều An đứt dây
        //vì sợi dây nối với diều mới LP
        //s1 li dị vùng new AN
        //ống nhòm dòm sang chỗ mới, con trỏ lưu tọa độ mới, biến thay đổi value
        //int a = 10; a=100;
        //s1 là biến object
        //cần lắm luôn 1 tọa dộ vùng new, vùng clone student
        s1.showProfile();

        //mất tọa độ vùng clone An
        //vùng ram ko có ai trỏ tới, thì định kì khi chạy app, JVM(phần chạy song song với windows
        //sẽ kiểm soát app) nó sẽ clear/giết vùng clone ko có con trỏ
        //giống chó chạy ngoài đường không chủ, Exciter hốt
        //Cty MTĐT, JVM có đoạn code, moodule giám sát HEAP, xem đứa nào mồ côi, không có con trỏ
        //giết ngay và luôn (độ trễ if any) ~~ free(con trỏ bên C chơi malloc())
        //hay anh giám sát này gọi là Garbage COllector, người gom rác, CTMTĐT
        System.gc(); //gom rác HEAP

        //ngoài đời có gán lại biến con trỏ, tên tắt cho thứ phức tạp
        //sếp = CT ST (.....);
        //chết chaseepssp kìa, sếp = (ông, gã chấm lương cho mình, qđ mình tăng lương hay)
        //tí = mày, tao ở nhà ba má gọi
        //tí = Ngô Thanh Vân & câu truyện Trạng Tí
    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE172204", "An", 2003, 8.9);
        Student s2 = new Student("SE172204", "An", 2003, 8.9);
        s1.setGpa(7.8);

        s1.showProfile();
        s2.showProfile();
        //một new 1 clone, 2 sinh viên khác nhau, 2 vùng ram khác nhau    

    }

    public static void checkObject() {
        Student s1 = new Student("SE172204", "An", 2003, 8.9);
        s1.showProfile();
        //reference var
        //object    var
        //pointer   var
        //a là biến, vậy nó có thê thay đổi value
        //vs bạn trẻ sếp đang là Sơn Tùng
        //sếp với người đi làm là trỏ đến ông/bà quyết định luôn cho mình
        //new làm cực kì nhiều việc
        //1.clone khuôn
        //2.gọi phễu đổ data vào vùng clone
        //3. chốt lại tọa độ vùng new vừa rồi, đem tọa độ đi gán cho biến con trỏ

        Student x = s1;
        int a = 10;
        int b = a;

        s1 = new Student("SE660202", "Bình Lê", 1998, 8.9);
        s1.showProfile();

//              System.out.println("An after an từ chối chơi");
//              x.showProfile();
        //an nguyễn ko ai trỏ, ko còn cách nào lấy ại vùng ram này
        //toah độ new cũ ta ko giữ lại
        //biến object là tay cầm con diều,new chính là con diều
        //khi tay cầm con diều mới, còn diều cũ không chơi niawx, đứt sợi dây, diều bay mất
        //1 vùng ram new object mà không có ai trỏ tới, JVM nó hiểu là
        //Garbage Collector, ĐI GOM NHỮNG VÙNG NEW MỒ CÔI KO CÒN TRỎ, DỌN FREE RAM
        //trả lại ram không xài cho new sau này
        //1 biến có quyền trỏ vùng new, giữ lại An được không, mà vầnx còn Bình
    }
}
