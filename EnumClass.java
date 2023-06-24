enum Instagram {

    /**
     * In case of private constructor we can create the object in same class
     */
    
    Followers(221), Following(213), Posts;

    private int number;

    private Instagram() {}

    private Instagram(int number) {
        this.number = number;
        System.out.println("In Instagram " + this.name());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}


public class EnumClass {
    public static void main(String[] args) {
        
        // Instagram ig = Instagram.Followers;
        // System.out.println(ig + " : " + ig.getNumber());

        for (Instagram instagram : Instagram.values()) {
            System.out.println(instagram + " : " + instagram.getNumber());
        }

    }
}
