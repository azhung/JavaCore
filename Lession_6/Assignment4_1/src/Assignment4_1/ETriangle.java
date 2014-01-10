/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment4_1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ETriangle extends Triangle{

    public ETriangle() {
        super();
    }
    public ETriangle(int a)
    {
        super(a,a,a);
    }
    @Override
    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cạnh : ");
        Edge1 = Edge2 = Edge3 = input.nextInt();
    }
    @Override
    public double Perimeter() {
        double p;
        p = 3 * Edge1;
        return p;
    }

    @Override
    public double Area() {
        double s;
        s = Edge1*Edge1*Math.sqrt(3)/4;
        return s;
    }

}
