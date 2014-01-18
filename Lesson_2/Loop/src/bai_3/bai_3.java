/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class bai_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT A : ");
        a = input.nextInt();
        System.out.print("INPUT B: ");
        b = input.nextInt();        
        System.out.println("USCLN : "+uscln(a, b));
    }
    
    public static int uscln(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }            
        return a;
    }
}
