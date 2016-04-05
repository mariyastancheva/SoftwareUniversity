import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo G575 on 31.3.2016 г..
 */
public class FilterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s");
        Arrays.stream(input).filter(i->i.length()>3).forEach(i->{
            System.out.print(i+" ");
        });

    }
}
