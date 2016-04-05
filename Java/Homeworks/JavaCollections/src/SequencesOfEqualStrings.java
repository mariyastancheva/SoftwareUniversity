import java.util.*;

/**
 * Created by lenovo G575 on 24.3.2016 г..
 */
public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s");
        System.out.print(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i-1])){
                System.out.print(" "+words[i]);
            }
            else{
                System.out.println();
                System.out.print(words[i]);
            }
        }

    }
}
