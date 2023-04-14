package data;

import java.util.Random;

public class Hamster extends Pet {

    public static final double MAX_SPEED = 10;

    private String ribbon;

    public Hamster(String name, int yob, double weight, String ribbon) {
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

        return new Random().nextDouble() * MAX_SPEED;

    }

    @Override

    public void showRecord() {
        System.out.printf("|CAT       |%-10s|%4d|%4.1f|%4.1f|\n",
                name, yob, weight, run());
    }
}
