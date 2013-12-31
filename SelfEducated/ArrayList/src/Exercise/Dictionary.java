/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercise;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Dictionary {
    private String newWord;
    private String meanWord;

    public String getNewWord() {
        return newWord;
    }

    public void setNewWord(String newWord) {
        this.newWord = newWord;
    }

    public String getMeanWord() {
        return meanWord;
    }

    public void setMeanWord(String meanWord) {
        this.meanWord = meanWord;
    }
    
    public void wordData() {
        Scanner input = new Scanner(System.in);
        System.out.print("TU MOI : ");
        String tuMoi = input.nextLine();
        setNewWord(tuMoi);
        
        System.out.print("NGHIA CUA TU : ");
        String nghiaTu = input.nextLine();
        setMeanWord(nghiaTu);        
    }
    
    public void showData() {
        System.out.println("TU "+getNewWord()+" : "+getMeanWord());
    }
    
}
