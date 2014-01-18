package Chua_Baitap_Mang;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Doicho_doixung {
    public static void main(String[] args) {
        double[] ary = new double[100];
        int n,i,j;
        Scanner nhap = new Scanner(System.in);
        do{
            System.out.print("Nhap so phan tu (0<n<=100):");
            n = nhap.nextInt();
        }while(n<=0 || n>100);
        
        /*while(true){
            System.out.print("Nhap so phan tu (0<n<=100):");
            n = nhap.nextInt();
            if(n>0 && n<=100)
                break;
        }*/
        //Nhập n phần tử từ bàn phím
        System.out.println("Nhập các phần tử:");
        for(i=0; i<n; i++){
            System.out.print("Phan tu thu " + (i+1) + ":");
            ary[i] = nhap.nextDouble();
        }
        System.out.println("Các phần tử đã nhập:");
        for(i=0; i<n; i++)
        {
            System.out.print(ary[i] + "\t");
        }
        //đổi chỗ các phần tử đối xứng:
        for(i=0,j=n-1; i<j; ++i,--j){
            double tam;
            tam = ary[i];
            ary[i] = ary[j];
            ary[j] = tam;
        }
        System.out.println("Các phần tử đã đổi chỗ:");
        for(i=0; i<n; i++)
        {
            System.out.print(ary[i] + "\t");
        }
    }

}




