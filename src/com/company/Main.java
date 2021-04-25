package com.company;

import Exam.HealthProduct;
import Exam.HealthProductManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<HealthProduct> healthProduct=new ArrayList<>();

        for(int i=0; i<51;i++)
        {
            healthProduct.add(new HealthProduct(i,"health product name : "+i,"amount : "+i,100+i));
        }


        System.out.println("Ürün listesindeki eleman sayısı . "+healthProduct.size());


        for(HealthProduct product:healthProduct)
        {
            System.out.println(product.toString());
        }


        HealthProductManager healthProductManager= new HealthProductManager();


        for(HealthProduct product:healthProduct)
        {
            healthProductManager.addProduct(product);
            healthProductManager.getProduct(product);
            healthProductManager.deleteProduct(product);
            healthProductManager.updateProduct(product);

        }



    }












}
