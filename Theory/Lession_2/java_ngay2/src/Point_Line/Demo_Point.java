/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Point_Line;

/**
 *
 * @author Administrator
 */
public class Demo_Point {
    public static void main(String[] args) {
        MyPoint2D pa;
        pa = new MyPoint2D();//tạo đối tượng MyPoint2D gán cho pa
        pa.x =10;
        pa.y=20;
        MyPoint2D pb = new MyPoint2D();
        pb.x = 20;
        pb.y = 30;
        double kc = pa.distance(pb);
        System.out.println("Khoảng cách từ pa đến pb là:" + kc);

        System.out.println("Mời nhập điểm pa:");
        pa.input();
        System.out.println("Mời nhập điểm pb:");
        pb.input();
        kc = pa.distance(pb);
        System.out.println("Khoảng cách từ pa đến pb là:" + kc);
    }
}
