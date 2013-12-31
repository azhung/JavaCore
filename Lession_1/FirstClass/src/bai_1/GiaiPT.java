/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

/**
 *
 * @author azhung
 */
public class GiaiPT {
    double a, b;
    public GiaiPT(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void showGPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }   
        } else {
            System.out.println("Phuong trinh co nghiem x = "+(-b/a));
        }        
    }
    
}
