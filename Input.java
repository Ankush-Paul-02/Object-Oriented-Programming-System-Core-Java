import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /**
         * 
         * println is a method belongs to PrintStream class
         * 
         * out is a object of PrintStream and this is created in System class
         * 
         */
        System.out.println("Hello");

        /**
         * Input
         */

        /*
         * 
         * System.in.read() gives the ASCII value
         * It can read only one character at a time
         * 
         * int input = System.in.read();
         * 
         * for real output we have to do - 48
         * System.out.println(input - 48);
         * 
         */

        /*
         * InputStreamReader in = new InputStreamReader(System.in);
         * BufferedReader bf = new BufferedReader(in);
         * 
         * int num = Integer.parseInt(bf.readLine());
         * System.out.println(num);
         * 
         * bf.close();
         */

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num);

    }
}
