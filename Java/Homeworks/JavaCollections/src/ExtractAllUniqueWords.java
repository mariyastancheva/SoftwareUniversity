import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lenovo G575 on 25.3.2016 г..
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        String regex = "\\b[a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(text);
        ArrayList<String> allMatches =new ArrayList<String>();
        while(match.find()){
            allMatches.add(match.group());
        }
        Collections.sort(allMatches);
        HashSet<String> unique = new HashSet<String>();
        for (int i = 0; i < allMatches.size(); i++) {
            unique.add(allMatches.get(i));
        }

        for(String u : unique){
            System.out.print(u+" ");
        }

    }
}
