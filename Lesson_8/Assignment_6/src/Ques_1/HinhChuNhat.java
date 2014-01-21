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
public class HinhChuNhat implements Hinh{
    
    private double cd;
    private double cr;

    public HinhChuNhat() {
        this.cd = 0;
        this.cr = 0;
    }

    public HinhChuNhat(double d, double r) {
        this.cd = d;
        this.cr = r;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    @Override
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        double d = input.nextDouble();
        setCd(d);
        input.nextLine();
        System.out.print("Nhập chiều rộng : ");
        double r = input.nextDouble();
        setCr(r);
    }

    @Override
    public void hienThi() {
        System.out.println("Hình chữ nhật có diện tích "+dienTich()+" và chu vi "+chuVi());
    }

    @Override
    public double dienTich() {
        return getCd() * getCr();
    }

    @Override
    public double chuVi() {
        return 2 * (getCd() + getCr());
    }
}
