/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

/**
 *
 * @author USER
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //showRecords();
       showRecordsWithTakeAway();
    }
public static void showRecordsWithTakeAway() {
    
    //đường đua đông vui, có nhiều racer, và có một con gì đó ko nhìn rõ
    //bay theo, vật gì đó bay theo, tức là có tốc độ
    //mình ko biết, ko xác định đc nhóm của nó là gì, chưa biết class gì
    //vì mày muón nhập hôi, okie, chạy theo đi, chơi mượn gió bẻ măng take away
    
    Pet ufo = new Pet("UFO", 2021, 0.3) {
        @Override
        public double run() {
        return new Random().nextDouble() * 30;
        }
        
        @Override
        public void showRecord() {
            System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", 
                    "XXX", name, yob, weight, run());
        }
    }; //VIP
    
        Hamster xx = new Hamster("NHẮT", 2021, 0.3, "red");
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VÀNG ƠI", 1950, 10.0),
            new Cat("TOM", 1960, 15.9, "PINK"),
            new Cat("KITTY", 1990, 5.0, "YELLOW"),
            new Hamster("JERRY", 1960, 0.5, "Purple"),
            xx, ufo //object tạo từ ANO vẫn là Pet, vào
        };          //mảng
       
        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }
        
        for (int i = 0; i < racer.length; i++) {
            for (int j =i + 1; j < racer.length; j++) {
                if(racer[i].run()  > racer[j].run()){
                
            
            }
    }
    }
}
    public static void showRecords() {
        Hamster xx = new Hamster("NHẮT", 2021, 0.3, "red");
        Pet racer[] = new Pet[]{new Dog("CHIHUHU", 2021, 0.5),
            new Dog("VÀNG ƠI", 1950, 10.0),
            new Cat("TOM", 1960, 15.9, "PINK"),
            new Cat("KITTY", 1990, 5.0, "YELLOW"),
            new Hamster("JERRY", 1960, 0.5, "Purple"),
            xx
        };
        //racer[0] = new Dog("", 0, 0);
        //phần tử mảng Pet thì phả là gán 1 con Pet nào đó, Cat, Dog, HT
        //gán - new Dog(...); [i] - cần tọa độ vùng new Con Nào Đó()
        //new Dog()....: bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc
        //đa hình quay trở lại
        //vì mảng Pet nên mọi việc CHẤM LÀ CỦA CHA, CỦA PET, CHA TAONF LÀ ABSTRACT
        //HOÀN TOÀN KHÔNG ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        //CHA QUẤT ROI CHẠY ĐI CHÚNG MÀY, THẾ LÀ 3 ĐỨA CON CHẠY THEO
        //TỐC ĐỘ CỦA RIÊNG CHUNGS, ĐA HÌNH XUẤT HIỆN, OVERRIDE QUA MẶT CHA XH
        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }
        
        //TẠI THỜI ĐIỂM VIẾT CODE THẾ NÀY, KO SORT THÀNH TÍCH CHẠY ĐC
    }
}
