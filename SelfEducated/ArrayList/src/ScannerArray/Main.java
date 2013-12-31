/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ScannerArray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Students> listStudents = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.print("NHAP SO SINH VIEN CAN QUAN LY: ");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i<n; i++) {            
            Students student = new Students();
            System.out.println("Nhap sinh vien thu "+(i+1));
            
            System.out.print("Nhap Ten: ");
            String studentName = input.nextLine();
            student.setName(studentName);            
            
            System.out.print("Nhap Tuoi: ");
            int age = input.nextInt();
            student.setAge(age);
            input.nextLine();
            
            System.out.print("Nhap Dia Chi: ");
            String address = input.nextLine();
            student.setAddress(address);            
            
            listStudents.add(student);
        }
        
        for (int i = 0; i<listStudents.size(); i++) {
            System.out.println("Sinh vien "+(i+1)+" : NAME - "+listStudents.get(i).getName()+" | "+" AGE - "+listStudents.get(i).getAge()+" | ADDRESS - "+listStudents.get(i).getAddress());
        }
    }
}
