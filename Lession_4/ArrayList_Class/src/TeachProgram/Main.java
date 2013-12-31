/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TeachProgram;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        StudentsList listStu = new StudentsList();
        Scanner input = new Scanner(System.in);
        int choose;
        do{                        
            System.out.println("----------------");
            System.out.println("Nhập[1] : Để thêm sinh viên");
            System.out.println("Nhập[2] : Để hiển thị danh sách");
            System.out.println("Nhập[3] : Để tìm kiếm sinh viên");
            System.out.println("Nhập[4] : Để xóa sinh viên tại vị trí");
            System.out.println("Nhập[5] : Để xóa toàn bộ sinh viên");            
            System.out.println("Nhập[6] : Để hiển thị danh sách sinh viên theo Alphabet");
            System.out.println("Nhập[7] : Để hiển thị danh sách sinh viên theo tăng dần điểm");
            System.out.println("Nhập[8] : Thoát");
            System.out.println("----------------");
            System.out.print("Lựa chọn : ");
            choose = input.nextInt();

            switch(choose) {
                case 1:
                    listStu.input();
                    break;
                case 2:
                    listStu.display();
                    break;
                case 3:                    
                    // Do something
                    listStu.searchStudent();
                    break;
                case 4:
                    // Do something
                    listStu.removeStudent();
                    break;
                case 5:
                    // Do something
                    listStu.removeAllStudent();
                    break;
                case 6:
                    // Do something
                    listStu.sortAlphabet();
                    break;
                case 7:
                    // Do something
                    listStu.sortScore();
                    break;                
                case 8:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại!");
            }

        } while(choose != 8);

    }
}
