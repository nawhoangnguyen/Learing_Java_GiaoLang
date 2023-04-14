/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author USER
 */
public class NonName extends Shape{

    public NonName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
    //hình cắt bên WORD là hình duy nhất, S ko thể có công thức, mà
    //là con số đo được = thước + tích phân
    //đảm bảo S là con số, còn tính theo cthuc hay đo đạc ko ảnh hưởng
    //nếu bạn chế tạo Khuôn, sẽ là công thức nhân bản
    //hình mình đang cắt là unique
    return 50; //giả bộ cho hình bên WORD
    }

    @Override
    public double getPerimeter() {
    return 40;
    }
    

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//NẾU TA LÀM RIÊNG 1 CÁI KHUÔN CHO 1 HÌNH CỤ THỂ KO HÌNH DẠNG
//SAU NÀY TA NHÂN BẢN HÌNH NÀO CŨNG 50 VÔ LĨ, CẮT NGẪU NHIÊN, DIỆN TÍCH NGẪU NHIÊN
//CÔNG THỨC TÍNH KO CÓ LUÔN
//NẾU CHỦ ĐỘNG LÀM CLASS CON THẾ NÀY, THÌ NÓ LẶP LẠI GIỐNG VUÔNG TRONG CHỮ NHẬT
//CẦN CÓ CÔNG THỨC CHUNG CHO S, P, ĐỂ CÒN CLONE CÁC HÌNH

//BÊN WORD HÌNH ĐỘC ĐÁO, DUY NHÂT, KO THỂ DÙNG KHUÔN RỜI NONAME ĐANG LÀM ĐƯỢC
//TA SẼ CHẾ NHANH THEO SHAPE, ĂN KÉ SHAPE MÀ NEW TRỰC TIẾP HOY
//TRẢ RA S, P HARD-CODE ĐÚNG NGHĨA LÀ 1 HÌNH DUY NHẤT
//CHẾ KHUÔN CLASS DÀNH CHO NHÂN BẢN