/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class bai_4 {
    public static void main(String[] args) {
        int a, b, c, tam;
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT A : ");
        a = input.nextInt();
        System.out.print("INPUT B : ");
        b = input.nextInt();
        System.out.print("INPUT C : ");
        c = input.nextInt();
        tam = ucln(a, b);
        System.out.println("UOC CHUNG LN 3 SO LA : " + ucln(tam, c));
    }
    
    public static int ucln(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}
