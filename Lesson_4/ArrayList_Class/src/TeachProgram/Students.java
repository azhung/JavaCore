/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TeachProgram;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Students {
    private String rollNo;
    private String name;
    private int age;
    private float mathScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("--Mã sinh viên : ");
        String maSV = input.nextLine();
        this.setRollNo(maSV);

        System.out.print("--Tên sinh viên : ");
        String username = input.nextLine();
        this.setName(username);

        System.out.print("--Tuổi sinh viên : ");
        int tuoi = input.nextInt();
        input.nextLine();
        this.setAge(tuoi);

        System.out.print("--Điểm sinh viên : ");
        float score = input.nextFloat();
        input.nextLine();
        this.setMathScore(score);
    }

    public String output() {
        return getRollNo()+" | "+getName()+" | "+getAge()+" | "+getMathScore();
    }
}
