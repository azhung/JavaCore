/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Zoo {
    
    ArrayList<Animal> listAnimal = new ArrayList<>();
    ArrayList<Cat> listCat = new ArrayList<>();
    ArrayList<Dog> listDog = new ArrayList<>();
    
    public Zoo() {
    }
    
    public int menu() {        
        Scanner input = new Scanner(System.in);
        int chon;
        System.out.println("--------------------");
        
        System.out.println("1. Nhập Animal");
        System.out.println("2. Nhập Mèo");
        System.out.println("3. Nhập chó");
        
        System.out.println("--------------------");
        System.out.print("Lựa chọn : ");
        chon = input.nextInt();
        return chon;
    }
    
    public void inputZoo() {
        Scanner input = new Scanner(System.in);
        int i = 1;
        String accept;
        do {
            int chon = menu();
            System.out.println("Nhập con vật thứ "+i);
            switch(chon) {
                case 1:
                    Animal ani = new Animal();
                    ani.inputAnimal();
                    listAnimal.add(ani);
                    break;
                case 2:
                    Cat c = new Cat();
                    c.inputAnimal();
                    listCat.add(c);
                    break;
                case 3:
                    Dog d = new Dog();
                    d.inputAnimal();
                    listDog.add(d);
                    break;
                default: System.out.println("Lựa chọn sai vui long chọn lại");
            }
            System.out.print("Bạn có muốn nhập tiếp (Y|N) : ");
            accept = input.nextLine();
            i++;
        } while (accept.equalsIgnoreCase("y"));
    }
    
    public void showListAnimal() {
        for (int i = 0; i<listAnimal.size(); i++) {
            listAnimal.get(i).showAnimal();
        }
        for (int i = 0; i<listCat.size(); i++) {
            listCat.get(i).showAnimal();
        }
        for (int i = 0; i<listDog.size(); i++) {
            listDog.get(i).showAnimal();
        }
    }
    
    public void sayHello() {
        for (int i = 0; i<listAnimal.size(); i++) {
            listAnimal.get(i).sayHello();
        }
        for (int i = 0; i<listCat.size(); i++) {
            listCat.get(i).sayHello();
        }
        for (int i = 0; i<listDog.size(); i++) {
            listDog.get(i).sayHello();
        }
    }
    
}
