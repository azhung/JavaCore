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
public class Cat extends Animal{
    private float high;
    
    public Cat() {
        super();
    }
    
    public Cat(String name, int age, float high) {
        super(name, age);
        this.high = high;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }
    
    @Override
    public void inputAnimal() {
        Scanner input = new Scanner(System.in);
        super.inputAnimal();
        System.out.print("Nhập chiều cao của mèo : ");
        float highCat = input.nextFloat();
        setHigh(highCat);
    }
    
    @Override
    public void showAnimal() {
        System.out.println("Tên :"+getName()+" | Tuổi : "+getAge()+" | Chiều cao: "+getHigh());
    }
    
    @Override
    public void sayHello() {
        System.out.println("Meoww, my name is "+getName());
    }
    
}
