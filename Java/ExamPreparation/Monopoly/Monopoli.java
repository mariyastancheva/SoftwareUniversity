import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Maria Stancheva on 4.4.2016 г..
 */
public class Monopoli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrOfRowAndCol = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(arrOfRowAndCol[0]);
        int cols = Integer.parseInt(arrOfRowAndCol[1]);


        char[][] matrix = fillingMatrix(rows,cols);

        int total = 50;
        int hotels = 0;
        int totalMoves = rows * cols;
        int turn = 0;
        ArrayList<String> info = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            if (row == 0 || row % 2 == 0) {
                for (int col = 0; col < cols; col++) {
                    if (matrix[row][col] == 'H') {
                        hotels++;
                        turn++;
                        info.add("Bought a hotel for " + total + ". Total hotels: " + hotels + ".");
                        total = 0;
                    } else if (matrix[row][col] == 'J') {
                        totalMoves += 2;
                        info.add("Gone to jail at turn " + turn + ".");
                        turn += 3;
                        total += (hotels * 10) * 2;
                    } else if (matrix[row][col] == 'S') {
                        if (total < (row + 1) * (col + 1)) {

                            info.add("Spent " + (total) + " money at the shop.");
                            total = 0;
                            turn++;
                        } else {
                            total -= (row + 1) * (col + 1);
                            info.add("Spent " + ((row + 1) * (col + 1)) + " money at the shop.");
                            turn++;
                        }
                    } else if (matrix[row][col] == 'F') {
                        turn++;
                    }
                    total += hotels * 10;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    if (matrix[row][j] == 'H') {
                        hotels++;
                        turn++;
                        info.add("Bought a hotel for " + total + ". Total hotels: " + hotels + ".");
                        total = 0;
                    } else if (matrix[row][j] == 'J') {
                        totalMoves += 2;
                        info.add("Gone to jail at turn " + turn + ".");
                        turn += 3;
                        total += (hotels * 10) * 2;
                    } else if (matrix[row][j] == 'S') {
                        if (total < (row + 1) * (j + 1)) {
                            info.add("Spent " + (total) + " money at the shop.");
                            total = 0;
                            turn++;
                        } else {
                            total -= (row + 1) * (j + 1);
                            info.add("Spent " + ((row + 1) * (j + 1)) + " money at the shop.");
                            turn++;
                        }
                    } else if (matrix[row][j] == 'F') {
                        turn++;
                    }
                    total += hotels * 10;
                }
            }

        }
        for (String s : info) {
            System.out.println(s);
        }
        System.out.println("Turns " + turn);
        System.out.println("Money " + total);
    }
    private static char[][] fillingMatrix(int rows,int cols){
        Scanner scanner = new Scanner(System.in);
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }
        return matrix;
    }

}
