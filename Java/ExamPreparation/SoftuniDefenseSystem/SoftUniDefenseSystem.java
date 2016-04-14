import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniDefenseSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> drinks = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        int totalQuantity = 0;

        for (int i = 0; i < 100; i++) {
            String line = scanner.nextLine();
            if (line.equals("OK KoftiShans")){
                break;
            }else{
                data.add(line);
            }
        }
        for (int i = 0; i < data.size(); i++) {
            Pattern pattern = Pattern.compile(".*?([A-Z][a-z]+).*?([A-Z][a-z]*?[A-Z]).*?(\\d+L)");
            Matcher matcher = pattern.matcher(data.get(i));
           while (matcher.find()) {
                names.add(matcher.group(1));
                drinks.add(matcher.group(2));
                quantity.add(Integer.parseInt(matcher.group(3).substring(0,matcher.group(3).length()-1)));
                totalQuantity += Integer.parseInt(matcher.group(3).substring(0,matcher.group(3).length()-1));
            }
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)+" brought "+ quantity.get(i)+" liters of "+drinks.get(i).toLowerCase()+"!");
        }
        double totalSoftuniQuantity = (double)totalQuantity/(double)1000;


        System.out.println(String.format("%.3f softuni liters",totalSoftuniQuantity));
    }
}
