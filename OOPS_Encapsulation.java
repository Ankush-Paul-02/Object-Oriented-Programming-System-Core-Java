class Developer {
    String name;
    int experience;

    /**
     * Encapsulation in Java refers to integrating data (variables) and code (methods)
     * into a single unit. In encapsulation, a class's variables are hidden from other
     * classes and can only be accessed by the methods of the class in which they are 
     * found.
     */
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer [name=" + name + ", experience=" + experience + ", salary=" + salary + "]";
    }
}

public class OOPS_Encapsulation {
    public static void main(String[] args) {
        
        Developer developer = new Developer();
        developer.name = "Ankush Paul";
        developer.experience = 2;


        /**
         * Set the value of the salary
         */
        developer.setSalary(3000);

        /**
         * Get the value of the salary
         */
        System.out.println("Salary: " +  developer.getSalary());

        System.out.println(developer);


    }
}
