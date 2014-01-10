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
public class Dog extends Animal{
    private float longBody;
    public Dog() {
        super();
        this.longBody = 0f;
    }
    
    public Dog(String name, int age, float longBody) {
        super(name, age);
        this.longBody = longBody;
    }

    public float getLongBody() {
        return longBody;
    }

    public void setLongBody(float longBody) {
        this.longBody = longBody;
    }
    
    @Override
    public void inputAnimal() {
        Scanner input = new Scanner(System.in);
        super.inputAnimal();
        System.out.print("Nhập chiều dài của chó : ");
        float lBody = input.nextFloat();
        setLongBody(lBody);
    }
    
    @Override
    public void showAnimal() {
        System.out.println("Tên :"+getName()+" | Tuổi : "+getAge()+" | Chiều dài: "+getLongBody());
    }
    
    @Override
    public void sayHello() {
        System.out.println("Woof, woof, my name is "+getName());
    }
    
}
