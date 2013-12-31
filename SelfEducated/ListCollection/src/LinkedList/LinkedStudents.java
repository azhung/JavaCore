/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class LinkedStudents {
    LinkedList<Student> listStudents = new LinkedList<>();
    
    public LinkedStudents() {
        
    }
    
    public void inputList() {
        Scanner input = new Scanner(System.in);
        int stt = 0;
        String choose;
        do {
            System.out.println("Nhập sinh viên thứ "+(stt+1));
            Student stu = new Student();
            stu.inputStudent();
            listStudents.add(stu);
            stt++;
            System.out.print("Nhập nữa hay không(Y|N) : ");
            choose = input.nextLine();
        } while ( choose.equalsIgnoreCase("y") );
    }
    
    public void showListStudent() {
        for (int i = 0; i<listStudents.size(); i++) {
            System.out.print((i+1)+". "+listStudents.get(i).showStudent());
        }
    }
    
    public void addFirstStudent() {
        System.out.println("Nhập sinh viên vào đầu");
        Student stuFirst = new Student();
        stuFirst.inputStudent();
        listStudents.addFirst(stuFirst);
        System.out.print("Thành công!");
    }
    
    public void addLastStudent() {
        System.out.println("Nhập sinh viên vào đầu");
        Student stuLast = new Student();
        stuLast.inputStudent();
        listStudents.addLast(stuLast);
        System.out.print("Thành công!");
    }
    
    
}
