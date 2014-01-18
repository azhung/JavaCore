/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

/**
 *
 * @author azhung
 */
public class MyLine {
    MyPoints pa;
    MyPoints pb;    
    public MyLine() {
        pa = new MyPoints();
        pb = new MyPoints();
    }
    public void inputLine() {
        System.out.println("Nhap Diem Dau -> ");        
        pa.inputPoint();
        System.out.println("Nhap Diem Cuoi -> ");
        pb.inputPoint();
    }
    
    public double lengthLine() {
        return pa.distance(pb);
    }
}
