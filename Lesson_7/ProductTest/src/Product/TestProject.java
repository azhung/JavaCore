/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Product;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestProject {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int choose;        
        System.out.println("-------------");
        System.out.println("1. Nhập thông tin sản phẩm");
        System.out.println("2. Hiển thị thông tin sản phẩm");
        System.out.println("3. Sắp xếp sản phẩm theo giá giảm dần");
        System.out.println("4. Hiển thị các sản phẩm có giá cao nhất");
        System.out.println("5. Thoát");
        System.out.println("-------------");
        System.out.print("Lựa chọn : ");
        choose = input.nextInt();
        return choose;
    }

    public static void main(String[] args) {
        ProductManager prm = new ProductManager();
        int chon;
        do{
            chon = menu();
            switch(chon) {
                case 1:
                    prm.inputListProduct();
                    break;
                case 2:
                    prm.showListProduct();
                    break;
                case 3:
                    prm.showPriceDesc();
                    break;
                case 4:
                    prm.showMaxProduct();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Nhập sai vui lòng nhập lại!");
            }
        } while(chon != 5);
    }
}
