import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 5, 7, 8, 9, 3);

        // Stream<Integer> data = list.stream();

        // Stream<Integer> sorted = data.sorted();
        // sorted.forEach(n -> System.out.println(n));

        // for (Integer num : list) {
        // System.out.println(num * 2);
        // }

        // Stream<Integer> mappedData = data.map(n -> n*2);
        // mappedData.forEach(n -> System.out.println(n));

        // ? There are total 4 streams 😂
        int result = list
                .stream()
                .filter(n -> n % 2 != 0) // ! Wow 😲
                .sorted()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e); // ! sum
        System.out.println(result);
    }
}