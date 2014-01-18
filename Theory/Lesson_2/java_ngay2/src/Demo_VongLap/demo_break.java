package Demo_VongLap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class demo_break {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=5;i++)
        {
            if(i==3)
                break;
            System.out.println("lần thứ " + i);
        }
        System.out.println("kết thúc, i = " +i);
    }
}
