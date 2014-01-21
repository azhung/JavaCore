/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_2.Vehicle.car;

import Ques_2.Vehicle.Vehicles;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Car extends Vehicles{

    private String color;

    public Car() {
        super();
        this.color = "";
    }

    public Car(String mk, String md, double p, String cl) {
        super(md, md, p);
        this.color = cl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Color: ");
        String cl = input.nextLine();
        setColor(cl);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" | Color : "+getColor());
    }

}
