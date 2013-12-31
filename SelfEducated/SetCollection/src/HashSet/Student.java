/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HashSet;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Student {
    private String name;
    private int age;

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
    
    public void inputStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        String ten = input.nextLine();
        setName(ten);
        
        System.out.print("Nhập tuổi : ");
        int tuoi = input.nextInt();
        setAge(tuoi);        
    }
    
    public String showStudent() {
        return getName()+" | "+getAge();
    }
    
}
