/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student {
    String rollNo, name;
    int age, score;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ma SV : ");
        this.rollNo = input.nextLine();
        System.out.print("Ten SV : ");
        this.name = input.nextLine();
        System.out.print("Tuoi : ");
        this.age = input.nextInt();
        System.out.print("Diem : ");
        this.score = input.nextInt();
    }

    public void display() {        
        System.out.println(this.rollNo +"\t"+this.name+"\t\t"+this.age+"\t"+this.score);
    }
}
