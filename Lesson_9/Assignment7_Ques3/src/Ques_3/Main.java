/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_3;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int chon;
        System.out.println("---------------");
        System.out.println("1. Tải dữ liệu từ file");
        System.out.println("2. Hiển thị các loại tiền tệ");
        System.out.println("3. Thêm mới dữ liệu vào file");
        System.out.println("4. Chuyển đổi tiền tệ");
        System.out.println("5. Thoát");
        System.out.println("---------------");
        System.out.print("Lựa chọn : ");
        chon = input.nextInt();        
        return chon;
    }
    // D:\Project\JavaCore\File\rate.txt
    public static void main(String[] args) {
        Exchange ex = new Exchange();
        int choose;
        do {
            
            choose = menu();
            switch(choose) {
                case 1:                    
                    // Do something here
                    ex.loadFile();
                    break;
                case 2:
                    // Do something here
                    ex.showCurrency();
                    break;
                case 3:
                    // Do something here
                    ex.addRecoderToFile();
                    break;
                case 4:
                    // Do something here
                    ex.convertCurrency();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại!");
            }
            
        } while (choose != 5);
        
    }
    
}
