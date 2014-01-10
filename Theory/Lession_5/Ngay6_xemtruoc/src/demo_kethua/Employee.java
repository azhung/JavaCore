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
public class Employee extends Person {
    //đã được kế thừa các thành phần từ lớp Person
    float Luong;

    public Employee(){
        super();//gọi cấu tử không tham số của lớp cha, phải đặt lệnh này ở dòng đầu tiên
        //Hoten ="";
        //Gioitinh = false;
        Luong =0.0f;
    }
    public Employee(String ht, String gt, float l){
        super(ht,gt);//gọi cấu tử lớp cha cho nhất quán trong việc xử lý
        Luong =l;
    }
    //Ghi đè (Override) là kỹ thuật cho phép lớp con xây dựng một phương
    //thức có khuôn mẫu giống hệt phương thức đã kế thừa từ lớp cha
    @Override
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        super.Input();//gọi phương thức Input() của lớp cha
        System.out.println("Nhập lương:");
        Luong = nhap.nextFloat();
    }
    public void Hienthi()
    {
        Display();//gọi phương thức Display() đã được kế thừa từ lớp cha
        System.out.println("Lương:" + Luong);
        
    }
}
