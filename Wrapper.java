public class Wrapper {
    public static void main(String[] args) {
        
        int num = 7;
        /**
         * Assign value of primitive type to objects type is called
         * Auto boxing.
         */
        Integer num1 = num; //? Auto boxing

        /**
         * Fetching value is called auto unboxing.
         */
        int num2 = num1;    //? Auto unboxing 

        System.out.println(num2);


        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
