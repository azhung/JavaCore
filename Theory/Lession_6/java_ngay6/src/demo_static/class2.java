/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_static;

/**
 *
 * @author Tran Manh Truong
 */
public class class2 {
    public int x;
    public static int soluong=0;
    public class2()
    {
        x=0;
        soluong++;
    }
    public class2(int a)
    {
        x = a;
        soluong++;
    }
    public static void main(String[] args)
    {
        class2 c1 = new class2();
        class2 c2 = new class2(10);
        System.out.println("So luong phan tu da sinh ra la: " + class2.soluong);
        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
    }
}
