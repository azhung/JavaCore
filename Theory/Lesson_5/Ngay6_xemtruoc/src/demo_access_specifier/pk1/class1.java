/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_access_specifier.pk1;

/**
 *
 * @author Administrator
 */
public class class1 {
    int x1;//quyền mặc định
    private int x2;
    protected int x3;
    public int x4;
    //hàm tạo (constructor)
    public class1()
    {
        System.out.println("Hello1");
    }
    public class1(int n1)
    {
        System.out.println("Hello2");
    }
    public class1(int n1,int n2,
            int n3, int n4)
    {
        System.out.println("Hello3");
    }
    public void method1()
    {
        x1 = 10;
        x2 = 20;
        x3 = 30;
        x4 = 40;
    }
}
