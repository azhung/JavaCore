/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package extendsPractice;

import java.util.Scanner;

/**
 *
 * @author azh
 */
public class Student extends Person{
    public Float Score;    
    public Student() {
        super();
        Score = 0f;
    }
    
    @Override
    public void Input() {
        Scanner input = new Scanner(System.in);
        super.Input();        
        
        System.out.print("Nhập điểm : ");        
        this.Score = input.nextFloat();
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("Điểm : "+Score);
    }
    
}
