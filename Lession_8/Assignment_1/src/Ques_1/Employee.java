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
public abstract class Employee {
    
    private String name;
    private double salary;
    
    public Employee() {
        this.name = "";
        this.salary = 0f;
    }
    
    public Employee(String name, double s) {
        this.name = name;
        this.salary = s;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public abstract double calculatePay();
    
    public void display() {
        System.out.print("Name : "+getName()+" | "+"Salary : "+getSalary());
    }
}
