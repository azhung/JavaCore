package Demo_String;


import java.lang.StringBuilder;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tran Manh Truong
 */
//StringBuilder là loại xâu ký tự mà có thể thay đổi được nội dung
public class DemoStringBuilder {
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("Java Programming");
        str.append(" Fundamental");//thêm một xâu vào cuối xâu hiện tại
        System.out.println("Sau khi chèn thêm vào cuối:" + str);
        str.insert(5, "5.0 "); //chèn thêm một xâu vào vị trí thứ 5 của xâu hiện tại
        System.out.println("Sau khi chèn vào vị trí thứ 5:"+str);
        str.delete(5,9); //xóa các ký tự từ vị trí thứ 5 đến trước vị trí thứ 9
        System.out.println("Sau khi xóa ký tự từ 5 đến 8:" + str);
        str.replace(17,29 , "Advanced"); //thay thế các ký tự từ vị trí 17 đến 29 bằng xâu mới "Advanced"
        System.out.println("Sau khi thay thế:" +str);
        str.reverse(); //Đảo ngược các ký tự của xâu hiện tại
        System.out.println("Sau khi đảo ngược:" +str);
        
    }
}
