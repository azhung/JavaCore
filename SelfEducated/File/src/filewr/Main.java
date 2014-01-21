/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filewr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ghi File
        FileOutputStream fos = null;
        PrintWriter pw = null;
        String src;
        System.out.print("Nhập đường dẫn file (D:/database): ");
        src = input.nextLine();
        
        File f = new File(src);
        boolean chooseWrite = false;
        if (f.exists()) {
            int chon;
            System.out.println("File đã tồn tại");
            System.out.println("-----------------");
            System.out.println("1. Ghi đè");
            System.out.println("2. Ghi tiếp");
            System.out.println("Khác. Không làm gì!");
            System.out.println("-----------------");
            System.out.print("Lựa chọn : ");
            chon = input.nextInt();
            input.nextLine();
            switch (chon) {
                case 1:
                    chooseWrite = false;
                    break;
                case 2:
                    chooseWrite = true;
                    break;
                default:
                    System.out.println("Goodbye");
                    System.exit(0);                            
            }
        } else {
            int chonCreate;
            System.out.println("File không tồn tại vui lòng chọn");
            System.out.println("------------------");
            System.out.println("1. Tạo mới file");
            System.out.println("Khác. Không làm gì!");
            System.out.println("------------------");
            System.out.print("Lựa chọn : ");
            chonCreate = input.nextInt();
            input.nextLine();
            switch (chonCreate) {
                case 1:
                    try {
                        f.createNewFile();
                    } catch (java.io.IOException e) {
                    }                    
                    break;
                default:
                    System.out.println("Goodbye!!");
                    System.exit(0);
            }
        }
        
        try{
            fos = new FileOutputStream(src, chooseWrite);
            pw = new PrintWriter(fos);
            
            System.out.println("Nhập nội dung muốn ghi");
            String str;
            while(true) {
                str = input.nextLine();
                if (str.equals("")) {
                    break;
                } else {
                    pw.println(str);
                }
            }
            pw.flush();
        } catch(java.io.FileNotFoundException e) {
            System.out.println("Lỗi không tồn tại file");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                } 
                if (pw != null) {
                    pw.close();
                }
            } catch (IOException e) {
            
            }
            
        }
        
    }
}
