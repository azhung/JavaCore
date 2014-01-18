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
public class demo_access2 {
    public static void main(String[] args) {
        class1 a = new class1();
        a.x4 = 20; //lớp ở gói khác chỉ truy cập được thành phần public
    }
}
