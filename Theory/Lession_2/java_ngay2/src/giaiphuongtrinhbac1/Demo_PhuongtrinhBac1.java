/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package giaiphuongtrinhbac1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Demo_PhuongtrinhBac1 {
    public static void main(String[] args) {
        //khai báo đối tượng nhập liệu
        Scanner nhap = new Scanner(System.in);
        //khai báo biến và tạo đối tượng PhuongTrinhBac1
        PhuongTrinhBac1 pt = new PhuongTrinhBac1();
        System.out.println("Nhập a=");
        pt.a = nhap.nextDouble();//nhập số thực double
        System.out.println("Nhập b =");
        pt.b = nhap.nextDouble();//nhập số thực double
        System.out.println("Kết quả:");
        pt.GiaiPT();
    }
}
