package demo_java_util;


import java.util.Collections;
import java.util.LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        list.add("B");
        list.add("C");
        list.add("A");
        list.addLast("D");

        Collections.sort(list);
        System.out.println("Danh sach sau khi sap xep la:");
        for(int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
