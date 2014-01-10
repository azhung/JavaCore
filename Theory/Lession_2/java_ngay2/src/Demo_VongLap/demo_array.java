package Demo_VongLap;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class demo_array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner nhap = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập phần tử " + (i+1) + ":");
            arr[i] = nhap.nextInt();
        }
        //hiển thị mảng dùng for each
        System.out.println("Hiển thị:");
        for(int x : arr){
            System.out.println(x);
        }
        System.out.println("Hiển thị tương tự:");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}






