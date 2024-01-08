/**
 * An enum type is a special data type that enables for a variable to be a set
 * of predefined constants.
 * 
 * Status is a class here
 */
enum Status {
    /**
     * All these are actually object of Status
     */
    Running, Failed, Pending, Success;
}

public class EnumJava {
    public static void main(String[] args) {
        Status status = Status.Success;
        System.out.println(status);

        /**
         * class java.lang.Enum
         */
        System.out.println(status.getClass().getSuperclass());

        /**
         * ordinal gives the index
         */
        System.out.println(status.ordinal());

        // ? Enum if
        if (status == Status.Running) {
            System.out.println("Yeah! I'm running.");
        } else if (status == Status.Failed) {
            System.out.println("Ohh no!! I'm failed.");
        } else if (status == Status.Pending) {
            System.out.println("My work is pending");
        } else if (status == Status.Success) {
            System.out.println("Hurrah! I'm succeed in life.");
        }

        status = Status.Running;

        // ? Enum switch
        switch (status) {
            case Running:
                System.out.println("Yeah! I'm running.");
                break;
            case Failed:
                System.out.println("Ohh no!! I'm failed.");
                break;
            // ! And so on
            default:
                break;
        }

        /**
         * Print all values
         */
        Status ss[] = Status.values();
        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }

    }
}