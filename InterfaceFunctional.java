/**
 * 
 * Functional Interface is a interface which has only one function
 * 
 * In Java 8 we got a amazing feature which is called lambda expression.
 * We can use it only with functional interface.
 * 
 */

@FunctionalInterface
interface Skill {
    void developApp();
}

/*
 * class FlutterDeveloper implements Skill {
 *      public void developApp() {
 *          System.out.println("I can built the app");
 *      }
 * }
 */

public class InterfaceFunctional {
    public static void main(String[] args) {
        Skill skill = new Skill() {
            /**
             * Anonymous inner class
             */
            public void developApp() {
                System.out.println("I can built the app.");
            }
        };
        skill.developApp();
    }
}
