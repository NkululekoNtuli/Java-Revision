package org.example;

import java.util.Scanner;

public class Ch4_CreateSpaServices
{
    public static void main(String[] args)
    {
        String service;
        double price;

        Ch4_SpaService firstService = new Ch4_SpaService();
        Ch4_SpaService secondService = new Ch4_SpaService();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter service >> ");
        service = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        input.nextLine();
        System.out.print("Enter service >> ");
        service = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();

        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() +
                " R" + firstService.getPrice());

        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() +
                " R" + secondService.getPrice());
    }
}
