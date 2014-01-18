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
        // Khai bao so phan tu cua mang        
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT N (SO PHAN TU MANG) : ");
        n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< arr.length; i++) {
            System.out.print("Arr["+(i+1)+"] = ");
            arr[i] = input.nextInt();
        }        
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
