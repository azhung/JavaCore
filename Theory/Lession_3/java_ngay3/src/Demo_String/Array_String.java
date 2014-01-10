package Demo_String;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class Array_String {
    public static void main(String[] args)
    {
        String[] hotens = new String[5];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập vào họ tên 5 bạn:");
        for(int i=0; i<hotens.length; i++){
            System.out.print("Tên thứ " + i + ":");
            hotens[i] = nhap.nextLine();
        }
        System.out.println("Danh sách đã nhập là:");
        for(String ht : hotens){
            System.out.println(ht);
        }
        //Hiển thị những tên có chứa từ khóa
        String tukhoa;
        System.out.print("Nhập từ cần tìm:");
        tukhoa = nhap.nextLine();
        for(int i=0; i<hotens.length;i++) {
            int n = hotens[i].indexOf(tukhoa);
            if(n>=0) {
                System.out.println(hotens[i]);
            }
        }
    }
}
