package data;
public abstract class Pet {
    //Cha là nhân tử chung của đám Con dị biệt
    //ngoài đời: Ba Mẹ chia sẻ gien/tài 
    //Các Con khác nhau, nhưng chia sẻ chung hình dáng, tâm hồn, tinh thần Ba Má    
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    //việc chạy của các con thì sao
    //mỗi con có cách chạy khác nhau, nhanh chậm, giới hạn vật lí thể chất
    //dáng chạy khi nó đang chạy: mèo dũng mãnh, chó hùng hục, hamster rụt rè
    //quá dị biệt ở mỗi đứa, gom chung here các hành động chi tiết ko ổn
    //do đó run() sẽ là abstract
    public abstract double run(); //Phàm là Thú thì phải biết chạy

    
    public abstract void showRecord();
//Trả về tốc độ
    
    
}
