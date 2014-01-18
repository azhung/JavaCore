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
public class StudentList {
    int StudentNumber; //so luong sinh vien can quan ly
    Student[] stArray = new Student[50]; //mang 50 sinh vien
    public StudentList()
    {
        StudentNumber =0;
        //vong lap de khoi tao 50 sinh vien, gan cho tung phan tu cua mang
        for(int i = 0; i <stArray.length; i++)
        {
            stArray[i] = new Student();
        }
    }
    public void inputList()
    {
        Scanner nhap = new Scanner(System.in);
        do
        {
            System.out.print("Nhap so sinh vien can quan ly:");
            StudentNumber  = nhap.nextInt();
        }while(StudentNumber<=0 || StudentNumber>50);
        //Nhap thong tin sinh vien
        for(int i = 0; i<StudentNumber; i++)
        {
            System.out.println("Sinh vien thu " + (i+1) + ":");
            stArray[i].input();
        }
    }
    public void displayList()
    {
       System.out.println("Danh sach sinh vien:");
       for(int i=0; i<StudentNumber; i++)
       {
            System.out.print((i+1) + ":");
            stArray[i].display();
       }
    }
    //sắp xếp theo tên tăng dần
    public void SortByName()
    {
        Student trunggian = new Student();
        int i,j;
        for(i=0;i<StudentNumber-1; i++) //i chạy từ phần tử đầu tiên đến trước phần tử cuối (StudentNumber-1)
        {
            for(j=i+1; j<StudentNumber; j++)//j chạy từ phần tử kế tiếp sau i đến phần tử cuối cùng của mảng (StudentNumber)
            {
                if(stArray[i].name.compareToIgnoreCase(stArray[j].name)>0)//Nếu tên của sinhvien thứ i (sv trước) mà lớn hơn tên của sinhvien đứng sau (sinhvien j) thì đổi chỗ
                {
                    trunggian = stArray[i];
                    stArray[i] = stArray[j];
                    stArray[j] = trunggian;
                }
            }
        }
        //Hiển thị lại danh sách sau khi sắp xếp
        System.out.println("Sinh viên sắp xếp theo tên tăng dần:");
        this.displayList();
    }
    //sắp xếp theo điểm giảm dần
    public void SortByScore()
    {
        Student trunggian = new Student();
        int i,j;
        for(i=0;i<StudentNumber-1; i++) //i chạy từ phần tử đầu tiên đến trước phần tử cuối (StudentNumber-1)
        {
            for(j=i+1; j<StudentNumber; j++)//j chạy từ phần tử kế tiếp sau i đến phần tử cuối cùng của mảng (StudentNumber)
            {
                if(stArray[i].score < stArray[j].score)//nếu điểm của sv i (đứng trước) mà nhỏ hơn điểm của sv j (đứng sau) thì đổi chỗ
                {
                    trunggian = stArray[i];
                    stArray[i] = stArray[j];
                    stArray[j] = trunggian;
                }
            }
        }
        //Hiển thị lại danh sách sau khi sắp xếp
        System.out.println("Sinh viên sắp xếp theo điểm giảm dần:");
        this.displayList();
    }
    //Tìm và hiển thị các sinh viên có tên bắt đầu bằng từ nào đó
    public void Search()
    {
        String tukhoa;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập từ cần tìm:");
        tukhoa = nhap.nextLine();
        for(int i=0; i<StudentNumber; i++)
        {
           if(stArray[i].name.startsWith(tukhoa))
           {
               stArray[i].display();
           }
        }
    }
}
