/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dictionary;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class ListWords {
    HashMap<String, String> listWords = new HashMap<>();
    
    public void input() {
        Scanner input = new Scanner(System.in);
        String choose;
        int count = 0;
        do {
            Dictionary dic = new Dictionary();
            System.out.print("Nhập từ "+(count+1)+" : ");
            String wordAndMean = input.nextLine();
            String[] arrWord = convert(wordAndMean);
            dic.setWord(arrWord[0].trim());
            dic.setMean(arrWord[1].trim());            
            if (checkWord(dic.getWord())) {
                System.out.println("Từ vừa nhập đã tồn tại");
            } else {
                listWords.put(dic.getWord(), dic.getMean());
            }
            System.out.print("Nhập tiếp không(Y|N) : ");
            choose = input.nextLine();
            count++;
        } while(choose.equalsIgnoreCase("y"));
    }
    
    public boolean checkWord(String word) {
        for (Object k : listWords.keySet()) {
            if (word.equalsIgnoreCase(k.toString())) {
                return true;
            }
        }
        return false;
    }
    
    public void searchWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập từ cần tra : ");
        String wordInput = input.nextLine();
        String result = "";
        for (Object k : listWords.keySet()) {
            if (wordInput.equalsIgnoreCase(k.toString())) {
                System.out.println("Nghĩa của từ "+wordInput+" là : "+listWords.get(k));
                break;
            } else {
                result = "Không có từ trong danh sách";                
            }
        }
        if (!result.equals("")) {
            System.out.println(result);
        }        
    }
    
    public void editWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập từ cần sửa (Từ và nghĩa cách nhau bởi dấu ':') : ");
        String editWord = input.nextLine();
        String[] wordNew = convert(editWord);
        Dictionary dicNew = new Dictionary();
        dicNew.setWord(wordNew[0].trim());
        dicNew.setMean(wordNew[1].trim());
        if (listWords.containsKey(dicNew.getWord())) {
            listWords.put(dicNew.getWord(), dicNew.getMean());
        } else {
            System.out.println("Từ muốn sửa không tồn tại trong danh sách");
        }
    }
    
    public void delWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập từ muốn xóa : ");
        String delWord = input.nextLine();
        delWord.trim();
        if (listWords.containsKey(delWord)) {
            listWords.remove(delWord);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tồn tại từ cần xóa");
        }
    }
    
    public void listWordShow() {
        for(Object k : listWords.keySet()) {
            String value = listWords.get(k);
            System.out.println(k+" | "+value);
        }
    }
    
    private String[] convert(String input) {        
        String[] afterConver = input.split(":");        
        return afterConver;
    }
    
}
