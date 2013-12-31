/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author azhung
 * Bài 1: Viết chương trình nhập vào dãy N số nguyên với N <= 100 do người dùng nhập. Sắp xếp dãy số đã nhập theo thứ tự giảm dần và in ra màn hình
 */
public class bai_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1000, tg;
        while ( n > 100 ) {
            System.out.print("Nhap so phan tu cua mang : ");
            n = input.nextInt();
        }        
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Array["+(i+1)+"] = ");
            array[i] = input.nextInt();
        }
        
        for (int i = 0; i<array.length; i++) {
            for (int j = i+1; j<array.length; j++) {
                if (array[j] > array[i]) {
                    tg = array[i];
                    array[i] = array[j];
                    array[j] = tg;
                }
            }
        }
        
        for (int x : array) {
            System.out.print(x+ " ");
        }
        
    }
}
