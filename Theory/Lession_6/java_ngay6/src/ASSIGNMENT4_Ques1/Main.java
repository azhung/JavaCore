/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ASSIGNMENT4_Ques1;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        
        Triangle trian = new Triangle();
        trian.Input();
        if (trian.CheckTriangle() == false ) {
            System.out.println("Ba cạnh không phải cạnh của 1 tam giác");
            return;
        }
        System.out.println("Chu vi : "+trian.Perimeter());
        System.out.println("Diện tích : "+trian.Area());
       
        ETriangle etrian = new ETriangle();
        etrian.Input();
        if (etrian.CheckTriangle() == false ) {
            System.out.println("Ba cạnh không phải cạnh của 1 tam giác");
            return;
        }
        System.out.println("Chu vi : "+etrian.Perimeter());
        System.out.println("Diện tích : "+etrian.Area());

        ETriangle etrian2 = new ETriangle(10);
        System.out.println("Chu vi : "+etrian.Perimeter());
        System.out.println("Diện tích : "+etrian.Area());
    }
}
