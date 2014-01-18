/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Point_Line;

/**
 *
 * @author Administrator
 */
public class Demo_Line {
    public static void main(String[] args) {

       
        MyLine l1 = new MyLine();
        MyLine l2 = new MyLine();
        System.out.println("Mời nhập đoạn 1");
        l1.input();
        System.out.println("Mời nhập đoạn 2");
        l2.input();
        double dodai1 = l1.length();
        double dodai2 = l2.length();
        if(dodai1==dodai2)  {
            System.out.println("Bằng nhau");
        }
        else if(dodai1<dodai2){
            System.out.println("L1 ngắn hơn L2");
        }
        else{
            System.out.println("L1 dài hơn L2");
        }
        //sử dụng hàm tạo có 2 tham số là 2 điểm
        MyPoint2D p1  = new MyPoint2D();
        p1.input();
        MyPoint2D p2  = new MyPoint2D();
        p2.input();
        MyLine l3 =new MyLine(p1,p2);
        MyLine l4 = new MyLine(l1);
    }
}
