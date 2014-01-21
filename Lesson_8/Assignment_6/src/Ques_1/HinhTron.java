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
public class HinhTron implements Hinh{

    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
        this.banKinh = 0f;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập bán kính : ");
        double b = input.nextDouble();
        setBanKinh(b);
    }

    @Override
    public void hienThi() {
        System.out.println("Hình tròn có diện tích "+dienTich()+" chu vi "+chuVi());
    }

    @Override
    public double dienTich() {
        return getBanKinh() * getBanKinh() * Math.PI;
    }

    @Override
    public double chuVi() {
        return getBanKinh() * 2 * Math.PI;
    }
    
}
