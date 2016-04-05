import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstPointX = scanner.nextDouble();
        double firstPointY = scanner.nextDouble();
        double secondPointX = scanner.nextDouble();
        double secondPointY = scanner.nextDouble();
        double thirdPointX = scanner.nextDouble();
        double thirdPointY = scanner.nextDouble();
        double area = (firstPointX*(secondPointY-thirdPointY)+secondPointX*
                      (thirdPointY-firstPointY)+thirdPointX*(firstPointY-secondPointY))/2;
        if (area<0) {
            area*=-1;
            System.out.println(String.format("%.0f", area));
        }
        else if (area >0){
            System.out.println(String.format("%.0f", area));
        }
        else{
            System.out.println("0");
        }
    }
}
