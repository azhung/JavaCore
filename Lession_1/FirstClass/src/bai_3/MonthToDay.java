/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

/**
 *
 * @author azhung
 */
public class MonthToDay {
    private int month, year;
    public MonthToDay(int month, int year) {
        this.month = month;
        this.year = year;
    }
    
    public MonthToDay(int month) {
        this.month = month;
    }
    
    public void showDay() {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+month+" co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+month+" co 30 ngay");
                break;
            case 2:
                if ((year % 4 == 0) || (year % 100 == 0 && year % 400 != 0)) {
                    System.out.println("Thang "+month+" co 29 ngay(Nam nhuan)");
                } else {
                    System.out.println("Thang "+month+" co 28 ngay");
                }
                break;
            default:
                System.out.println("Nhap thang sai");
                break;
        }
    }
}
