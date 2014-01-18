package Demo_VongLap;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class demo_continue {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=5; i++)
        {
            if(i==3)
                continue;
            System.out.println("i= " + i);
        }
    }
}





