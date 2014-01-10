/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Assigment2.Ques1_Assigment2;

import java.util.Scanner;

/**
 *
 * @author Tran Manh Truong
 */
public class demo2 {

    public static int menu()
    {
        int chon;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Sắp xếp theo tên tăng dần");
        System.out.println("4. Sắp xếp theo điểm giảm dần:");
        System.out.println("5. Tìm sinh viên tên bắt đầu bằng một từ.");
        System.out.println("6. Thoát");
        System.out.println("Mời bạn chọn (1-6):");
        chon = nhap.nextInt();
        return chon;
    }
    public static void main(String[] args)
    {
        StudentList sl = new StudentList();
        int chon;
        do
        {
            chon = menu();
            switch(chon)
            {
                case 1:
                    sl.inputList();
                    break;
                case 2:
                    sl.displayList();
                    break;
                case 3:
                    sl.SortByName();
                    break;
                case 4:
                    sl.SortByScore();
                    break;
                case 5:
                    sl.Search();
                    break;
                case 6:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Bạn nhập không đúng, mời nhập lại");
            }
        }while(chon!=6);
    }
}
