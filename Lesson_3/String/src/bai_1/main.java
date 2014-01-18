/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class main {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        StudentList student = new StudentList();
        student.addNewStudent();
        int n;
        do {            
            System.out.println("1: Hiển thị danh sách sinh viên");
            System.out.println("2: Hiển thị xắp sếp theo Alphabet");
            System.out.println("3: Hiển thị xắp sếp theo điểm giảm dần");
            System.out.println("4: Tìm kiếm");
            System.out.println("5: Thoat");                   
            System.out.print("Lua chon cua ban: ");
            n = input.nextInt();
            switch(n) {
                case 1: student.showStudent();
                    break;
                case 2: student.showStudent();
                    break;
                case 3: student.showScoreDesc();
                    break;
                case 4: student.showSearch();
                    break;
                case 5: System.out.println("Tam biet");
                    break;
                default:
                    System.out.println("Vui Long Chon Lai");
            }
        } while(n != 5);
    }
}
