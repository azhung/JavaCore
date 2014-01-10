/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variable_arguments;

/**
 *
 * @author VanTien
 */
public class variable_arg {
    public static int Tong(int...args){
        //tham số args được coi như biến mảng
        int sum =0;
        if(args == null)//khi gọi hàm Tong() không truyền tham số
            return 0;
        for(int i = 0; i<args.length; i++){
            sum += args[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int t1 = Tong(3,5,7);
        int t2 = Tong(2,4);
        int t3 = Tong();
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
    }
}
