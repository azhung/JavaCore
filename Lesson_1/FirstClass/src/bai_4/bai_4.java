/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

/**
 *
 * @author azhung
 */
public class bai_4 {
    public static void main(String[] args) {        
        System.out.println("Nhap Diem A: ");
        MyPointer2D pointA = new MyPointer2D();
        pointA.input();
        System.out.println("Nhap Diem B: ");
        MyPointer2D pointB = new MyPointer2D();
        pointB.input();
        System.out.println("Khoang Cach: "+pointA.distance(pointB));
    }
}
