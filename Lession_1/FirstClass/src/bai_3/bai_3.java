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
        Scanner input = new Scanner(System.in);
        int month, year;
        System.out.print("INPUT MONTH: ");
        month = input.nextInt();
        if (month == 2) {
            System.out.print("INPUT YEAR: ");
            year = input.nextInt();
            MonthToDay mtd = new MonthToDay(month, year);
            mtd.showDay();
        } else {
            MonthToDay mtd = new MonthToDay(month);
            mtd.showDay();
        }                
    }
}
