
package fu.main;

import fu.util.MyToys;


public class Stage {
    public static void main(String[] args) {
        System.out.println("PI : "+ MyToys.PI);
//        int n = MyToys.getAnInteger();
//        System.out.println("n : "+ n);
        int choice;
        choice = MyToys.getAnInteger("Enter your choices (1...7) : ");
        System.out.println("Your choice is : "+ choice);
        
        
                
    }
}
