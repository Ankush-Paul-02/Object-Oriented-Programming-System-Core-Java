/**
 * It's a custom exception
 */
class AnkushException extends Exception {
    public AnkushException(String str) {
        super(str);
    }
}

class DuckExceptionUsingThrows {
    public void show() throws ClassNotFoundException {
        Class.forName("Class");
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {

        /**
         * 
         * Compile time errors
         * Runtime time errors --> Exceptions --> Handling
         * Logical errors
         * 
         * 
         * 
         * Object ----- Throwable
         * Throwable
         * - Error
         * - Exception
         * 
         * 
         * 
         * Runtime exceptions
         * - Arithmetic exception
         * - Array index out of bound exception
         * - Null pointer exception ...
         * All Run time exceptions are called unchecked exceptions.
         * 
         * 
         * And the other exceptions are called checked exception.
         * - SQl exception
         * - IO exception
         * 
         */

        int i = 19, j = 0;
        int arr[] = new int[5];
        String str = null;

        try {
            j = 8 / i;

            // if (j == 0) {
            // throw new ArithmeticException();
            // }

            if (j == 0) {
                throw new AnkushException("In Custom exception!");
            }

            // System.out.println(arr[5]);

            // System.out.println(str.length());

        } catch (AnkushException e) {
            System.out.println("In Ankush exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(j);



        /**
         * Ducking the exceptions
         */
        DuckExceptionUsingThrows exp = new DuckExceptionUsingThrows();
        try {
            exp.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
