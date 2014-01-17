/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_1;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        
        Manager m = new Manager("Hoang", 60000, 30000);        
        m.display();
        System.out.println(m.calculatePay());        
        
    }
}
