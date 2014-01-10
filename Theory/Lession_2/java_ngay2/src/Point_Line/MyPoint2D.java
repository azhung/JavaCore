/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Point_Line;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MyPoint2D {
    double x,y;
    public void display(){
        System.out.println("X = " + x + ", Y = " +y);
    }
    public double distance(MyPoint2D p2){
        double x1,x2,y1,y2,kc;
        x1 = x;
        y1 = y;
        x2 = p2.x;
        y2 = p2.y;
        //kc = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        kc = Math.sqrt(Math.pow((x1-x2),2) + (y1-y2)*(y1-y2));
        return kc;
    }
    //Nhập thông tin x,y từ bàn phím
    public void input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("X = ");
        x = nhap.nextDouble();
        System.out.println("Y = ");
        y = nhap.nextDouble();
    }
}
