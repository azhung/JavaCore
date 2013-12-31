/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author azhung
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap Chuoi : ");
        String str = input.nextLine();
        StringTokenizer token = new StringTokenizer(str, ";");
        System.out.println(token.countTokens());
        int tongLe = 0, tongChan = 0;
        while (token.hasMoreTokens()) {
            int n = Integer.parseInt(token.nextToken());
            if (n % 2 == 0) {
                tongChan += n;
            } else {
                tongLe += n;
            }
        }
        System.out.println("TONG : "+(tongChan + tongLe));
        System.out.println("TONG LE : "+tongLe);
        System.out.println("TONG CHAN : "+tongChan);
        
    }
}
