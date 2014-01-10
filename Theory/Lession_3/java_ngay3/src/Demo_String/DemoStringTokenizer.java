package Demo_String;


import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class DemoStringTokenizer {
    public static void main(String[] args)
    {
        String str = "Java;Programming;language;5.0";
        StringTokenizer strToken = new StringTokenizer(str,";");
        int count = strToken.countTokens();
        System.out.println("Number of token: " + count);
        while(strToken.hasMoreTokens())
        {
            System.out.println(strToken.nextElement());
            //System.out.println(strToken.nextToken(";"));
        }
        
        //có thể sử dụng phương thức split
       System.out.println("sử dụng phương thức split: ");
       String[] strarr = str.split(";");
        for(int i =0; i<strarr.length; i++)
        {
            System.out.println(strarr[i]);
        }
        
    }
}
