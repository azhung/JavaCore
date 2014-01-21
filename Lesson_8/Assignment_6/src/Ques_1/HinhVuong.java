/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class HinhVuong extends  HinhChuNhat{

    double base;

    public HinhVuong() {
        super();
    }

    public HinhVuong(double b) {
        super(b, b);
    }    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cạnh của hình vuông : ");
        double c = input.nextDouble();
        setBase(c);
    }

    @Override
    public void hienThi() {
        System.out.println("Hình vuông có diện tích "+dienTich()+" chu vi "+chuVi());
    }

    @Override
    public double dienTich() {
        return getBase() * getBase();
    }

    @Override
    public double chuVi() {
        return getBase() * 4;
    }

}
