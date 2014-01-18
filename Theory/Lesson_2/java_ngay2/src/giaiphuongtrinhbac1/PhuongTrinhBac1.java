/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package giaiphuongtrinhbac1;

/**
 *
 * @author Administrator
 */
public class PhuongTrinhBac1 {
    //khai báo 2 thuộc tính a,b kiểu số thực
    double a,b;
    //khai báo phương thức giải phương trình
    public void GiaiPT(){
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else{//b khác 0
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{//a khác 0
            System.out.println("Nghiệm là: " + (-b/a));
        }
    }
}
