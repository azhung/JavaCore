/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class MyPoints {
    double x, y;
    
    public void inputPoint() {
        Scanner input = new Scanner(System.in);
        System.out.print("Toa do x : ");
        this.x = input.nextDouble();
        System.out.print("Toa do y : ");
        this.y = input.nextDouble();
    }
    
    
    public double distance(MyPoints pb) {
        double kc;
        kc = Math.sqrt(Math.pow((x-pb.x), 2) + Math.pow((y-pb.y), 2));
        return kc;
    }
    
}
