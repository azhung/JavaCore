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
    //class3 cùng gói thừa hưởng toàn bộ x1,x2,x2,x4
    //nhưng chỉ truy cập trực tiếp được
    //các thành phần public, protected và mặc định
    //trừ thành phần private từ lớp class1
    int x5;
    public void method2()
    {
        x1 = 10;
        x3 = 30;
        x4 = 40;
        x5 = 50;
        //this.x2 = 20;
        //không truy cập được, phải tạo phương thức public bên lớp cha để truy cập nếu cần
        method1();
    }
}
