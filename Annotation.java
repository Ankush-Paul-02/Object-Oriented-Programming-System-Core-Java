class Flutter {
    public void app() {
        System.out.println("Android apps using dart.");
    }
}

class Java extends Flutter {
    /**
     * Here Override is a Annotation
     */
    @Override
    public void app() {
        System.out.println("Android apps using Java.");
    }
}

class Kotlin extends Flutter {
    /**
     * Here Override is a Annotation
     */
    @Override
    public void app() {
        System.out.println("Android apps using Kotlin.");
    }
}

public class Annotation {
    public static void main(String[] args) {
        Flutter lang = new Kotlin();
        lang.app();
    }
}
