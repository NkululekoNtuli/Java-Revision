package org.example;

import java.util.Scanner;

public class Ch4_CreateSpaServices2
{
    public static void main(String[] args)
    {
        Ch4_SpaService firstService = new Ch4_SpaService();
        Ch4_SpaService secondService = new Ch4_SpaService();
        firstService = getData(firstService);
        secondService = getData(secondService);
    }
    public static Ch4_SpaService getData(Ch4_SpaService service)
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
