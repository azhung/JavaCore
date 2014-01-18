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
public class Animal {
    private String name;
    
    public Animal() {
        this.name = "";
    }
    
    public Animal(String ten) {
        this.name = ten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void sayHello() {
        System.out.println("Hi! I\'m Animal, my name is "+getName());
    }
}
