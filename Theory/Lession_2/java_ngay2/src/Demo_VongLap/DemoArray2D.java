package Demo_VongLap;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class DemoArray2D {
    public static void main(String[] args)
    {
        int[][]  ary = new int[2][3];
        //float[][] ary1 = {{(float)1.5, (float)2.5},{(float)4.2,(float)5.0}};
        float[][] ary1 = {{1.5f, 2.5f},{4.2f,5.0f}};
        double[][] ary2 = {{1.5, 2.5},{4.2,5.0}};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap cac phan tu cua mang:");
        for(int i=0; i < ary.length; i++)
        {
            for(int j=0; j < ary[i].length; j++)
            {
                System.out.printf("Nhap phan thu %d,%d:",i,j);
                ary[i][j] = input.nextInt();
            }
        }
        //Hien thi mang
        System.out.println("Can phan tu cua mang la:");
        for(int i=0; i < ary.length; i++)
        {
            for(int j=0; j < ary[i].length; j++)
            {
                System.out.printf("%d\t",ary[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
