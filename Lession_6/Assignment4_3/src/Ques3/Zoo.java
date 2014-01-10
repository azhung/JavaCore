/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Zoo {
    
    ArrayList<Animal> listAnimal = new ArrayList<Animal>();
    
    public Zoo() {    
    }
    
    public void add() {
        Scanner input = new Scanner(System.in);
        int i = 1;
        String accept;
        do {
            System.out.println("Nhập con vật thứ "+i);
            Animal ani = new Animal();
            ani.inputAnimal();
            if (checkName(ani.getName())) {
                System.out.println("-----Tên con vật đã tồn tại-----");
            } else {
                listAnimal.add(ani);
            }            
            System.out.print("Bạn muốn nhập tiếp (Y|N) : ");
            accept = input.nextLine();
            i++;
        } while(accept.equalsIgnoreCase("y"));
    }
    
    public void remove() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên con vật muốn xóa : ");
        String ten = input.nextLine();
        int position = 0;
        if (!checkName(ten)) {
            System.out.println("-----Tên con vật không tồn tại-----");
        } else {
            for (int i = 0; i<listAnimal.size(); i++) {
                if (ten.equalsIgnoreCase(listAnimal.get(i).getName())) {
                    position = i;
                    break;
                }
            }
            listAnimal.remove(position);
            System.out.println("Remove Successful");
        }
    }
    
    public boolean checkName(String name) {
        for (int i = 0; i<listAnimal.size(); i++) {
            if (name.equalsIgnoreCase(listAnimal.get(i).getName())) {
                return true;
            }
        }        
        return false;
    }
    
    public void sayHello() {
        for (int i = 0; i<listAnimal.size(); i++) {
            listAnimal.get(i).sayHello();
        }
    }
    
    public void show() {
        for (int i = 0; i<listAnimal.size(); i++) {
            listAnimal.get(i).outputAnimal();
        }
    }
}
