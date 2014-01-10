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
public class Dog extends Animal{
    public Dog() {
        super();
        this.setName("");
    }
    
    public Dog(String ten) {
        this.setName(ten);
    }
    
    @Override
    public void sayHello() {
        System.out.println("Woof, woof, my name is "+getName());
    }
}
