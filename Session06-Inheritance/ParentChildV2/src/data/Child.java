package data;
//Đặc điểm của Con
//2 trường hợp
//Con giống i chang Cha
//Con biến dị
//3.Phễu, giữ bản sắc con, cha con deal, thương thuyết đàm phán dung hòa

public class Child extends Parent{
    //HCN: o, c, w, l
    private String assetThree;

    public Child(String assetThree, String assetOne, String assetTwo) {
        super(assetOne, assetTwo); //must be 1st statement
        this.assetThree = assetThree;
         //super(assetOne, assetTwo); //ko cho nằm ở đây
         //câu lệnh SUPER() MUST BE 1ST STATEMENT
         //vì ko có Ba lấy gì có Con, Ba là cánh chim, nền đỡ để cho Con bay xa
         //vùng new Cha phải có, rồi mới nới rộng thêm
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }

    @Override
     public void showProfile(){
        System.out.println("PARENT > asset1: "+ assetOne + "; asset2:"+ assetTwo+"; asset3: "+assetThree);
    }
     public void sayHi(){
         System.out.println("Hey, i am a rich kid");
         System.out.println("By the way, my 3rd asset is"+assetThree);
     }
    
}
