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
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = input.nextInt();
        System.out.print("Nhap b: ");
        b = input.nextInt();
        GiaiPT gpt = new GiaiPT(a, b);
        gpt.showGPT();
    }
}
