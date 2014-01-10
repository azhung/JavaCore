/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo_abstract;

/**
 *
 * @author Tran Manh Truong
 */
public class Manager extends Employee {
    public double business_amount;

    public Manager()
    {
        super();//goi cau tu cua lop cha
        business_amount =0.0;
    }
    public Manager(String name, double s, double ba)
    {
        super(name,s);//goi cau tu lop cha
        business_amount = ba;
    }
    //bat buoc Ghi de va implement (phat trien) phuong thuc tinh thu nhap
    public double calculatepay()
    {
        double total_amount;
        double commission;

        if(this.business_amount > 50000)
            commission = this.business_amount*0.1;
        else
            commission = this.business_amount * 0.05;

        total_amount = salary + commission;
        return total_amount;
    }
    //ghi de phuong thuc display() de hien thi them tong doanh thu
    public void display()
    {
        super.display();
        System.out.println("business amount: " + this.business_amount);
    }
}
