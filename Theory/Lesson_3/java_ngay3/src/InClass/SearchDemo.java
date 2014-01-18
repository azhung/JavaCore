/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InClass;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SearchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap So Sinh Vien: ");
        int n = input.nextInt();
        input.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Sinh vien "+(i+1)+" : ");
            array[i] = input.nextLine();
        }

        for (String x : array) {
            System.out.print(x+" | \n");
        }

        System.out.print("Nhap Nguoi Can Tim Kiem: ");
        String search = input.nextLine();
        for (int i = 0; i<array.length; i++) {
            if (array[i].indexOf(search) > 0) {
                System.out.print(array[i]+" | ");
            }
        }
    }   
}
