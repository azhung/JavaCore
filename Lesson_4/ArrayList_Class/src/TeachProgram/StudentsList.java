/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TeachProgram;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class StudentsList {
    ArrayList<Students> listStudents = new ArrayList<Students>();
    
    public void input() {
        Scanner input = new Scanner(System.in);
        int i = 0;
        String check;
        do {            
            System.out.println("SINH VIEN "+(i+1));

            Students student = new Students();
            student.input();
            listStudents.add(student);
            System.out.print("NHAP NUA KHONG (Y|N) : ");
            i++;
            check = input.nextLine();
        } while(check.equalsIgnoreCase("y"));
    }


    public void display() {
        for (int i = 0; i<listStudents.size(); i++) {
            // System.out.println((i+1)+". "+listStudents.get(i).output());
            System.out.println((i+1)+". "+listStudents.get(i).output());
        }
    }
    
    public void searchStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên muốn tìm : ");
        String nameInput = input.nextLine();        
        for (int i = 0; i<listStudents.size(); i++) {
            if (listStudents.get(i).getName().equalsIgnoreCase(nameInput)) {
                System.out.println(listStudents.get(i).output());
                return;
            }
        }
        System.out.println("Sinh viên không tồn tại");
    }
    
    public void removeStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vị trí cần xóa : ");
        int position = input.nextInt();
        listStudents.remove(position);
        display();
    }
    
    public void removeAllStudent() {
        listStudents.clear();
        System.out.println("Thành công!");
    }
    
    public void sortAlphabet() {
        Students temp;
        for (int i = 0; i<listStudents.size(); i++) {
            for (int j = i+1; i < listStudents.size(); i++) {
                if (listStudents.get(i).getName().compareToIgnoreCase(listStudents.get(j).getName()) > 0) {
                    temp = listStudents.get(i);
                    listStudents.set(i, listStudents.get(j));
                    listStudents.set(j, temp);
                }
            }
        }
        display();
    }
    
    public void sortScore() {
        Students temp;
        for (int i = 0; i<listStudents.size(); i++) {
            for (int j = i+1; j < listStudents.size(); j++) {
                if (listStudents.get(i).getMathScore() < listStudents.get(j).getMathScore()) {
                    temp = listStudents.get(i);
                    listStudents.set(i, listStudents.get(j));
                    listStudents.set(j, temp);
                }
            }
        }
        display();
    }

}
