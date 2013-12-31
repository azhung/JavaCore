/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HashSet;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class HashStudents {
    HashSet<Student> listStudents = new HashSet<>();
    
    public HashStudents() {
    
    }
    
    public void inputHashStudent() {
        Scanner input = new Scanner(System.in);
        int stt = 0;
        String choose;
        do {
            System.out.println("Nhập sinh viên thứ "+(stt+1));
            Student stu = new Student();
            listStudents.add(stu);
            System.out.print("Nhập tiếp khoong (Y|N) : ");
            choose = input.nextLine();
            stt++;
        } while(choose.equalsIgnoreCase("y"));
    }
    
    public void showListStudent() {
        
    }
    
}
