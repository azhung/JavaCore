package Ques2_Bai_String;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Capitalize {
    public static void main(String[] args) {
        String s1;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap chuoi ban dau dang CHU HOA");
        s1 = nhap.nextLine();
        StringBuilder sb = new StringBuilder(s1);
        for(int i=1; i<s1.length();i++)
        {
            char kt1 = s1.charAt(i-1);
            char kt2 = s1.charAt(i);
            if(kt1 != ' ')
            {
                kt2 = Character.toLowerCase(kt2);
                sb.setCharAt(i, kt2);
            }
        }
        System.out.println(sb);
        //gán ký tự cho chuỗi
        String s;
        char kt = 'a';
        //s = a;
        s = String.valueOf(kt);
    }
}
