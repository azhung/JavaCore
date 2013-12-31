/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {    
    public static void main(String[] args) {
        ArrayList<Dictionary> listDictionary = new ArrayList();
        Scanner input = new Scanner(System.in);        
        int choose;
        do {
            System.out.println("-- Nhấn 1: Để nhập dữ liệu");
            System.out.println("-- Nhấn 2: Để tra nghĩa");
            System.out.println("-- Nhấn 3: Để thoát");
            choose = input.nextInt();
            input.nextLine();
            switch(choose) {
                case 1:
                    // Do anything
                    System.out.print("SO TU CAN NHAP : ");
                    int n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        Dictionary dic = new Dictionary();
                        dic.wordData();
                        listDictionary.add(dic);
                    }
                    break;
                case 2:
                    // Do something
                    System.out.print("TU CAN TRA : ");
                    String word = input.nextLine();
                    for (int i = 0; i<listDictionary.size(); i++) {
                        if (listDictionary.get(i).getNewWord().equalsIgnoreCase(word)) {
                            listDictionary.get(i).showData();
                        }
                    }
                    break;                    
                case 3:
                    break;
                default:
                    System.out.println("LUA CHO SAI");
                    break;
            }
        } while (choose != 3);
    }
}
