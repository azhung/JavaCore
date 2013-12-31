/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class bai_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, dem = 0;
        System.out.print("Nhap So Phan Tu Mang: ");
        n = input.nextInt();
        int[] array = new int[n];
        int[] arrayCP = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Array["+(i+1)+"] = ");
            array[i] = input.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {            
            if (checkCP(array[i]) == true) {                
                arrayCP[dem] = array[i];
                dem++;
            }
        }
        System.out.println("SO PHAN TU LA CHINH PHUONG: "+dem);
        System.out.print("DAY SO CHINH PHUONG LA : ");
        for (int i = 0; i < dem; i++) {
            System.out.print(arrayCP[i]+" ");
        }
    }
    
    
    public static boolean checkCP(int x) {
        if (x == 1) return true;
        for (int i = 0; i < (x/2); i++) {
            if (i*i == x) return true;
        }
        return false;
    }
    
}
