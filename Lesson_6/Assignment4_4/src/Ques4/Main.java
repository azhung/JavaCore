/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques4;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int chon;
        System.out.println("---------------------");
        System.out.println("1. Nhập danh sách động vật");
        System.out.println("2. Hiển thị danh sách động vật trong vườn thú");
        System.out.println("3. All Animal say Hello zoo");
        System.out.println("4. Thoát");
        System.out.println("---------------------");
        System.out.print("Lựa chọn : ");
        chon = input.nextInt();
        return chon;
    }
    
    public static void main(String[] args) {
        Zoo z = new Zoo();
        int chon;
        do {
            chon = menu();
            switch(chon) {
                case 1:
                    z.inputZoo();
                    break;
                case 2:
                    z.showListAnimal();
                    break;
                case 3:
                    z.sayHello();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default: System.out.println("Nhập sai vui lòng nhập lại!");                                
            }
        } while(chon != 4);
    }
}
