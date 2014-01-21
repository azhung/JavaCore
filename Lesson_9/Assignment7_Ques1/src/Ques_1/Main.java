/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_1;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("Mời bạn lựa chọn");
        System.out.println("------------------");        
        System.out.println("1. Nhập đường dẫn tới file");
        System.out.println("2. Nhập nội dung vào file");
        System.out.println("3. Hiển thị nội dung của file");
        System.out.println("4. Đếm số từ trong file");
        System.out.println("5. Thoát");
        System.out.println("------------------");
        System.out.print("Lựa chọn : ");
        choose = input.nextInt();
        return choose;
    }
    
    public static void main(String[] args) {
        int choose;
        FileObj fob = new FileObj();
        // D:\database\file\test2.txt
        do {
            choose = menu();
            
            switch (choose) {
                case 1:
                    fob.srcInput();
                    break;
                case 2:
                    fob.fileWrite();
                    break;
                case 3:
                    fob.fileRead();
                    break;
                case 4:
                    // Do something
                    fob.countWord();
                    break;
                case 5:
                    System.out.println("Goodbye!!!");
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại!");
            }
            
        } while (choose != 5);
    }
}
