/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extendsPractice;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Person {
    public String name;
    public boolean sex;
    private int age;
    
    // Hàm tạo không có tham số truyền vào
    public Person() {
        this.name = "";
        this.sex = true;
        this.age = 0;
    }
    
    // Hàm tạo có tham số truyền vào là String ht và String sex
    public Person(String ht, String sex) {
        this.name = ht;
        // Kiểm tra nếu String sex = nam thì sex = true ngược lại = false;
        if (sex.equalsIgnoreCase("nam")) {
            this.sex = true;
        } else {
            this.sex = false;
        }        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {        
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }
          
    public void Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        this.name = input.nextLine();
        
        System.out.print("Nhập giới tính (Nam | Nữ)");
        String gt = input.nextLine();
        if (gt.equalsIgnoreCase("nam")) {
            this.sex = true;
        } else {
            this.sex = false;
        }
    }
    
    public void Output() {
        String gt;
        if (sex == true) gt = "Nam";
        else gt = "Nữ";
        System.out.println("Tên : "+name+" | "+"Giới tính : "+gt+" | "+age);
    }
    
}
