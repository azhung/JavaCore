/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Assigment2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Count_Apperance {
    //Đếm số lần xuất hiện của chuỗi 2 trong chuỗi 1
    public static void main(String[] args) {
        String s1,s2;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập chuỗi s1:");
        s1 = nhap.nextLine();
        System.out.println("Nhập chuỗi s2:");
        s2 = nhap.nextLine();
        int d=0;
        int i=-1;
        while(true){
            i = s1.indexOf(s2, i+1);
            if(i>=0)
                d++;
            else
                break;
        }
        if(d==0)
            System.out.println("Chuỗi: " + s2 + " không có trong:" + s1);
        else
            System.out.println("Chuỗi : " + s2 + " xuất hiện " + d +" lần");
    }
}
