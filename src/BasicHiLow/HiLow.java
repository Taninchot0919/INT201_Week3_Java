package BasicHiLow;

import java.util.Scanner;

public class HiLow {

    //Math.floor() ไว้ปัดเศษ
    //Math.random() ไว้สุ่มตัวเลขจะได้เลข 0.ทศนิยมเยอะๆ
    private int randomNum = (int) Math.floor((Math.random() * 10) + 1);
    private int myNum;
    Scanner Scanner = new Scanner(System.in);

    public void input() {
        System.out.print("Enter Your Num : ");
        myNum = Scanner.nextInt();
    }

    public void run() {
        input();
        if (randomNum == myNum) {
            System.out.println("Congratulation");
        } else if (randomNum > myNum) {
            System.out.println("Number is higher and Number is " + randomNum);
        } else if (randomNum < myNum) {
            System.out.println("Number is lower and Number is "+randomNum);
        }
    }
}
