/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_2.Vehicle;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Vehicles implements Ivehicle{

    private String maker;
    private String model;
    private double price;

    public Vehicles() {
        this.maker = "";
        this.model = "";
        this.price = 0f;
    }

    public Vehicles(String ma, String mo, double p) {
        this.maker = ma;
        this.model = mo;
        this.price = p;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Maker : ");
        String mk = input.nextLine();
        setMaker(mk);
        System.out.print("Model : ");
        String md = input.nextLine();
        setModel(md);
        System.out.print("Price : ");
        double pr = input.nextDouble();
        input.nextLine();
        setPrice(pr);
    }

    @Override
    public void display() {
        System.out.print("Product : "+getModel()+" | Maker : "+getMaker()+" | Price : "+getPrice());
    }

}
