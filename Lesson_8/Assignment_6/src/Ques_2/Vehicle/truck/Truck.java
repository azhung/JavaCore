/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_2.Vehicle.truck;

import Ques_2.Vehicle.Vehicles;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Truck extends Vehicles{

    private int truckLoad;

    public Truck() {
        super();
        this.truckLoad = 0;
    }

    public Truck(String mk, String md, double p, int tl) {
        super(md, md, p);
        this.truckLoad = tl;
    }

    public int getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(int truckLoad) {
        this.truckLoad = truckLoad;
    }


    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.print("Truck Load : ");
        int tl = input.nextInt();
        input.nextLine();
        setTruckLoad(tl);
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" | Truck Load : "+getTruckLoad());
    }
    
}
