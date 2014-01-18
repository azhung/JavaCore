/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_kethua;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Person {
    public String Hoten;
    public boolean Gioitinh;
    private int tuoi; //thành phần private thì lớp con không được kế thừa
    //Xây dựng một số cấu tử (hàm tạo) - Constructor
    public Person(){
        tuoi =0;
        Hoten ="";
        Gioitinh = true;
    }
    public Person(String ht, String gt){
        Hoten = ht;
        if(gt.equalsIgnoreCase("nam"))
            Gioitinh = true;
        else
            Gioitinh = false;
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Mời nhập họ tên:");
        Hoten = nhap.nextLine();
        System.out.println("Giới tính (Nam/Nữ)");
        String gt  = nhap.nextLine();
        if(gt.equalsIgnoreCase("Nam"))
            Gioitinh = true;
        else
            Gioitinh = false;
    }
    public void Display(){
        System.out.println("Tuổi (Riêng tư):" + tuoi);
        System.out.println("Họ tên: " + Hoten);
        System.out.println((Gioitinh)?"Nam":"Nữ");
    }
    public void setTuoi(int t){
        if(t>0 && t<=150)
            tuoi = t;
    }
    public int getTuoi(){
        return tuoi;
    }
}
