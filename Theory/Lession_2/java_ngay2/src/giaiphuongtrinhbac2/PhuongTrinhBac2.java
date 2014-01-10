package giaiphuongtrinhbac2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class PhuongTrinhBac2 {
    double a,b,c;
    public void GiaiPT()
    {
        double delta, n1, n2;
        delta = b*b - 4*a*c;
        if(delta<0)
        {
            System.out.println("Phương trình vô nghiệm");
        }
        else if(delta==0){
            n1 = n2 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép "
                    + "\nx1 = x2 =" + n1);
        }
        else{//delta lớn hơn 0
            n1 = (-b + Math.sqrt(delta))/(2*a);
            n2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt"
                    + "\nX1 = " + n1 + "\nX2 = " + n2);
        }
    }

}









