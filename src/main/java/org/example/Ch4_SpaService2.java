package org.example;

public class Ch4_SpaService2
{
    private String serviceDescription;
    private double price;

    public Ch4_SpaService2()
    {
        serviceDescription = "XXX";
        price = 0;
    }
    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }
    public void setPrice(double servicePrice)
    {
        price = servicePrice;
    }
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
}
