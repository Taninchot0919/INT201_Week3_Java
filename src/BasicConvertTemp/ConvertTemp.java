package BasicConvertTemp;

import java.util.Scanner;

public class ConvertTemp {

    private double fahrenheit;
    private double celsius;
    private double temp;
    private double lastTemp = 5;
    private String type;
    Scanner Scanner = new Scanner(System.in);

    private void whatTypeAndTemp() {
        System.out.println("Type C for Celsius , F for Fahrenheit");
        System.out.print("Enter Your Type : ");
        type = Scanner.nextLine();
        System.out.print("Enter Your Temp : ");
        temp = Scanner.nextDouble();
    }

    private void calculateTemp() {
        if (type.equalsIgnoreCase("f")) {
            lastTemp = (temp - 32) * 5 / 9;
        } else if (type.equalsIgnoreCase("c")) {
            lastTemp = temp * 9 / 5 + 32;
        }
    }

    public void print() {
        whatTypeAndTemp();
        System.out.println("");
        System.out.println("-*-*-*-*-*-*-*-*-*-*");
        System.out.println("");
        System.out.println("Your source temperature in : " + type.toUpperCase());
        System.out.println("Your temperature : " + temp);
        calculateTemp();
        System.out.println("Temperature in " + type.toUpperCase() + " : " + lastTemp);
        System.out.println("");
        System.out.println("-*-*-*-*-*-*-*-*-*-*");
    }
}
