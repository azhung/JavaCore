/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class Student {
    String rollNo, name;
    int age, score;
    
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ma SV: ");
        this.rollNo = input.nextLine();
        System.out.print("Ten SV: ");
        this.name = input.nextLine();
        System.out.print("Tuoi SV: ");
        this.age = input.nextInt();
        System.out.print("Diem SV: ");
        this.score = input.nextInt();
    }
    
    public void display() {
        System.out.println(this.rollNo+"\t"+this.name+"\t"+this.age+"\t"+this.score);
    }
    
}
