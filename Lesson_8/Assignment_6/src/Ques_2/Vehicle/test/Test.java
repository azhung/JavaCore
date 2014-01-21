/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_2.Vehicle.test;

import Ques_2.Vehicle.Ivehicle;
import Ques_2.Vehicle.car.Car;
import Ques_2.Vehicle.truck.Truck;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Test {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int chon;
        System.out.println("-----------------");

        System.out.println("1. Input");
        System.out.println("2. Display");
        System.out.println("3. Sort by Price");
        System.out.println("4. Search by model");
        System.out.println("5. Exit");

        System.out.println("-----------------");
        System.out.print("Lựa chọn : ");
        chon = input.nextInt();
        input.nextLine();
        return chon;
    }

    public static void main(String[] args) {
        int choose;        
        Car[] c = new Car[2];
        Truck[] t = new Truck[2];        
        do {
            choose = menu();
            switch(choose) {
                case 1:                    
                    for (int i = 0; i < c.length; i++) {
                        // CHU Y CHO NAY
                        c[i] = new Car();
                        System.out.println("Nhập sản phẩm car "+(i+1));
                        c[i].input();
                    }
                    for (int i = 0; i < t.length; i++) {
                        t[i] = new Truck();
                        System.out.println("Nhập sản phẩm truck "+(i+1));
                        t[i].input();
                    }
                    break;
                case 2:                    
                    for (Car c1 : c) {
                        // CHU Y CHO NAY
                        c1.display();
                    }
                    for (Truck t1 : t) {
                        t1.display();
                    }
                    break;
                case 3:
                    // Do something
                    break;
                case 4:
                    // Do something
                    break;
                case 5:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Input not correct! Please enter again!");
            }
        } while (choose != 5);
    }    

}
