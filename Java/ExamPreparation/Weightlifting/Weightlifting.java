import com.sun.corba.se.impl.oa.poa.ActiveObjectMap;
import com.sun.org.apache.xpath.internal.SourceTree;
import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Maria Stancheva on 12.4.2016 г..
 */
public class Weightlifting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        TreeMap<String,TreeMap<String,Integer>> data = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] info = line.split("\\s");
            String name = info[0];
            String exercise = info[1];
            int weigth = Integer.parseInt(info[2]);
            if(data.containsKey(name)) {
                if (data.get(name).containsKey(exercise)) {

                    int previous = data.get(name).get(exercise);
                    data.get(name).put(exercise, previous + weigth);
                }
            }
            if (!data.containsKey(name)){
                data.put(name,new TreeMap<String,Integer>());
            }
            if (!data.get(name).containsKey(exercise)){
                data.get(name).put(exercise,weigth);
            }
        }
        for (String s : data.keySet()) {
            // Writing the names : //
           String lines = s + " : ";
            for (String s1 : data.get(s).keySet()) {
               lines+=s1 + " - ";
               lines+=data.get(s).get(s1) + " kg, ";
            }
           String finalLines = lines.substring(0, lines.length()-2);
            System.out.println(finalLines);
        }


    }
}
