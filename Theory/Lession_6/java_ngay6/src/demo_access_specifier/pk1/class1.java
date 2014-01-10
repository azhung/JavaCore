/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_access_specifier.pk1;

/**
 *
 * @author Administrator
 */
/*
1.Same class(nội bộ lớp hiện tại): xem trong lớp class1
2.Other class in the same Package (lớp khác trong cùng gói): xem trong lớp demo_access1.java
3. Other class in other Package (lớp ở gói khác): xem trong lớp demo_access2
4. Inherited class in the same Package  (lớp kế thừa nằm trong cùng gói): xem trong lớp class3.java
5. Inherited class in the other Package (lớp kế thừa nằm ở gói khác): xem lớp class2.java
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
