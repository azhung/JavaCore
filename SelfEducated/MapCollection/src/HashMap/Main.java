/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList stringList = new ArrayList();
        String str;
        // Xử lý nhập
        do {
            str = input.nextLine();
            stringList.add(str);
        } while (!str.isEmpty());
        System.out.println(convert(stringList));
        // Chuyển mảng ArrayList thành chuỗi và tách ra mảng tĩnh với dấy SPACE
        String[] arrString = convert(stringList).split(" ");
        // Tạo đối tượng HashMap với key (String) và value (Integer)
        HashMap<String, Integer> list = new HashMap();
        // Foreach từng phần tử của mảng nếu như key có trong Hashmap rồi thì tăng value + 1 ngược lại thì cho value = 1
        for (String arrKey : arrString) {
            if (list.containsKey(arrKey)) {
                int key = (int)list.get(arrKey);
                list.put(arrKey, key+1);
            } else {
                list.put(arrKey, 1);
            }
        }
        // Foreach đối tượng key trong hashmap List và in ra key | value
        for (Object k : list.keySet()) {
            int value = list.get(k);
            System.out.println(k+" | "+value);
        }
        // In ra tổng số từ trong mảng tĩnh arrString
        System.out.println("Tổng số từ : "+arrString.length);
        
    }
    
    public static String convert(ArrayList list) {
        String stringAfterConver = "";
        for (int i = 0; i < list.size(); i++) {
            stringAfterConver += list.get(i).toString()+" ";
        }
        return stringAfterConver;
    }
    
}
