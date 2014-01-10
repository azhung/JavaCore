package demo_access_specifier;


import demo_access_specifier.pk1.class1;
import demo_access_specifier.pk1.pk2.demo_access2;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class demo_access3 {
    public static void main(String[] args) {
        class1 a = new class1();
        a.x4 = 20; //lớp ở gói khác chỉ truy cập được thành phần public

        demo_access_specifier.pk1.class1 b = new demo_access_specifier.pk1.class1(10);
        demo_access_specifier.pk1.pk2.demo_access2 c;
        demo_access2 d;
        class1 e = new class1(10,20,30,40);
        //class1 f = new class1(10,20);
    }
}
