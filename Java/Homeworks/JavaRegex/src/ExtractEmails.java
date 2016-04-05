import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo G575 on 1.4.2016 г..
 */
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile
                ("((?![\\.\\-\\_])([\\w\\.\\-]+)(?<![\\.\\-\\_]))@(((?![\\-\\_])([A-Za-z\\-\\.])(?<![\\-\\_])))+");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
