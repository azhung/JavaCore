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
public class Product {
    private String productRoll;
    private String productName;
    private float productPrice;

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductRoll() {
        return productRoll;
    }

    public void setProductRoll(String productRoll) {
        this.productRoll = productRoll;
    }

    public void inputProduct(String infoProduct) {
        String[] arrProduct = infoProduct.split(";");
        if (arrProduct.length == 3) {
            setProductRoll(arrProduct[0].trim());
            setProductName(arrProduct[1].toString().trim());
            float price = Float.parseFloat(arrProduct[2]);
            setProductPrice(price);
        } else {
            System.out.println("Thừa hoặc thiếu thông tin");
        }
    }

    public void showProduct() {
        System.out.println(getProductRoll()+" - "+getProductName()+" - "+getProductPrice());
    }   

}
