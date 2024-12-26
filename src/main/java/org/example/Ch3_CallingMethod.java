package org.example;

public class Ch3_CallingMethod {

    public static void main(String[] args)
    {
        System.out.println("Smart Electronics");
        displayHours();
    }

    public static void displayHours()
    {
        System.out.println("Monday Friday 8 am to 6 am.");
        System.out.println("Saturday      8 am to noon.");
        System.out.println("Sunday        closed.");
    }
}
