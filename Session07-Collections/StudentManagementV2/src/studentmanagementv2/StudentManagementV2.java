/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementv2;

import data.Cabinet;

/**
 *
 * @author USER
 */
public class StudentManagementV2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addAStudent();
        se.addAStudent();
        
        se.printStudentList();
        
        se.updateAStudent(); //dành ko cho tìm thấy sv
        se.updateAStudent();
        System.out.println("ÉO TIN CÔN TRỎ, XEM THỬ COI TOÀN BÔ"
                + "DS CÓ BẠN BỊ THAY ĐỔI HEM");
        
        
        se.printStudentList();
        
        //gõ từ đây mã số muốn tìm
        //se.searchAStudent("SE123456")
        //search ko thấy
        se.searchAStudent();
        //search thấy
        se.searchAStudent();
                
    }
//    public static void main(String[] args) {
//      Cabinet se = new Cabinet();
//      Cabinet ia = new Cabinet();
//        System.out.println("ADD SE");
//        se.addAStudent();
//        
//        System.out.println("ADD IA");
//        ia.addAStudent(); //#1
//        ia.addAStudent(); //#2
//        
//        //IN KẾT QUẢ
//        System.out.println("SE students");
//        se.printStudentList(); //1sv
//        
//        System.out.println("IA students");
//        ia.printStudentList(); //2sv
//    }

}