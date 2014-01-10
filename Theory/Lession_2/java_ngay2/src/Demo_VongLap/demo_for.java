package Demo_VongLap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class demo_for {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Dạng 1, for đầy đủ");
        for(i=1; i<=5; i++)
        {
            System.out.println("Lần thứ " + i);
        }


        System.out.println("Dạng 2, for bỏ trống một số biểu thức");
        i=1;
        for(; i<=5; )
        {
            System.out.println("Lần thứ " + i);
            i++;
        }

        System.out.println("Dạng 3, có nhiều lệnh ở bt1 và bt3");
        for(int j=1, k=5; j<k||j==k; j++,k--)
        { 
            System.out.println("j=" + j + ",k=" +k );
            int m;
            m = 10;
        }
        //j,k là biến cục bộ bên trong khối lệnh của for, ra khỏi khối lệnh thì j,k bị giải phóng
        //System.out.println("Ra khỏi vòng lặp, j = " + j + ", k = " + k);
    }
}









