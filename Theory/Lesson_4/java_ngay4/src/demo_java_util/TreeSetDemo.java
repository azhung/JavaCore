package demo_java_util;


import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {

    public TreeSetDemo() {
    }

    public static void main(String[] args) {
        TreeSet h = new TreeSet();
        //chen cac phan tu vao TreeSet
        //Phan tu trung lap tu dong bi loai
        //Cac phan tu duoc tu dong sap xep
        h.add("Aook");
        h.add("Vien CNTT");
        h.add("China");
        h.add("China");
       
        System.out.println(h.size());

        //Lap cac phan cua TreeSet
        Iterator iterator = h.iterator();
         while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

    }
}
