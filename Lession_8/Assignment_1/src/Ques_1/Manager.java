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
public class Manager extends Employee{
    
    private double business_amount;
    
    public Manager() {
        super();
    }
    
    public Manager(String n, double s, double ba) {
        super(n, s);
        this.business_amount = ba;
    }
    
    public double getBusiness_amount() {
        return business_amount;
    }

    public void setBusiness_amount(double business_amount) {
        this.business_amount = business_amount;
    }        

    @Override
    public double calculatePay() {
        double total_pay;
        
        if (business_amount > 50000) {
            total_pay = getSalary() + business_amount * 0.1;
        } else {
            total_pay = getSalary() + business_amount * 0.05;
        }
        
        return total_pay;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.print(" | Business Amount : "+getBusiness_amount());
    }
    
}
