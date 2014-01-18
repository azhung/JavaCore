package demo_java_util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author Tran Manh Truong
 */
public class HashSetDemo {
   public static void main(String[] args) {
        HashSet h = new HashSet();
        //chen cac phan tu vao HashSet
        //Phan tu trung lap tu dong bi loai
        h.add("Aook");
        h.add("Vien CNTT");
        h.add("China");
        h.add("China");

        System.out.println(h.size());
        
        //Lap cac phan cua HashSet
        Iterator it = h.iterator();
         while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
