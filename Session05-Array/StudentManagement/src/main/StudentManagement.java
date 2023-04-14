package main;

import data.Shelf;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //menu để lựa chọn:1...... 2...... 3...... 4...... 
        //chọn hoài đến khi Exit/Quit, lặp, 1thif addStudent() của Tủ nào???
        int choice;
        Shelf tuSE = new Shelf("PINK", "SE MAJOR");

        do {
            printMenu();
            System.out.print("Input yout choice (1...6): ");
            choice = Integer.parseInt(sc.nextLine()); //MyToys
            //if (choice == 1) thì làm gì, == 2 thì làm gì ==3 thì làm gì

            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time<3");
                    break;
                default:
                    System.out.println("Please choose 1..6 to play with");
                    break;

            }
        } while (choice != 6);//chừng nào còn muốn chơi thì cứ chơi
        //chừng nào chưa chọn 6 thì còn chơi, còn đúng còn chơi
        //đúng là chưa = 6 thì chơi tiếp, chưa 6 còn chơi

    }
public static void sortStudent(){
    
}
    public static void printMenu() {

        System.out.println("Welcome to FAP - FPT Âcdemic Portal");
        System.out.println("choose the following functions to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile"); //XÓA KHÔNG HẲN LÀ XÓA, XÓA LÀ ẨN
        System.out.println("6. Quit");

    }

    public static void checkSelf() {
        //mua Tủ về chứa hồ sơ sv cụ thể nào đó, mỗi tủ default 500 sv
        //OOP thinking, toàn chơi object

        Shelf tuSE = new Shelf("COLOR", "SE MAJOR");
        Shelf tuGD = new Shelf("RAINBOW", "GD MAJOR");

        tuSE.addAStudent(); //1/500
        tuSE.addAStudent(); //2

        tuGD.addAStudent();
        System.out.println("The student list for all majors");
        tuSE.printStudentList();
        tuGD.printStudentList();
    }

}
