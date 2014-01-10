/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pk1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Sinhvien {
    //khai báo thuộc tính - là biến để lưu thông tin
    public String hoten;
    public int tuoi;
    //khai báo các phương thức - là hàm để lập trình thể hiện các hành động
    //khai báo một số hàm tạo (constructor)
    public Sinhvien()
    {
        hoten = "";
        tuoi =0;
    }
    public Sinhvien(String ht, int t)
    {
        hoten = ht;
        tuoi =t;
    }
    public Sinhvien(String ht)
    {
        hoten = ht;
        tuoi =0;
    }
    public void hienthi()
    {
        System.out.println("Họ tên: " + hoten);
        System.out.println("Tuổi: " + tuoi);
    }
    //hàm nhập liệu từ bàn phím
    public void nhapthongtin()
    {
        Scanner nhap = new Scanner(System.in);//khai báo biến để nhập liệu
        System.out.println("Nhập họ tên:");
        hoten = nhap.nextLine();
        System.out.println("Nhập tuổi:");
        tuoi = nhap.nextInt();
    }
}
