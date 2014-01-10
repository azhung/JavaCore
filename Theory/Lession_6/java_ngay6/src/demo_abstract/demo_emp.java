/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_abstract;

/**
 *
 * @author Tran Manh Truong
 */
public class demo_emp {
    public static void main(String[] args)
    {
        //KHong duoc dung lop truu tuong de tao doi tuong (instantiated)
        //Employee e1 = new Employee();
        Employee e2; //chi khai bao bien thi duoc, vi bien chi la bien tham chieu

        Manager m1 = new Manager("manager 1", 10000, 60000);
        Manager m2 = new Manager("manager 2", 10000, 40000);
        m1.display();
        System.out.println("Tong luong phai tra cua m1:" + m1.calculatepay());
        m2.display();
        System.out.println("Tong luong phai tra cua m2:" + m2.calculatepay());
        e2 = m1;
        e2.display();
    }
}
