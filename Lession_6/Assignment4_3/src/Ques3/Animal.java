/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques3;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Animal {
    private String name;
    private int age;
    private String from;

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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    
    public void inputAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        String ten = input.nextLine();
        setName(ten);
        
        System.out.print("Nhập tuổi : ");
        int tuoi = input.nextInt();
        input.nextLine();
        setAge(tuoi);
        
        System.out.print("Nhập nơi đến : ");
        String dentu = input.nextLine();
        setFrom(dentu);
    }
    
    public void outputAnimal() {
        System.out.println("Tên : "+getName()+" | "+"Tuổi : "+getAge()+" | "+"Đến từ : "+getFrom());
    }
    
    public void sayHello() {
        System.out.println("Hello zoo! I\'m is "+getName());
    }
}
