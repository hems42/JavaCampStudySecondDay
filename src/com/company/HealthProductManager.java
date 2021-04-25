package com.company;

public class  HealthProductManager extends BaseProductManager
{

    @Override
   public boolean  addProduct(BaseProduct product) {

       /*     if()
            {
                    eğer validasyon işlemleri ile ilgili sıkıntı yoksa işlemi tamamlayıp true dönderir..


                return  true;
            }
            else
            {

             eğer validasyon işlemleri ile ilgili sıkıntı varsa işlemi tamamlayamaz ve false dönderir..

                return  false;
            }
            */

        System.out.println(product.toString() +" ürünü eklenmiştir...");

        return true;
    }

    @Override
    public  boolean getProduct(BaseProduct product) {
              /*     if()
            {
                    eğer validasyon işlemleri ile ilgili sıkıntı yoksa işlemi tamamlayıp true dönderir..


                return  true;
            }
            else
            {

             eğer validasyon işlemleri ile ilgili sıkıntı varsa işlemi tamamlayamaz ve false dönderir..

                return  false;
            }
            */

        System.out.println(product.toString() +" ürünü getirilmiştir...");

        return true;
    }

    @Override
    public boolean deleteProduct(BaseProduct product) {
              /*     if()
            {
                    eğer validasyon işlemleri ile ilgili sıkıntı yoksa işlemi tamamlayıp true dönderir..


                return  true;
            }
            else
            {

             eğer validasyon işlemleri ile ilgili sıkıntı varsa işlemi tamamlayamaz ve false dönderir..

                return  false;
            }
            */

        System.out.println(product.toString() +" ürünü silinmiştir...");

        return true;
    }

    @Override
    public boolean updateProduct(BaseProduct product) {
             /*     if()
            {
                    eğer validasyon işlemleri ile ilgili sıkıntı yoksa işlemi tamamlayıp true dönderir..


                return  true;
            }
            else
            {

             eğer validasyon işlemleri ile ilgili sıkıntı varsa işlemi tamamlayamaz ve false dönderir..

                return  false;
            }
            */

        System.out.println(product.toString() +" ürünü güncellenmiştir...");

        return true;
    }


}
