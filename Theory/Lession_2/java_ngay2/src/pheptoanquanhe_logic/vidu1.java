/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pheptoanquanhe_logic;

/**
 *
 * @author Administrator
 */
public class vidu1 {
    public static void main(String[] args) {
         //biểu thức quan hệ >, <, >=,<=, ==, !=
        boolean logic = 10 < 5;
        System.out.println("10<5=" + logic);
        logic = 10 > 5 && 10 <20;
        System.out.println("10 > 5 && 10 <20 = " + logic);
        logic = 10 <= 5  && 10 <20;
        System.out.println("10 <= 5 && 10 <20 = " + logic);
        logic = 10 >= 5 || 10 >20;
        System.out.println("10 >= 5 || 10 >20 = " + logic);
        logic = !(10 >= 5) || 10 >20;
        System.out.println("!(10 >= 5)  || 10 >20 = " + logic);
    }
}
