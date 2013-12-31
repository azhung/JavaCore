/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class bai_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, dem = 0;        
        System.out.print("Nhap so phan tu cua mang :");
        n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Array["+(i+1)+"] = ");
            array[i] = input.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("MAX : "+min);
        
    }
}
