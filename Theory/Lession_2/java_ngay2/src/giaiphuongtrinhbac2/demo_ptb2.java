package giaiphuongtrinhbac2;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class demo_ptb2 {
    public static void main(String[] args)
    {
        //Tạo đối tượng của lớp PhuongTrinhBac2
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Chương trình giải Phương trình bậc2");
        System.out.println("Mời nhập  a= ");
        ptb2.a = nhap.nextDouble();
        System.out.println("Mời nhập  b= ");
        ptb2.b = nhap.nextDouble();
        System.out.println("Mời nhập  c= ");
        ptb2.c = nhap.nextDouble();
        //gọi phương thức GiaiPT()
        ptb2.GiaiPT();
    }
}






