package Demo_String;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tran Manh Truong
 */
public class Demo_String {
    public static void main(String[] args)
    {
        
        String s1 = new String();
        s1= "Hoc vien ITPlus";

        String s2 = "Vien CNTT";
        String s3 = new String();
        int n;
        //lấy số lượng ký tự của một chuỗi String.length();
        
        n = s1.length();
        System.out.println("Chuỗi s1 có " + n + " ký tự");
        //Trả về ký tự tại vị trí i trong chuỗi String.charAt(i);
        char kt;
        kt = s1.charAt(1);
        System.out.println("Ký tự tại vị trí thứ 2 của s1 là:" + kt);
        //so sánh 2 chuỗi sử dụng phương thức s1.compareTo(s2)
        //trả về giá trị <0 nếu s1<s2; 0 nếu s1 = s2; >0 nếu s1>s2
        n = s1.compareTo(s2);
        if(n<0)
            System.out.println("Chuỗi " + s1 + " nhỏ hơn chuỗi " + s2);
        else if (n==0)
            System.out.println("Chuỗi " + s1 + " bằng chuỗi " + s2);
        else
            System.out.println("Chuỗi " + s1 + " lớn hơn chuỗi " + s2);
        //so sánh 2 chuỗi, không phân biệt chữ hoa/chữ thường
        ///sử dụng  s1.compareToIgnoreCase(s2)
        n=s1.compareToIgnoreCase(s2);

        //muốn so sánh 2 chuỗi bằng nhau hay không?
        //sử dụng phương thức s1.equals(s2): trả về true/false
        boolean kq;
        kq = s1.equals(s2);
        if(kq == true)
            System.out.println("Chuỗi s1 bằng s2");
        else
            System.out.println("Chuỗi s1 không bằng s2");
        //so sánh không phân biệt chữ hoa/chữ thường
        //sử dụng   s1.equalsIgnoreCase(s2);
        kq = s1.equalsIgnoreCase(s2);
        //Nối thêm một chuỗi vào chuỗi hiện tại và trả về chuỗi đó
        s3 =  s2.concat(" - ĐHQG Hà Nội");
        System.out.println(s3);
        //tìm ví trí xuất hiện của một chuỗi trong chuỗi khác
        //sử dụng   s1.indexOf(s2): trả về ví trí đầu tiên tìm được
        //trả về < 0 nếu không tìm thấy
        System.out.println("Mời nhập chuỗi cần tìm:");
        Scanner nhap = new Scanner(System.in);
        s3 = nhap.nextLine();
        n = s1.indexOf(s3);
        if(n>=0)
        {
            int n2 = s1.indexOf(s3, n+1);//tim tiep
        }
        if(n<0) //không thấy s3 trong s1
            System.out.println("Chuỗi " + s3 + " không có trong " + s1);
        else //có tìm thấy s3 xuất hiện trong s1 tại vị trí n
            System.out.println("Chuỗi " + s3 + " xuất hiện tại vị trí: " + n);
        //Kiểm tra một chuỗi s1 có bắt đầu bằng chuỗi s2 hay không?
        s1.startsWith(s2); //trả về true nếu có, false nếu không?
        n = s1.indexOf(s2); //nếu n==0 thì s1 bắt đầu bằng s2
        //Chuyển từ chuỗi sáng số
        String number1, number2;
        number1 = "12";
        number2 = "5.5";
        //String number3 = number1 + number2;
        int nb1;
        float nb2, tong;
        nb1  = Integer.parseInt(number1);
        nb2 = Float.parseFloat(number2);
        tong = nb1 + nb2;
        System.out.println("Tong = " + tong);
    }
}
