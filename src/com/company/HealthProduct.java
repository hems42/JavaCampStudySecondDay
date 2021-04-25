package com.company;

public class HealthProduct extends  BaseProduct
{
    public HealthProduct(int id, String name,String stockAmount, int price) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.stockAmount=stockAmount;
    }
}