import java.util.Scanner;

public class PalatkaConf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int linesCount = Integer.parseInt(scanner.nextLine());

        int beds = 0;
        int food = 0;
        for (int i = 0; i < linesCount; i++) {

            String[] lineData =scanner.nextLine().split("\\s");
            if (lineData[0].equals("tents")){
                int count = Integer.parseInt(lineData[1]);
                if (lineData[2].equals("normal")){

                    beds+=2*count;
                }
                else if(lineData[2].equals("firstClass")){

                    beds+=count*3;
                }
            }
            else if(lineData[0].equals("rooms")){
                int count = Integer.parseInt(lineData[1]);
                if (lineData[2].equals("single")){
                    beds+=count*1;
                }
                else if(lineData[2].equals("double")){
                    beds+=count*2;
                }
                else if(lineData[2].equals("triple")){
                    beds+=count*3;
                }
            }
            else if(lineData[0].equals("food")){
                int count = Integer.parseInt(lineData[1]);
                if(lineData[2].equals("musaka")){
                    food += 2*count;
                }
            }
        }
        if(people<=beds){
            System.out.println("Everyone is happy and sleeping well. Beds left: "+ (beds-people));
        }
        else if(people>beds){
            System.out.println("Some people are freezing cold. Beds needed: "+(people-beds));
        }
        if(people<=food){
            System.out.println("Nobody left hungry. Meals left: "+(food-people));
        }
        else if(people>food){
            System.out.println("People are starving. Meals needed: "+(people-food));
        }
    }
}
