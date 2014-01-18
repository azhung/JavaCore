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
public class bai_2 {
    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = input.nextInt();
        System.out.print("Nhap b: ");
        b = input.nextInt();
        System.out.print("Nhap c: ");
        c = input.nextInt();
        GiaiPTB2 gptb2 = new GiaiPTB2(a, b, c);
        gptb2.showGPT();
    }
}
