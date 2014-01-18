package Lenh_switch_case;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class KiemTraNgay {
    public static void main(String[] args){
        int thang,nam;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập tháng:");
        thang = nhap.nextInt();
        switch(thang)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8: 
            case 10:
            case 12:
                System.out.println("Tháng " + thang + " Có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + thang + " Có 30 ngày");
                break;
            case 2:
                System.out.print("Nhập Năm:");
                nam = nhap.nextInt();
                //năm nhuận là năm chia hết cho 4
                //hoặc chia hết cho 100 nhưng không chia hết 400
                if((nam%4==0) ||  (nam %100==0 && nam % 400!=0))
                {
                    System.out.println("Năm " + nam
                       + " là năm nhuận, tháng 2 có 29 ngày");
                }
                else
                {
                    System.out.println("Năm " + nam
                       + " không phải năm nhuận, tháng 2 có 28 ngày");
                }
                break;
            default:
                System.out.println("Tháng nhập sai");
        }
    }

}
