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
public class Laborer extends Employee{

    private int hrsworked;

    public Laborer() {
        super();
        this.hrsworked = 0;
    }
    
    public Laborer(String n, double s, int h) {
        super(n, s);
        this.hrsworked = h;
    }
    
    public int getHrsworked() {
        return hrsworked;
    }

    public void setHrsworked(int hrsworked) {
        this.hrsworked = hrsworked;
    }    
    
    @Override
    public double calculatePay() {
        double total_pay;
        
        if (getHrsworked() > 50) {
            total_pay = getSalary() + getSalary() * 0.15;
        } else {
            total_pay = getSalary() + getSalary() * 0.08;
        }
        
        return total_pay;
    }
    
    @Override
    public void display() {     
        super.display();
        System.out.print(" | Hours Worked : "+getHrsworked());
    }
}
