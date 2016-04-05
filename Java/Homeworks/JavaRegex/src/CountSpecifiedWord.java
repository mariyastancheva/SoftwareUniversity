import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo G575 on 1.4.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        String word = scanner.nextLine();
        int count = 0;
        Pattern pattern = Pattern.compile("(\\b"+word+"\\b)");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
