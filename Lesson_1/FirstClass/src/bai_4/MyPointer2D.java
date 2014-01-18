/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class MyPointer2D {
    double x, y;    
    
    public void display() {
        System.out.println("X = "+x+" Y = "+y);
    }
    
    public double distance(MyPointer2D pb) {
        double kc = Math.sqrt(Math.pow((x-pb.x), 2) + Math.pow((y-pb.y), 2));
        return kc;
    }
    
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT X : ");
        x = input.nextInt();
        System.out.print("INPUT Y : ");
        y = input.nextInt();
    }
    
}
