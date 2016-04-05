import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo G575 on 1.4.2016 г..
 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        String word = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?=("+word+"))");
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> matches = new ArrayList<String>();
        while(matcher.find()){
            matches.add(matcher.group());
        }
        System.out.println(matches.size());
    }
}
