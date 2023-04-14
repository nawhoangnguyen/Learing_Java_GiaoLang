package data;
//Đặc điểm của Con
//2 trường hợp
//Con giống i chang Cha
//Con biến dị
//3.Phễu, giữ bản sắc con, cha con deal, thương thuyết đàm phán dung hòa

public class Child extends Parent{

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    @Override
      public void showProfile(){
        System.out.println("CHILD  > asset1: "+ assetOne + "; asset2:"+ assetTwo);
    }
}
