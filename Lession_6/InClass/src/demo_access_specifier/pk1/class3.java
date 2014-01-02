/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_access_specifier.pk1;

/**
 *
 * @author Administrator
 */
public class class3 extends class1 {
    //class3 cùng gói thừa hưởng các thành phần public, protected và mặc định
    //trừ thành phần private từ lớp class1
    int x5;
    public void method2()
    {
        x1 = 10;
        x3 = 30;
        x4 = 40;
        x5 = 50;
        method1();
    }
}
