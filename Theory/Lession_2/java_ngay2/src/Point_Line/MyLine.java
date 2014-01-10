/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Point_Line;

/**
 *
 * @author Administrator
 */
public class MyLine {
    //khai báo 2 thuộc tính là điểm đầu cuối của đoạn thẳng
    MyPoint2D pa;
    MyPoint2D pb;
    //xây dựng hàm tạo (Constructor) để thực hiện các lệnh khỏi tạo
    // cho pa,pb khi đối tượng MyLine bắt đầu được sinh ra
    public MyLine(){
        pa = new MyPoint2D();
        pb = new MyPoint2D();
    }
    //hàm tạo có 2 tham số là 2 điểm có sẵn
    public MyLine(MyPoint2D p1, MyPoint2D p2){
        pa = p1;
        pb = p2;
    }
    //Hàm tạo có tham số là 1 đoạn đã có
    public MyLine(MyLine l)
    {
        pa = l.pa;
        pb = l.pb;
    }
    public void display(){
        System.out.println("Điểm đầu: ");
        pa.display();//hiển thị x,y của pa
        System.out.println("Điểm cuối: ");
        pb.display();//hiển thị x,y của pb
    }
    public void input(){
        System.out.println("Nhập điểm đầu:");
        pa.input();//gọi phương thức input của MyPoint2D để nhập x,y cho pa
        System.out.println("Nhập điểm cuối:");
        pb.input();//gọi phương thức input của MyPoint2D để nhập x,y cho pb
    }
    public double length(){
        return pa.distance(pb);
    }
}
