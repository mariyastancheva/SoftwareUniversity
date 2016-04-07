import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by lenovo G575 on 2.4.2016 г..
 */
public class ArrangeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] input = line.split(",\\s");
        String[] initialInput =line.split(",\\s");

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < initialInput[i].length(); j++) {
                if(initialInput[i].length()==1){
                    switch (initialInput[i].charAt(j)){
                        case '0': input[i]="zero";break;
                        case '1':input[i]="one";break;
                        case'2':input[i]="two";break;
                        case'3':input[i]= "three";break;
                        case'4':input[i]="four";break;
                        case'5':input[i]="five";break;
                        case '6':input[i]="six";break;
                        case '7':input[i]="seven";break;
                        case'8':input[i]="eight";break;
                        case'9':input[i]="nine";break;
                        default:break;
                    }
                }else{
                    switch (initialInput[i].charAt(j)){
                        case '0': input[i]+=" "+"zero";break;
                        case '1':input[i]+=" "+"one";break;
                        case'2':input[i]+=" "+"two";break;
                        case'3':input[i]+=" "+"three";break;
                        case'4':input[i]+=" "+"four";break;
                        case'5':input[i]+=" "+"five";break;
                        case '6':input[i]+=" "+"six";break;
                        case '7':input[i]+=" "+"seven";break;
                        case'8':input[i]+=" "+"eight";break;
                        case'9':input[i]+=" "+"nine";break;
                        default:break;
                    }
                }

            }
        }
        Map<String,String> numbers = new TreeMap<String,String>();
        for (int i = 0; i < input.length; i++) {
            numbers.put(input[i],initialInput[i]);
        }
        for(Map.Entry<String,String> entry:numbers.entrySet()){
            System.out.print( entry.getValue());
        }
    }
}
