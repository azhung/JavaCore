/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class bai_1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra : ");
        n = input.nextInt();
        System.out.println("KQ: "+giaiThua(n));
    }
    
    public static int giaiThua(int x) {
        if (x < 2) {
            return 1;
        } else {
            return x*giaiThua(x-1);
        }
    }
}
