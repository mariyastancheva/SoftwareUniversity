import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s");
        int countOfWords = text.length;
        System.out.println(countOfWords);
    }
}
