/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StudentList {
    int StudentNumber;
    Student[] student = new Student[100];
    public StudentList(){
        StudentNumber = 0;
        for (int i = 0; i<student.length; i++) {
            student[i] = new Student();
        }
    }

    public void inputListStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap So Sinh Vien : ");
        StudentNumber = input.nextInt();
        for (int i = 0; i<StudentNumber; i++) {
            student[i].input();
        }
    }

    public void showStudent() {
        System.out.println("RollNo \tName \t\tAge \tScore");
        for (int i = 0; i < StudentNumber; i++) {
            student[i].display();
        }
    }
}
