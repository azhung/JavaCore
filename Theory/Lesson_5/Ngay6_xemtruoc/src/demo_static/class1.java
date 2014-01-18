/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_static;

/**
 *
 * @author Tran Manh Truong
 */
public class class1 {
    int x; //instance variable
    static int y=0; //class variable
    public class1()
    {
        x=0;
    }
    public void m1() //instance method
    {
        x++;
        y++;
    }
    public static void m2()
    {
        //phuong thuc tinh khong duoc phep truy cap
        //vao cac thanh phan khong static (instance variable) cua lop
        //x++;
        y++;
    }
    public static void main(String[] args)
    {
        class1 a = new class1();//tao doi tuong (instance - the hien) cua lop class1
        class1 b = new class1();
        a.x=10;
        b.x=20;
        class1.y =30;
        b.y=40;//thay doi gia tri cung bien dung chung y, cach nay khong nen su dung, vi de gay nham lan
        System.out.println("y1 = " + class1.y + ", y2 =" + a.y );
        a.m1();
        b.m1();
        class1.m2();//m2() la phuong thuc tinh
        b.m2();//cach nay duoc phep, nhung ko nen dung
    }
}
