import java.util.Scanner;

/**
 * Created by lenovo G575 on 23.3.2016 г..
 */
public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        String number = Integer.toString(num);
        int j = number.length()-1;
        for (int i =0;i<number.length();i++){

            sum+=Character.getNumericValue(number.charAt(i))*Math.pow(7,j);
            j--;
        }
        System.out.println(sum);

    }
}
