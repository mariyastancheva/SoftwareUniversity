import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0;i<length;i++){
            numbers[i]=scanner.nextInt();
        }
        Arrays.sort(numbers);
        for(Integer n:numbers){
            System.out.println(n);
        }
    }
}
