/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_2;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("-----------------------");
        System.out.println("1. Tải từ điển từ tệp");
        System.out.println("2. Hiển thị toàn bộ");
        System.out.println("3. Thêm từ mới");
        System.out.println("4. Tra từ");
        System.out.println("5. Xóa từ");
        System.out.println("6. Sửa từ");
        System.out.println("7. Ghi toàn bộ ra tệp mới");
        System.out.println("8. Thoát");
        System.out.println("-----------------------");
        System.out.print("Lựa chọn : ");
        choose = input.nextInt();
        return choose;
    }
    
    public static void main(String[] args) {
        int chon;
        // D:\database\file\dictionary.txt
        ListDictionary ld = new ListDictionary();
        do {
            chon = menu();
            switch (chon) {
                case 1:
                    // Do load dictionary
                    ld.loadDictionary();
                    break;
                case 2:
                    // Do show dictionary                    
                    ld.showDictioary();
                    break;
                case 3:
                    // Do add new Word
                    ld.insertDictionary();
                    break;
                case 4:
                    // Do Search Word
                    ld.searchWord();
                    break;
                case 5:
                    // Do Delete Word
                    ld.deleteWord();
                    break;
                case 6:
                    // Do change word
                    ld.editWord();
                    break;
                case 7:
                    // Do backup word to new file
                    ld.backUp();
                    break;
                case 8:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại");                    
            }
        } while (chon != 8);
    }
}
