package org.example;
import java.util.Scanner;

public class Ch3_MethodWithParameter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double hours;
        double rate;
        System.out.println("Net pay is equal to:");
        System.out.print("Enter hours worked>> ");
        hours = input.nextDouble();
        System.out.print("Enter hourly rate>> ");
        rate = input.nextDouble();
        double netPay = calculateNetPay(hours, rate);
        System.out.println("Your net pay comes out to be R" + netPay);
    }

    public static double calculateNetPay(double hours, double rate)
    {
        return hours * rate;
    }
}
