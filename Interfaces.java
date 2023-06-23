/**
 * Interface isn't a class
 * 
 * By default every method in interface is public abstract
 * 
 * Interface just show us the design
 * 
 * All variable in the interface are by default final and static
 */
interface Skill {

    int experience = 1; // Final and static

    void flutter();

    void java();
}

interface OutdoorSkill {

    void cricket();
}

/**
 * 
 * class - class -> extends
 * 
 * 
 * 
 * 
 * class - interface -> implements
 * 
 * 
 * 
 * 
 * interface - interface -> extends
 * 
 * 
 * 
 * 
 * If we use implements keywords we have to define all the methods.
 * 
 * Otherwise this class will be abstract.
 * 
 * A class can implements multiple interface
 */
class Developer implements Skill, OutdoorSkill {

    @Override
    public void flutter() {
        System.out.println("I'm a flutter developer.");
    }

    @Override
    public void java() {
        System.out.println("I'm currently learning Java development.");
    }

    @Override
    public void cricket() {
        System.out.println("I am good at cricket.");
    }

}

public class Interfaces {
    public static void main(String[] args) {

        Skill skill = new Developer();
        skill.flutter();
        skill.java();

        System.out.println(skill.experience);

        OutdoorSkill outdoorSkill = new Developer();
        outdoorSkill.cricket();

    }
}
