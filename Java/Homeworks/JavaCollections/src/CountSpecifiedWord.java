import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo G575 on 24.3.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = 0;
        text.toLowerCase();
        String word = scanner.nextLine();
        String regex = String.format("\\b%s\\b",word);
        Pattern pattern = Pattern.compile(regex);

        Matcher match = pattern.matcher(text);
       while(match.find()){
           count++;
       }
        System.out.println(count);

    }
}
