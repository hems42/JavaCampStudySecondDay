package Exam;

   abstract class BaseProduct {

        int id;
        String  name;
        String  stockAmount;
        int price;

        @Override
        public String toString() {
            return  getClass().getName().substring(5)+" isimli sınıfındaki ürünün bilgileri: " +
                    "id=" + id +
                    " name=" + name +
                    " stockAmount=" +stockAmount+
                    " price="+price;
        }
    }

