/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Assigment2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class Ques3_Assigment2 {
    public static void main(String[] args) {
        String str;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập một chuỗi:");
        str = nhap.nextLine();
        StringTokenizer stk = new StringTokenizer(str,";");
        int tc=0, tl=0;
        while(stk.hasMoreTokens()){
            int n = Integer.parseInt(stk.nextToken());
            if(n%2==0)
                tc+=n;
            else
                tl+=n;
        }
        System.out.println("Tổng chẵn: " + tc);
        System.out.println("Tổng lẻ: " +tl);
        System.out.println("Tổng là: " + (tc+tl));
    }
}
