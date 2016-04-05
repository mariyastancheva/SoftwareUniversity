import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double firstFormula = Math.pow((Math.pow(a, 2) + Math.pow(b, 2))
                              /(Math.pow(a,2)-Math.pow(b,2)),(a+b+c)/Math.sqrt(c));
        double secondFormula = Math.pow(Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3),a-b);

        double averageBetweenNumbs = (a+b+c)/3;
        double averageBetweenFormulas = (firstFormula+secondFormula)/2;
        double difference = 0;
        if (averageBetweenNumbs<averageBetweenFormulas){
            difference = averageBetweenFormulas-averageBetweenNumbs;
        }
        else{
            difference = averageBetweenNumbs-averageBetweenFormulas;
        }
        System.out.println(String.format("F1 result: %.2f",firstFormula));
        System.out.println(String.format("F2 result: %.2f",secondFormula));
        System.out.println(String.format("Diff: %.2f",difference));
    }
}
