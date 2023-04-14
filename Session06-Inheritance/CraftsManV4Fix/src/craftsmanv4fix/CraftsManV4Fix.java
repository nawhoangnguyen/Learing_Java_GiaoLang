/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package craftsmanv4fix;

import data.Disk;
import data.Rectangle;
import data.Shape;

/**
 *
 * @author USER
 */
public class CraftsManV4Fix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithShapes();
    }
     public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 6.0, 5.0);
        Shape r2 = new Rectangle( "TÍA", "PINK", "MAGENTA",5.0, 6.0);

        Disk d1 = new Disk("Má", "PINK", "MAGENTA", "<3", 6.0);
        Shape d2 = new Disk("Má", "MAGENTA", "PINK", "<3", 6.0);
        r1.Paint();
        r2.Paint();
        d1.Paint();
        d2.Paint();
    }
}
