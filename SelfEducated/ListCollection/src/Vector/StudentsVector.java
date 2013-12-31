/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vector;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author azh
 */
public class StudentsVector {
    
    public Vector<Student> listStudents = new Vector<>();
    public StudentsVector() {
    }
    
    public void inputList() {
        Scanner input = new Scanner(System.in);
        String except;
        int i = 0;
        do {
            System.out.println("Nhập sinh viên thứ "+(i+1));
            Student stu = new Student();
            stu.input();
            listStudents.addElement(stu);
            System.out.print("Nhập tiếp không (Y|N) : ");            
            except = input.nextLine();
            i++;
        } while("y".equals(except));
    }
    
    public void displayList() {
        for (int i = 0; i<listStudents.size(); i++) {
            System.out.println((i+1)+". "+listStudents.elementAt(i).showStudent());
        }
    }
    
    public void removeNode() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vi tri muon xoa : ");
        int position = input.nextInt();
        listStudents.removeElementAt(position);
        System.out.println("Thành công!");
    }
    
    public void testElements() {
        System.out.println(listStudents.elements());
    }
    
}
