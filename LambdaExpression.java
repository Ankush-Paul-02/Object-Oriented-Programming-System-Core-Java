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

@FunctionalInterface
interface Interview {
    void experience(int experience);
}

@FunctionalInterface
interface Add {
    int add(int i, int j);
}

public class LambdaExpression {
    public static void main(String[] args) {

        Skill skill = () -> System.out.println("In lambda expression");
        skill.developApp();

        /**
         * (int experience)
         * Incase of 1 variable we write like only the variable name
         */

        Interview interview = experience -> System.out.println("I've " + experience + " years experience");
        interview.experience(2);


        /**
         * Lambda expression with return type
         */

        Add add = (i, j) -> i + j;

        int result = add.add(5, 4);
        System.out.println(result);

    }
}