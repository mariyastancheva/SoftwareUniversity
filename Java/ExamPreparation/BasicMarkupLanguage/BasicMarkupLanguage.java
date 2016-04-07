import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Maria Stancheva on 5.4.2016 г..
 */
public class BasicMarkupLanguage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("<stop/>")) {
                break;
            } else {
                input.add(line);
            }
        }
        for (String s : input) {
            if (s.contains("inverse")) {
                output.add(inverse(s));
            } else if (s.contains("repeat")) {
                for (String s1 : repeat(s)) {
                    output.add(s1);
                }
            } else if (s.contains("reverse")) {
                output.add(reverse(s));
            }
        }

        for (int i = 0; i < output.size(); i++) {
            System.out.println(MessageFormat.format("{0}. {1}",i+1,output.get(i)));
        }
    }

    private static String inverse(String line) {

        String newLine = "";
        String stringForReversion = line.split("\"")[1];
        for (int i = 0; i < stringForReversion.length(); i++) {

            if (Character.isUpperCase(stringForReversion.charAt(i))) {
                newLine += Character.toLowerCase(stringForReversion.charAt(i));
            } else {
                newLine += Character.toUpperCase(stringForReversion.charAt(i));
            }
        }
        return newLine;
    }

    private static String reverse(String line) {

        String stringForReversion = line.split("\"")[1];

        String reversedLine = new StringBuilder(stringForReversion).reverse().toString();
        return reversedLine;
    }

    private static ArrayList<String> repeat(String line) {
        ArrayList<String> repeatedStrings = new ArrayList<>();


        int count = Integer.parseInt(line.split("\"")[1]);
        String stringForRepetition = line.split("\"")[3];
        for (int i = 0; i < count; i++) {
            repeatedStrings.add(stringForRepetition);
        }
        return repeatedStrings;
    }
}
