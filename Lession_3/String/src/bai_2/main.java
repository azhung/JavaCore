/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = new String();
        String tmp = "";
        System.out.print("STRING INPUT : ");
        str = input.nextLine();        
        // Đưa tất cả về chữ thường
        // System.out.println(str.toLowerCase());
        // Đưa tất cả về chữ in hoa
        // System.out.println(str.toUpperCase());
        // Viet Hoa sau dau cach
        str = str.trim();
        while (str.indexOf("  ") != -1){
            str = str.replaceAll("  ", " ");
        }
        String strArray[] = str.split(" ");
        for (int i = 0; i<strArray.length; i++) {
            tmp += convert(strArray[i])+" ";
        }
        System.out.println(tmp);
    }
    
    public static String convert(String str) {
        String st = "";
        str = str.toLowerCase();
        st = String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);        
        return st;
    }
}
