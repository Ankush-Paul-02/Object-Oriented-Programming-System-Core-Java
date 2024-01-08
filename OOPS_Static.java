public class OOPS_Static {

    /**
     * If we make main static then we haven't made the Object of OOPS_STATIC
     */
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

       Mobile.show(mobile1);
    }
}

class Mobile {
    String brand;
    int price;
    /**
     * Static variable
     */
    static String name;

    /**
     * How many objects you are created will call a static block once
     */
    static {
        name = "Phone";
        System.out.println("In static block!");
    }

    public Mobile() {
        brand = "";
        price = 10000;
        System.out.println("In constructor!");
    }

    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", price=" + price + ", name=" + name + "]";
    }

    /**
     * Static method
     *
     * We can't directly use non-static variables in the static method, if we have an object
     * reference then we can use it.
     * @param mobile
     */
    public static void show(Mobile mobile) {
        System.out.println("Mobile [brand=" + mobile.brand + ", price=" + mobile.price + ", name=" + mobile.name + "]");
    }
}

