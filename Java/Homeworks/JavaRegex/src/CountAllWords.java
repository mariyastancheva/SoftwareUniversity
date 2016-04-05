import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo G575 on 1.4.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\b[A-Za-z]+\\b)");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
