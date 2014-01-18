/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques4;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Animal {
    private String name;
    private int age;
    
    public Animal() {
        this.name = "";
        this.age = 0;
    }
    
    public Animal(String ten, int tuoi) {
        this.name = ten;
        this.age = tuoi;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void inputAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        String ten = input.nextLine();
        setName(ten);
        System.out.print("Nhập tuổi : ");
        int tuoi = input.nextInt();
        setAge(tuoi);        
    }
    
    public void showAnimal() {
        System.out.println("Tên :"+getName()+" | "+"Tuổi : "+getAge());
    }
    
    public void sayHello() {
        System.out.println("Hi, I am animal, my name is "+getName()+" and "+getAge()+" year old!");
    }
    
}
