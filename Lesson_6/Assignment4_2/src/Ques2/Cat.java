/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques2;

/**
 *
 * @author azh
 */
public class Cat extends Animal{
    
    public Cat() {
        this.setName("");
    }
    
    public Cat(String ten) {
        this.setName(ten);
    }
    
    @Override
    public void sayHello() {
        System.out.println("Meow, my name is "+getName());
    }
    
}
