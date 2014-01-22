/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
public class ListDictionary {
    
    HashMap<String, String> listWord = new HashMap();
    
    private String src;
    private String textInFile;
    
    public ListDictionary() {
        this.src = "";
        this.textInFile = "";
    }
    
    public ListDictionary(String s) {
        this.src = s;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTextInFile() {
        return textInFile;
    }

    public void setTextInFile(String textInFile) {
        this.textInFile = textInFile;
    }
    
    // Load dictionary
    public void loadDictionary() {
        Scanner input = new Scanner(System.in);
        String srcFile;
        File f;
        /// D:\database\file\dictionary.txt        
        do {
            System.out.print("Nhập đường dẫn tới file từ điển : ");
            srcFile = input.nextLine();
            setSrc(srcFile);
            f = new File(srcFile);            
        } while (f.isDirectory());
        
        if (f.exists()) {
            // File tồn tại. Thực hiện load file vào HashMap
            
            FileReader fr = null;
            BufferedReader br = null;
            String str;            
            try {
                fr = new FileReader(getSrc());
                br = new BufferedReader(fr);
                
                while ((str = br.readLine()) != null) {                    
                    String[] word = str.split(":");
                    listWord.put(word[0].trim(), word[1].trim());
                    System.out.println(str);
                }
                
            } catch (java.io.FileNotFoundException e1) {
                System.out.println("Lỗi : File không tồn tại");
            } catch (java.io.IOException e2) {
                System.out.println("Lỗi : Đọc file");
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
            // File không tồn tại. Hỏi xem muốn tạo file không
            int choose;
            System.out.println("File không tồn tại vui lòng lựa chọn");
            System.out.println("---------------");
            System.out.println("1. Tạo file mới");
            System.out.println("Khác. Không làm gì");
            System.out.println("---------------");
            System.out.print("Lựa chọn : ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    try{
                        f.createNewFile();
                    } catch (java.io.IOException e) {
                        System.out.println("Lỗi IO");
                    }
                    break;
                default:
                    System.out.println("Bạn không thực hiện thao tác nào");
                    break;
            }
            
        }
        
    }
    
    // END LOAD FILE
    
    // Show all dictionary
    public void showDictioary() {
        for(String key : listWord.keySet()) {
            String value = listWord.get(key);
            System.out.println(key + " | " + value);
        }
    }
    
    // Insert new word
    public void insertDictionary() {
        Dictionary dic = new Dictionary();
        dic.inputWord();
        if (listWord.containsKey(dic.getWordEn())) {
            System.out.println("Từ " + dic.getWordEn() + " đã tồn tại");
        } else {
            listWord.put(dic.getWordEn(), dic.getWordVn());
            String word =  dic.getWordEn()+":"+dic.getWordVn();
            fileWriter(word, true); // Ghi đè
        }
    }
    
    
    // File Writer
    public void fileWriter(String str, boolean chooseWrite) {
        FileOutputStream fos = null;
        PrintWriter pw = null;
        try {
            fos = new FileOutputStream(getSrc(), chooseWrite);
            pw = new PrintWriter(fos);            
            pw.println(str);
            pw.flush();
            
        } catch (java.io.FileNotFoundException e1) {
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
    
    // Search word
    public void searchWord() {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Nhập từ cần tra nghĩa : ");
        word = input.nextLine();
        word = word.trim();
        if (listWord.containsKey(word)) {
            String value = listWord.get(word);
            System.out.println("Nghĩa từ "+ word +" : "+value);
        } else {
            System.out.println("Từ vừa nhập chưa có trong danh sách");
        }
    }
    
    // Delete Word
    public void deleteWord() {
        Scanner input = new Scanner(System.in);
        String word;
        FileOutputStream fos = null;        
        
        System.out.print("Nhập từ tiếng anh cần xóa : ");
        word = input.nextLine();
        
        if (listWord.containsKey(word)) {
            listWord.remove(word);
            try {
                fos = new FileOutputStream(getSrc(), false);
            } catch (java.io.FileNotFoundException e) {
                System.out.println("Lỗi : File không tồn tại");
            } finally {
                try{
                    if (fos != null) {
                        fos.close();
                    }
                } catch (java.io.IOException e) {                
                }
            }
            
            String textInList;
            for (Object key : listWord.keySet()) {
                String value = listWord.get(key);
                textInList = key + " : " + value;
                fileWriter(textInList, true);
            }
            // System.out.print(textInList);
            // fileWriter(textInList, false);
            System.out.println("Xoa thanh cong");            
        } else {
            System.out.println("Từ cân xóa không tồn tại!");
        }
    }
    
    // Edit word
    public void editWord() {        
        FileOutputStream fos = null;
        
        Dictionary dic = new Dictionary();
        dic.inputWord();
        if (listWord.containsKey(dic.getWordEn())) {
            listWord.put(dic.getWordEn(), dic.getWordVn());
            
            try {
                fos = new FileOutputStream(getSrc(), false);
            } catch (java.io.FileNotFoundException e) {
                System.out.println("Lỗi : File không tồn tại");
            } finally {
                try{
                    if (fos != null) {
                        fos.close();
                    }
                } catch (java.io.IOException e) {                
                }
            }
            
            String textInList;
            for (Object key : listWord.keySet()) {
                String value = listWord.get(key);
                textInList = key + " : " + value;
                fileWriter(textInList, true);
            }            
            System.out.println("Sua thanh cong"); 
            
        } else {
            System.out.println("Từ bạn nhập không tồn tại!");
        }
    }
    
    // Back up file into new File
    public void backUp() {
        Scanner input = new Scanner(System.in);
        String srcFile;
        FileOutputStream fos = null;
        PrintWriter pw = null;
        File f;
        do {
            System.out.print("Nhập đường dẫn tới nơi cần backup : ");
            srcFile = input.nextLine();            
            f = new File(srcFile);
        } while (f.isDirectory());
        
        if (!f.exists()) {
            try {                
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("File không đúng hoặc sai địa chỉ thư mục");
            }            
        } 
        try {
            fos = new FileOutputStream(srcFile, false);
            pw = new PrintWriter(fos);
            
            String textInList;
            for (Object k : listWord.keySet()) {
                String value = listWord.get(k);
                textInList = k + " : " + value;
                pw.println(textInList);
            }
            pw.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Lỗi : Không tồn tại file");
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
