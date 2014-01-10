/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_Overloading;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_overload {
    public static int Tong(int a, int b)
    {
        return a+b;
    }
    public static float Tong(float a, float b)
    {
        return a+b;
    }
    public static double Tong(String a, String b)
    {
        double n1,n2;
        n1 = Double.parseDouble(a);
        n2 = Double.parseDouble(b);
        return n1+n2;
    }
    public static void main(String args[])
    {
        int n1=10, n2=20;
        float n3=15.5f, n4=5f;
        double n5 = 5.5;
        System.out.println("Tong 1 = " + Tong(n1,n2));
        System.out.println("Tong 2 = " + Tong(n3,n4));
        System.out.println("Tong 3 = " + Tong(n1,n3));
        //Len duoi loi vi khong co ham Tong nao nhan dau vao la so double
        //System.out.println("Tong 4 = " + Tong(n3,1n5));
        System.out.println("Tong 5 = " + Tong("12","34"));
    }
}





