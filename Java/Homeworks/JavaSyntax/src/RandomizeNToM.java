import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//10
        int m = scanner.nextInt();//15
        ArrayList<Integer> numbs = new ArrayList<Integer>();
        int difference =1;
        if (n<m){
            difference += m-n;
            for (int i = n;i<=m;i++) {
                numbs.add(i);
            }
        }
        else if (n>m){
            difference += n-m;
            for (int i = m;i<=n;i++) {
                numbs.add(i);
            }
        }
        else if(n==m){
            numbs.add(n);
        }
        Collections.shuffle(numbs);
        for (int i =0; i<numbs.size();i++){
            System.out.print(numbs.get(i)+" ");
        }

    }
}
