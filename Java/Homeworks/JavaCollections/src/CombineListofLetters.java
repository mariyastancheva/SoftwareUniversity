import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lenovo G575 on 25.3.2016 г..
 */
public class CombineListofLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] firstArray= firstLine.split("\\s");
        ArrayList<Character> firstCharArray = new ArrayList<Character>();
        for (int i = 0; i <firstArray.length; i++) {
            firstCharArray.add((firstArray[i].charAt(0)));
        }

        String[] secondArray= secondLine.split("\\s");
        ArrayList<Character> secondCharArray = new ArrayList<Character>();
        for (int i = 0; i <secondArray.length; i++) {
            secondCharArray.add((secondArray[i].charAt(0)));
        }
        ArrayList<Character> unique = new ArrayList<Character>();
        for (int i = 0; i < secondArray.length; i++) {
            if(!firstCharArray.contains(secondCharArray.get(i))){
                unique.add(secondCharArray.get(i));
            }
        }

        System.out.print(firstLine);
        for(Character ch : unique){
            System.out.print(" "+ch);
        }
    }
}
