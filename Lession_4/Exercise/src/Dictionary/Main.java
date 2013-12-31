/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dictionary;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("----------------------");
        System.out.println("[1]. Thêm từ mới (Từ và nghĩa cách nhau bởi dấu ':')");
        System.out.println("[2]. Hiển thị toàn bộ");
        System.out.println("[3]. Tra từ");
        System.out.println("[4]. Sửa từ");
        System.out.println("[5]. Xóa từ");
        System.out.println("[6]. Thoát");
        System.out.println("----------------------");
        System.out.print("Lựa chọn: ");
        choose = input.nextInt();
        return choose;
    }
    
    public static void main(String[] args) {
        ListWords list = new ListWords();
        int chon;
        do{
            chon = menu();
            switch(chon) {
            case 1:
                // Do something
                list.input();
                break;
            case 2:
                // Do Something
                list.listWordShow();
                break;
            case 3:
                // Do Something
                list.searchWord();
                break;
            case 4:
                // Do something
                list.editWord();
                break;
            case 5:
                // Do something
                list.delWord();
                break;
            case 6:
                System.out.println("Tạm biệt");
                break;
            default:
                System.out.println("Nhập sai! Vui lòng nhập lại");
        }
        } while(chon != 6);
    }
}
