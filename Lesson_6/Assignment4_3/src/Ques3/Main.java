/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques3;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("--------------------------");
        System.out.println("1. Nhập danh sách động vật");
        System.out.println("2. Hiển thị danh sách động vật");
        System.out.println("3. Xóa 1 con vật khỏi vườn thú (Bằng Tên)");
        System.out.println("4. Animal say hello zoo!");
        System.out.println("5. Thoát");
        System.out.println("--------------------------");
        System.out.print("Lựa chọn : ");
        choose = input.nextInt();
        return choose;
    }
    
    public static void main(String[] args) {        
        Zoo animal = new Zoo();
        int chon;
        do {
            chon = menu();
            switch(chon) {
                case 1:
                    animal.add();
                    break;                    
                case 2:
                    animal.show();
                    break;
                case 3:
                    animal.remove();
                    break;
                case 4:
                    animal.sayHello();
                    break;
                case 5:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Lựa chọn sai! Mời lựa chọn lại");
            }
        } while (chon != 5);
    }
}
