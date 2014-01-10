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
public class Triangle {
    int Edge1, Edge2, Edge3;
    
    public Triangle() {
        Edge1 = 0;
        Edge2 = 0;
        Edge3 = 0;
    }
    public Triangle(int a, int b, int c)
    {
        Edge1 = a;
        Edge2 = b;
        Edge3 = c;
    }
    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cạnh 1 : ");
        Edge1 = input.nextInt();

        System.out.print("Nhập cạnh 2 : ");
        Edge2 = input.nextInt();

        System.out.print("Nhập cạnh 3 : ");
        Edge3 = input.nextInt();
    }

    public boolean CheckTriangle() {
        boolean check;
        if (Edge1 + Edge2 > Edge3 && Edge1 + Edge3 > Edge2 && Edge2 + Edge3 > Edge1) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public double Perimeter() {
        double p;
        p = Edge1 + Edge2 + Edge3;
        return p;
    }

    public double Area() {
        double s;
        double p = Perimeter()/2;
        s = Math.sqrt(p*(p-Edge1)*(p-Edge2)*(p-Edge3));
        return s;
    }
}
