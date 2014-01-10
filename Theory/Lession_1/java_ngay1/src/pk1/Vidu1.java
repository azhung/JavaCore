/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pk1;

/**
 *
 * @author Administrator
 */
public class Vidu1 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int a,b;
        float c;
        double d;
        char kytu;
        a = 10;
        c = 5.5f;
        d = 5.5;
        kytu = 'a';
        int x1 = 26;//số 26 ở hệ đếm cơ số 10
        System.out.println("x1 = " + x1);
        int x2 =026;//số 26 ở hệ đếm cơ số 8
        System.out.println("x2 = " + x2);//x2 =22
        int x3 = 0x1A;
        System.out.println("x3 = " + " là: " + x3);
        String hoten = "ITPlus";
        System.out.println("Hello: " + hoten);

        System.out.println("123" + 45);//dấu + để ghép chuỗi với số
        System.out.println(123+45);//dấu + để cộng 2 số
        //phép chia lấy dư chỉ áp dụng cho 2 số nguyên
        int a1 = 7%2;
        System.out.println("a1=" + a1);
        int a2 = 7/2;
        System.out.println("a2=" + a2);
        double a3 = 7/2;
        System.out.println("a3 = " + a3);
        double a4 = 7.0/2;
        System.out.println("a4 = " + a4);
        int bac = 7;
        int sochia =2;
        double Luong = 1000000 * ((double)bac/sochia);
        System.out.println("Luong: " + Luong);
    }
}
