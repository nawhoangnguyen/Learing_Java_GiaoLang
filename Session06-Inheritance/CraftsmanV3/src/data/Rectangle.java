package data;

public class Rectangle {

    protected String owner; //______
    protected String color; //______
    protected double width; //___5___
    private double length;//___20___
    //private double area;  //___100___ //thuộc tính/đđ dẫn xuất, derived field
                                      //được tính từ thằng khác, w * 1
                                      //không nên đauw qua phễu, nguy cơ mâu thuẫn
                                      //do dt 1 đằng, 2 cạnh 1 nẻo
    //né không chơi dẫn xuất. ngoan cố new đúng 5 20 100
    //setWidth(10) -> chết nếu ko cập nhật lại S
    //sl * dg = tt
    //dẫn xuất có thể tính được từ thằng data khác, vậy nó nên được biến thành
    //hành vi của object thì hợp lí hơn
    //tui/bạn đều có năm sinh -> cắc cớ đi hỏi tuổi, getAge() là hàm hay hơn
    //                        , age dẫn xuất, cá mỗi năm age++ đúng thời điểm
    //HÀM THUỘC VỀ THẰNG NÀO CÓ NHIỀU DATA, TÍNH DTICH SẼ LÀ 1 HÀM CỦA HÌNH CN
    
    
    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Reactangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    
    public double getArea(){
        return width * length; //tao éo in, return để re-use ở nơi khác
    }
    
    public void paint() {
        System.out.printf("|RECTANGLE  |%-15s|%-10s|%4.1f|%4.1f|%7.2f| \n", 
                                   owner, color, width, length, getArea());
    }
}
