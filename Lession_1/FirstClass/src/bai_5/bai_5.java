/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author azhung
 */
public class bai_5 {
    public static void main(String[] args) {
        Date timeReal = new Date();
        SimpleDateFormat dinhDangTG = new SimpleDateFormat("HH:mm - dd/MM/yyyy");
        String timeShow = dinhDangTG.format(timeReal.getTime());
        System.out.println(timeShow);
        
        long start = System.currentTimeMillis();
        MyLine l1 = new MyLine();
        System.out.println("-------->LINE 1");
        l1.inputLine();
        double longL1 = l1.lengthLine();
        MyLine l2 = new MyLine();
        System.out.println("-------->LINE 2");
        l2.inputLine();
        double longL2 = l2.lengthLine();
        if (longL1 == longL2) {
            System.out.println("Hai Doan Bang Nhau");
        } else if (longL1 > longL2) {
            System.out.println("Doan 1 lon hon doan 2");
        } else System.out.println("Doan 2 lon hon doan 1 ");
        long end = System.currentTimeMillis();
        
        System.out.println("Thoi Gian Chay : "+(end-start));
    }
}
