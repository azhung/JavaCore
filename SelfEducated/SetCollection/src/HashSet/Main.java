/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author azh
 */
public class Main {
    public static void main(String[] args) {
        HashSet list = new HashSet();
        String str = "Nguyen Van A";
        list.add(str);
        
        int age = 19;
        list.add(age);
        Iterator ite = list.iterator();
        while (ite.hasNext()) {
            Object obj = ite.next();
            System.out.println(obj);
        }                
        
    }
}
