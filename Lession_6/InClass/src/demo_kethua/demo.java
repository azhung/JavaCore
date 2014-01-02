/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_kethua;

/**
 *
 * @author Administrator
 */
public class demo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.Hoten = "abc";
        p1.Gioitinh = false;
        p1.setTuoi(50);
        System.out.println("Họ tên " + p1.Hoten);
        System.out.println("Tuổi " + p1.getTuoi());
    }
}
