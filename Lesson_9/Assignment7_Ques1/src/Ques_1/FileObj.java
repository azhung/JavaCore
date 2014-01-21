/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class FileObj {
    
    private String src;
    private String strAfterRead;

    public String getStrAfterRead() {
        return strAfterRead;
    }

    public void setStrAfterRead(String strAfterRead) {
        this.strAfterRead = strAfterRead;
    }        
    
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
    
    public FileObj() {
        this.src = "";
    }
    
    public FileObj(String src) {
        this.src = src;
    }
    
    // Phuong thuc nhap duong dan file
    public void srcInput() {
        Scanner input = new Scanner(System.in);
        File f;
        do {
            System.out.print("Nhập đường dẫn của file : ");
            String fileN = input.nextLine();
            // NOTE: Set variable to String src
            setSrc(fileN);
            f = new File(fileN);
        } while (f.isDirectory());
        
        if (!f.exists()) {
            int choose;
            System.out.println("---------------");
            System.out.println("1. Tạo mới file");
            System.out.println("Khác. Không làm gì");
            System.out.println("---------------");
            System.out.print("Lựa chọn : ");
            choose = input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
                    try {
                        f.createNewFile();
                    } catch (IOException e) {
                    }
                    break;
                default:
                    System.out.println("Goodbye!!!");
                    break;
            }
        } else {
            System.out.println("File đã tồn tại!!!");
        }
    }    
    
    // Phuong thuc ghi file
    public void fileWrite() {
        Scanner input = new Scanner(System.in);
        File f = new File(getSrc());
        int choose;
        if (f.exists()) {
            System.out.println("File đã sẵn có mời bạn lựa chọn kiểu nhập");
            System.out.println("----------------");
            System.out.println("1. Ghi đè");
            System.out.println("2. Ghi tiếp");
            System.out.println("Khác. Không làm gì");
            System.out.println("----------------");
            System.out.print("Lựa chọn : ");
            choose = input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
                    writeContent(false);
                    break;                    
                case 2:
                    writeContent(true);
                    break;
                default:
                    System.out.println("Goodbye");
                    break;
            }
        }
    }
    
    // Phuong thuc doc file
    public void fileRead() {
        FileReader fr = null;
        BufferedReader br = null;
        String str;
        String strAfter = "";
        try {
            fr = new FileReader(getSrc());
            br = new BufferedReader(fr);
            
            while ((str = br.readLine()) != null) {                
                System.out.println(str);
                strAfter += str + " ";                
            }
            setStrAfterRead(strAfter);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (java.io.IOException e1) {
            System.out.println("Lỗi : "+e1);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {            
            }
        }
        
    }
    
    // Count word in file
    public void countWord() {
        HashMap<String, Integer> list = new HashMap();
        String newString = getStrAfterRead().trim();
        String[] word = newString.split(" ");
        for (String x : word) {
            if (list.containsKey(x)) {
                int value = (int)list.get(x);
                list.put(x, value+1);
            } else {
                list.put(x, 1);
            }
        }

        for (Object k : list.keySet()) {
            int value = list.get(k);
            System.out.println(k + " : " + value);
        }
    }
    
    // Phuong thuc write
    public void writeContent(boolean chooseWrite) {
        Scanner input = new Scanner(System.in);
        // File f = new File(getSrc());
        FileOutputStream fos = null;
        PrintWriter pw = null;
        try{
            fos = new FileOutputStream(getSrc(), chooseWrite);
            pw = new PrintWriter(fos);
            String str;
            while (true) {
                str = input.nextLine();
                if (str.equals("")) {
                    break;
                } else {
                    pw.println(str);
                }
            }
            pw.flush();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            try{
                if (fos != null) {
                    fos.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (java.io.IOException e) {                        
            }
        }
    }        
    
}
