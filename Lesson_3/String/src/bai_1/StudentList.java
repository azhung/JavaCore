/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author azhung
 */
public class StudentList {
    int StudentNumber;
    Student[] student = new Student[100];
    public StudentList() {
        StudentNumber = 0;
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
        }
    }
    
    public void addNewStudent() {
        Scanner input = new Scanner(System.in);        
        while (StudentNumber <= 0 || StudentNumber >= 10) {
            System.out.print("Nhap so sinh vien can quan ly : ");
            StudentNumber = input.nextInt();
        }
        for (int i = 0; i<StudentNumber; i++) {
            System.out.println("Nhap sinh vien "+(i+1));
            student[i].input();
        }
    }
    
    public void showStudent() {
        for (int i = 0; i < StudentNumber; i++) {
            System.out.print(i+": ");
            student[i].display();
        }
    }
    
    public void showAlphabetSort() {
        Student tg = new Student();
        for (int i = 0; i < StudentNumber; i++) {
            for (int j = i+1; j<StudentNumber; j++) {
                if (student[i].name.compareToIgnoreCase(student[j].name) > 0) {
                    tg = student[i];
                    student[i] = student[j];
                    student[j] = tg;
                }
            }
        }
        showStudent();
    }
    
    public void showScoreDesc() {
        Student tg = new Student();
        for (int i = 0; i<StudentNumber; i++) {
            for (int j = i+1; j<StudentNumber; j++) {
                if (student[i].score < student[j].score) {
                    tg = student[i];
                    student[i] = student[j];
                    student[j] = tg;
                }
            }
        }
        showStudent();
    }
    
    public void showSearch() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap Ten Can Tim : ");
        String textSearch = input.nextLine();
        // System.out.println(textSearch);
        for (int i = 0; i < StudentNumber; i++) {
            if (student[i].name.indexOf(textSearch) > 0) {
                student[i].display();
            }
        }
    }
    
}
