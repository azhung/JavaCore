/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

/**
 *
 * @author azhung
 */
public class GiaiPTB2 {
    double a, b, c;
    public GiaiPTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void showGPT() {
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem x = "+(-b/(2*a)));
        } else {
            System.out.println("Phuong trinh co 2 nghiem x1 = "+((-b+Math.sqrt(delta))/(2*a))+"\n x2 = "+((-b-Math.sqrt(delta))/(2*a)));
        }
    }
}
