package data;

import java.util.Random;

/**
 *
 * @author USER
 */
public class Cat extends Pet {//lấy được tên, cânnawngj, năm sinh
public static final double MAX_SPEED = 50;
//dị biệt, đeo nơ
    private String ribbon; //dải ruy-băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        //Nhóm Random: là nói về những máy móc, những thứ đồ đạc mà nó phát sinh ra được
        //đc thứ gì ngẫu nhiên: máy ném banh, máy ném đía, máy chạy bia mục tiêu
        //máy in ra số Vietlot,... -> class Random
        //Random mayNgauNhien = new Random();
        //return mayNgauNhien.nextDouble() * MAX_SPEED;
        //          trả về số (0......1)
        //                        cận 1  * 50 cận 50;
        //ngẫu nhiên ko vượt quá 50
    return new Random().nextDouble() * MAX_SPEED;
    //object hok thèm đặt tên, xài vùng new 1 lần bỏ luôn
    //CT MTDT dọn, GARBAGE COLLECTOR, System.gc
    }

    @Override //hỗ trợ đa hình, chung nhất của cả đám để đa hình
    //giúp xưr lí đa dạng, mà lại tương thích
    public void showRecord() {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%4.1f|\n",
                            name, yob, weight, run());
    }
    
}
