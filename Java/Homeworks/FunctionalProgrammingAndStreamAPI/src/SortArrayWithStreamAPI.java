import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by lenovo G575 on 31.3.2016 г..
 */
public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s");
        List<String> list = Arrays.asList(input);
        String command = scanner.nextLine();
        if (command.equals("Ascending")) {
            List<Integer> numbers = Arrays.stream(input)
                    .map(i -> Integer.parseInt(i))
                    .sorted()
                    .collect(Collectors.toList());
            numbers.forEach(i -> System.out.print(i+" "));
        }
        else if(command.equals("Descending")){
            List<Integer> numbers = Arrays.stream(input)
                    .map(i -> Integer.parseInt(i))
                    .sorted()
                    .collect(Collectors.toList());
            Collections.reverse(numbers);
            numbers.forEach(i -> System.out.print(i+" "));
        }

    }
}
