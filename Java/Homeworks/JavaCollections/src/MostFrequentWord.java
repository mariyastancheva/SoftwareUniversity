import javax.swing.*;
import java.util.*;

/**
 * Created by lenovo G575 on 28.3.2016 г..
 */
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String [] words = input.split("[ ,?!\\.]+");

        Map<String,Integer> map = new TreeMap<>();
        for(String s:words){
            if (map.get(s)==null){
                map.put(s,1);
            }
            else{
                map.put(s, map.get(s) + 1);
            }
        }
        int maxValueInMap = Collections.max(map.values());
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if (entry.getValue().equals(maxValueInMap)){
                System.out.println(entry.getKey() + " -> " + entry.getValue()+" times");
            }

        }

    }
}
