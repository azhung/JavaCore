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
public class Demo {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int chon;
        System.out.println("-----------------");

        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình vuông");
        System.out.println("3. Hình tròn");
        System.out.println("4. Thoát");

        System.out.println("-----------------");
        System.out.print("Lựa chọn : ");
        chon = input.nextInt();
        return chon;
    }

    public static void main(String[] args) {
        int choose;
        do {
            choose = menu();
            switch(choose) {
                case 1:
                    HinhChuNhat hcn = new HinhChuNhat();
                    work(hcn);
                    break;
                case 2:
                    HinhVuong hv = new HinhVuong();
                    work(hv);
                    break;
                case 3:
                    HinhTron ht = new HinhTron();
                    work(ht);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Input not correct! Please enter again!");
            }
        } while (choose != 4);

    }

    public static void work(Hinh h) {
        h.nhap();
        h.dienTich();
        h.chuVi();
        h.hienThi();
    }

}
