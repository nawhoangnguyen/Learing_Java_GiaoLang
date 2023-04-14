package data;


import java.util.Random;

/**
 *
 * @author USER
 */
public class Dog extends Pet{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
       return new Random().nextDouble() * Dog.MAX_SPEED;
    }               //anonymous object  
                    //éo thèm đặt tên object, có tọa độ thay vì cất đi chấm luôn

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                           "DOG",  name ,yob, weight, run());
    }
    
    
}
