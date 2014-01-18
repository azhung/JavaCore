/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class bai_5 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT N : ");
        n = input.nextInt();
        if (snt(n) == true) System.out.println("La so nguyen to");
        else System.out.println("Khong phai so nguyen to");
    }
    
    public static boolean snt(int n) {
        if (n == 1 || n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
}
