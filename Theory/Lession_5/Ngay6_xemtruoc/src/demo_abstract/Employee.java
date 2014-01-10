/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_abstract;

/**
 *
 * @author Tran Manh Truong
 */
public abstract class Employee {
    public String name;
    public double salary;
    public final String company = "ITPlus"; //bien final la bien hang (constant), sau nay ko thay doi duoc gia tri

    public Employee()
    {
        name = "";
        salary =0.0;
    }
    public Employee(String name)
    {
        this.name = name;//khi co bien cuc bo trung ten voi bien cua lop thi phai dung cong tro this de phan biet
        salary =0.0;
    }
    public Employee(String name, double s)
    {
        this(name);//goi cau tu Employee(String name) da khai bao o tren
        salary = s;
    }
    public abstract double calculatepay();//bat buoc cac lop con
    //ke thua tu lop nay phai Ghi de va implement (phat trien) phuong thuc tinh thu nhap
   
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    //phuong thuc sayHello sau day, cac lop con se ko duoc overiding
    public final void sayHello()
    {
        System.out.println("Hello, my name is:" + name);
    }
}
