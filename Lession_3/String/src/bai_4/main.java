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
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = new String();
        System.out.print("STRING 1 : ");
        str = input.nextLine();
        StringBuffer str1 = new StringBuffer(str).reverse();
        System.out.println(str1);
        if (str.toString().equals(str1.toString()) == true) {
            System.out.println("String is Symmetric");
        } else {
            System.out.println("String is not symmetric");
        }
    }
}

