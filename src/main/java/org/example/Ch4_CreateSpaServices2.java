package org.example;

import java.util.Scanner;

public class Ch4_CreateSpaServices2
{
    public static void main(String[] args)
    {
        Ch4_SpaService2 firstService = new Ch4_SpaService2();
        Ch4_SpaService2 secondService = new Ch4_SpaService2();
        firstService = getData(firstService);
        //secondService = getData(secondService);
        System.out.println(firstService.getServiceDescription() +
                " R" + firstService.getPrice());
        System.out.print(secondService.getServiceDescription() +
                " R" + secondService.getPrice());
    }
    public static Ch4_SpaService2 getData(Ch4_SpaService2 service)
    {
        String serviceDescription;
        double price;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter service >> ");
        serviceDescription = input.nextLine();
        System.out.print("Enter price >> ");
        price = input.nextDouble();
        input.nextLine();

        service.setServiceDescription(serviceDescription);
        service.setPrice(price);
        return service;
    }
}
