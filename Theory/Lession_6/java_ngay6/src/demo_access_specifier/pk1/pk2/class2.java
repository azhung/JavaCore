/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_access_specifier.pk1.pk2;

import demo_access_specifier.pk1.class1;

/**
 *
 * @author Administrator
 */
public class class2 extends class1 {
    //lớp con khác gói chỉ được truy cập thành phần public, protected
    public class2(){
      
    }
    public void method2()
    {
        //x1 = 10;
        x3 = 30;
        x4 = 40;
        //x5 = 50;
        //this.x2 = 20;
        //không truy cập được, phải tạo phương thức public bên lớp cha để truy cập nếu cần
        method1();
    }
}
