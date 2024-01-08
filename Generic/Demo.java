package Generic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ankush");

        List anotherList = new ArrayList();
        anotherList.add("Paul");
        anotherList.add(1);

        System.out.println(list);
        System.out.println(anotherList);

    }
}