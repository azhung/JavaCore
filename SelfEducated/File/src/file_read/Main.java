/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package file_read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        
        // File Reader
        Scanner input = new Scanner(System.in);
        // Khai bao
        FileReader fr = null;
        BufferedReader br = null;
        String src;
        String str = null;
        File f;
        
        do {
            System.out.print("Nhập đường dẫn tới file : ");
            src = input.nextLine();
            f = new File(src);
        } while(!f.exists());
        
        try {
            fr = new FileReader(src);
            br = new BufferedReader(fr);
                        
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        } catch (java.io.IOException e1) {
            
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
        
    }
}
