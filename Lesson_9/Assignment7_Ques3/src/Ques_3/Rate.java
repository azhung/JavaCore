/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ques_3;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Rate {
    
    private String code1;
    private String code2;
    private double rate;

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public Rate() {
        this.code1 = "";
        this.code2 = "";
        this.rate = 0f;
    }
    
    public Rate(String code1, String code2, double rate) {
        this.code1 = code1;
        this.code2 = code2;
        this.rate = rate;
    }
    
    public void inputRate(String currency) {
        String[] splitCurrency = currency.split(";");
        setCode1(splitCurrency[0].trim());
        setCode2(splitCurrency[1].trim());
        double rateParse = Double.parseDouble(splitCurrency[2].trim());
        setRate(rateParse);
    }
    
    public void outputRate() {
        System.out.println(getCode1() + " | " + getCode2() + " | " + getRate());
    }
    
}
