/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Product;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ProductManager {

    ArrayList<Product> listProduct = new ArrayList<Product>();

    public ProductManager() {
        
    }

    public void inputListProduct() {
        Scanner input = new Scanner(System.in);
        String product;
        int i = 1;
        System.out.println("Nhập sản phẩm với định dạng Mã;Tên;Giá");
        do {
            System.out.print("Nhập sản phẩm thứ "+i+" : ");
            product = input.nextLine();
            
            if (!product.isEmpty()) {
                Product pr = new Product();
                pr.inputProduct(product);
                listProduct.add(pr);
            } else {
                System.out.println("Bạn đã nhập "+(i-1)+" sản phẩm");
            }
            i++;
        } while(!product.isEmpty());        
    }

    public void showListProduct() {
        for (int i = 0; i<listProduct.size(); i++) {
            listProduct.get(i).showProduct();
        }
    }

    public void showPriceDesc() {
        Product proTg;
        for (int i = 0; i<listProduct.size(); i++) {
            for (int j = i+1; j<listProduct.size(); j++) {
                if (listProduct.get(i).getProductPrice() < listProduct.get(j).getProductPrice()) {
                    proTg = listProduct.get(i);
                    listProduct.set(i, listProduct.get(j));
                    listProduct.set(j, proTg);
                }
            }
        }
        showListProduct();
    }

    public void showMaxProduct() {
        Product temPro = new Product();
        temPro.setProductPrice(0f);
        for (int i = 0; i<listProduct.size(); i++) {
            if (temPro.getProductPrice() < listProduct.get(i).getProductPrice()) {
                temPro = listProduct.get(i);
            }
        }
        for (int i = 0; i<listProduct.size(); i++) {
            if (listProduct.get(i).getProductPrice() == temPro.getProductPrice()) {
                listProduct.get(i).showProduct();
            }
        }
    }

}
