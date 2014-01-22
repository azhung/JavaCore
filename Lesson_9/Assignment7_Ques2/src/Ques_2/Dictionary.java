/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_2;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Dictionary {
    
    private String wordEn;
    private String wordVn;
    
    public Dictionary() {
        this.wordEn = "";
        this.wordVn = "";
    }
    
    public Dictionary(String e, String v) {
        this.wordEn = e;
        this.wordVn = v;
    }
    
    public String getWordEn() {
        return wordEn;
    }

    public void setWordEn(String wordEn) {
        this.wordEn = wordEn;
    }

    public String getWordVn() {
        return wordVn;
    }

    public void setWordVn(String wordVn) {
        this.wordVn = wordVn;
    }
    
    public void inputWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập (từ mới : nghĩa) : ");
        String newWord = input.nextLine();
        String[] word = newWord.split(":");
        setWordEn(word[0].trim());
        setWordVn(word[1].trim());        
    }        
}
