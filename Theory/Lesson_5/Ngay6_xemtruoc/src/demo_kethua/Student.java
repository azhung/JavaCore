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
public class Student extends Person {
    int Diem;
    public Student(){
        super();
        Diem =0;
    }
    public Student(String ht, String gt, int d) {
        super(ht,gt);
        Diem = d;
    }
    @Override
    public void Input()
    {
        Scanner nhap = new Scanner(System.in);
        super.Input();//gọi phương thức Input() của lớp cha
        System.out.println("Nhập điểm:");
        Diem = nhap.nextInt();
    }
    @Override
    public void Display(){
        super.Display();
        System.out.println("Điểm: " + Diem);
    }
}
