/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author azh
 */
public class Exchange {
    
    ArrayList<Rate> listCurrency = new ArrayList();
    private String srcFile;

    public String getSrcFile() {
        return srcFile;
    }

    public void setSrcFile(String srcFile) {
        this.srcFile = srcFile;
    }
    
    // Constructor
    public Exchange() {
    
    }
    
    public void loadFile() {
        Scanner input = new Scanner(System.in);
        String src;
        File f;
        do {
            System.out.print("Nhập đường dẫn tới file : ");
            src = input.nextLine();
            setSrcFile(src);
            f = new File(src);
        } while(f.isDirectory());
        
        // Nếu file tồn tại thực hiện load file
        if (f.exists()) {
            
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(getSrcFile());
                br = new BufferedReader(fr);                
                String str;
                while ((str = br.readLine()) != null) {
                    Rate r = new Rate();
                    r.inputRate(str);
                    listCurrency.add(r);
                    System.out.println(str);
                }
                
            } catch (java.io.FileNotFoundException e) {
                System.out.println("Lỗi : File không tồn tại");
            } catch (java.io.IOException e) {
                System.out.println("Lỗi : Load File");
            } finally {
                try {
                    if (fr != null) {
                        fr.close();
                    }
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                }                
            }
            
        } else {
            // Thực hiện những yêu cầu của người dùng như tạo file mới hay không làm gì
            int choose;
            System.out.println("File không tồn tại mời bạn nhập lựa chọn");
            System.out.println("-------------");
            System.out.println("1. Tạo file mới");
            System.out.println("Khác. Không làm gì");
            System.out.println("-------------");
            System.out.print("Lựa chọn : ");
            choose = input.nextInt();            
            switch (choose) {
                case 1:
                    try {
                        f.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Exchange.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                default:
                    System.out.println("Bạn không lựa chọn công việc nào");
                    break;
            }
        }
        
    }
    
    public void addRecoderToFile() {
        Scanner input = new Scanner(System.in);
        FileOutputStream fos = null;
        PrintWriter pw = null;
        System.out.print("Nhập dữ liệu đầu vào (Đơn vị 1; Đơn vị 2; Giá trị): ");
        String currency = input.nextLine();
        
        Rate r = new Rate();
        r.inputRate(currency);
        listCurrency.add(r);
        
        try {
            fos = new FileOutputStream(getSrcFile(), true);
            pw = new PrintWriter(fos);            
            pw.println(currency);
            
            pw.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Lỗi : File không tồn tại");
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
    
    public void showCurrency() {
        for (int i = 0; i < listCurrency.size(); i++) {
            System.out.println("Từ " + listCurrency.get(i).getCode1() + " Sang " + listCurrency.get(i).getCode2() + " là : " + listCurrency.get(i).getRate());
        }
    }
    
    
    public void convertCurrency() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập đơn vị tiền tệ thứ 1 : ");
        String code1 = input.nextLine();
        System.out.print("Nhập đơn vị tiền tệ thứ 2 : ");
        String code2 = input.nextLine();
        System.out.print("Nhập số lượng cần chuyển đổi : ");
        int amount = input.nextInt();
        if (convert(code1, code2, amount) > 0) {
            System.out.println("Số tiền sau khi chuyển đổi từ "+ code1 + " là : " + convert(code1, code2, amount) + code2);
        } else {
            System.out.println("Nhập sai vui lòng nhập lại");
            return;
        }
    }
    
    public double convert(String code1, String code2, double amount) {
        double result = 0;
        for (int i = 0; i < listCurrency.size(); i++) {
            if (amount > 0 && code1.equalsIgnoreCase(listCurrency.get(i).getCode1()) && code2.equalsIgnoreCase(listCurrency.get(i).getCode2())) {
                result = amount * listCurrency.get(i).getRate();
            }
        }
        return result;
    }
    
}
