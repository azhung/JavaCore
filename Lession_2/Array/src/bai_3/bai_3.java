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
        int n, tongLe = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang: ");
        n = input.nextInt();
        int[] array = new int[n];
        // int arrayLe[];
        for (int i = 0; i<array.length; i++) {
            System.out.print("Array["+(i+1)+"] = ");
            array[i] = input.nextInt();
        }
        
        for (int i = 0; i<array.length; i++) {
            if (array[i] % 2 != 0) {
                tongLe += array[i];                
            }            
        }
        System.out.println(tongLe);
        
    }
}
