package Demo_VongLap;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class demo_dowhile {
public static void main(String[] args) {
    int tuoi;
    Scanner nhap = new Scanner(System.in);
    do
    {
    System.out.print("nhập tuổi >0 và <=100:");
    tuoi = nhap.nextInt();
    }while(tuoi<=0 || tuoi>100);
    System.out.println("Tuổi bạn là: " + tuoi);
}
}





