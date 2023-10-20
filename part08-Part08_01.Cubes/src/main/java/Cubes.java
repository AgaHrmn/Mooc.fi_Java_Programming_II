
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while (!input.equals("end")) {
            int num = Integer.valueOf(input);
            int cube = num*num*num;
            System.out.println(cube);
            input = scanner.nextLine();
        }
    }
}
