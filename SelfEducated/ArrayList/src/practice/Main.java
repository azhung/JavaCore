/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.util.ArrayList;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        ArrayList nhanVien = new ArrayList();
        /*
        * THÊM ĐỐI TƯỢNG
        */
        // Tạo đối tượng tenA rồi chen vào ArrayList nhanVien
        String tenA = "Nguyễn Văn A";
        nhanVien.add(tenA);
        
        // Tạo đối tượng tenB rồi chen vào ArrayList nhanVien
        String tenB = "Nguyễn Văn B";
        nhanVien.add(tenB);
        
        // Tạo đối tượng tenC rồi chèn vào ArrayList nhanVien tại vị trí thứ 2
        String tenC = "Nguyễn Văn C";
        try {
            nhanVien.add(2, tenC);
        } catch (Exception e) {
            System.out.println("Khong chen duoc");
        }        
                
        /*
        * SỬA ĐỐI TƯỢNG
        */
        
        // Tạo đối tượng changeName để sửa cho đối tượng tenA
        String changeName = "Maicon Joe";
        try {
            nhanVien.set(0, changeName);
        } catch (Exception e) {
            System.out.println("Khong Sua Duoc");
        }
        
        /*
        * XÓA MỘT ĐỐI TƯỢNG TRONG ArrayList nhanVien
        */
        // Xóa một đối tượng tại vị trí 0
        nhanVien.remove(0);
        
        // Xóa toàn bộ đối tượng trong list        
        try {
            nhanVien.clear();
            System.out.println("XOA THANH CONG");
        } catch (Exception e) {
            System.out.println("KHONG THANH CONG");
        }
        
        for (int i = 0; i<nhanVien.size(); i++) {
            System.out.println("Nhan vien "+(i+1)+" : "+nhanVien.get(i));
        }
    }
}
