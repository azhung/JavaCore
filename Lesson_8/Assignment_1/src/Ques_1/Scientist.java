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
public class Scientist extends Employee{
    
    private int publication;

    public Scientist(){
        super();
        this.publication = 0;
    }
    
    public Scientist(String n, double s, int p){
        super(n, s);
        this.publication = p;
    }
    
    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }    
    
    @Override
    public double calculatePay() {
        double total_pay;
        if (getPublication() > 25) {
            total_pay = getSalary() + getSalary() * 0.2;
        } else {
            total_pay = getSalary() + getSalary() * 0.1;
        }        
        return total_pay;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.print(" | Publication : "+getPublication());
    }
    
}
