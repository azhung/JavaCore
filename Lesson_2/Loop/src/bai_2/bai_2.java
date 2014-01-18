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
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        int i = 0;       
        do {
            System.out.print("Arr["+(i+1)+"] = ");
            array[i] = input.nextInt();            
            i++;
        } while (array[i-1] != 0);
        
        System.out.println(checkMax(array));
    }
    
    public static int checkMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }        
        return max;
    }
    
}
