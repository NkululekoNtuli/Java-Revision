package org.example;
import  java.util.Scanner;
public class Ch3_OverloadedMethods
{
    public static void main(String[] args)
    {
        int intValue;
        double doubleValue;
        Scanner input = new Scanner(System.in);
        System.out.println("Using overloaded methods.");
        System.out.println("Enter int to be displayed>> ");
        intValue = input.nextInt();
        System.out.println("Enter double to displayed>> ");
        doubleValue = input.nextDouble();

        printingValue(intValue);
        printingValue(doubleValue);
    }

    public static void printingValue(int var)
    {
        System.out.println(var);
    }

    public static void printingValue(double var)
    {
        System.out.print(var);
    }
}
