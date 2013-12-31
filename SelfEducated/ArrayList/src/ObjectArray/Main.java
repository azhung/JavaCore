/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectArray;

import java.util.ArrayList;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Students> listStudents = new ArrayList();
        /*
        * THÊM CÁC ĐỐI TƯỢNG SINH VIÊN CÓ 2 THUỘC TÍNH TÊN + TUỔI
        */
        
        // Tạo đối tượng studentA
        Students studentA = new Students();
        studentA.name = "Nguyễn Văn A";
        studentA.age = 20;
        listStudents.add(studentA);
        
        Students studentB = new Students();
        studentB.name = "Nguyễn Văn B";
        studentB.age = 21;
        listStudents.add(studentB);                
        
        /*
        * SỬA ĐỐI TƯỢNG
        */
        Students studentChange = new Students();
        studentChange.name = "Hoang Quoc Hung";
        studentChange.age = 21;
        listStudents.set(0, studentChange);
        
        /*
        * XÓA ĐỐI TƯỢNG
        */
        listStudents.remove(1);
        
        // HIỂN THỊ
        for (int i = 0; i<listStudents.size(); i++) {
            System.out.println((i+1)+". "+listStudents.get(i).name+" | "+listStudents.get(i).age);
        }
        
    }
    
}
