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
public class demo_while {
    public static void main(String[] args) {
        int i=1;
        int n = -1;
        Scanner nhap = new Scanner(System.in);
        //n nhập số 2 cho tới khi n > 0 và n nhỏ hơn 100;
        while(n<=0 || n>=100)
        {
            System.out.print("Nhập n=");
            n = nhap.nextInt();
        }
        //hiện thị từ 1 đến n
        while(i<=n)
        {
            System.out.println("Lần thứ " + i);
            i++;
        }
    }
}





