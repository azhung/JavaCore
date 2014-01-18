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
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Elephent");
        a.sayHello();
        
        Cat c = new Cat("Tom");
        c.sayHello();
        
        Dog d = new Dog("Rex");
        d.sayHello();
    }
}
