public class OOPS_Static {
    public static void main(String[] args) {
       Mobile mobile1 = new Mobile();
       mobile1.brand = "Vivo";
       mobile1.price = 22000;
       Mobile.name = "SmartPhone";

       Mobile mobile2 = new Mobile();
       mobile2.brand = "Redmi";
       mobile2.price = 17900;
       Mobile.name = "SmartPhone";

       System.out.println(mobile1);
       System.out.println(mobile2);
    }
}

class Mobile {
    String brand;
    int price;
    /**
     * Static variable
     */
    static String name;

    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", price=" + price + ", name=" + name + "]";
    }
}
