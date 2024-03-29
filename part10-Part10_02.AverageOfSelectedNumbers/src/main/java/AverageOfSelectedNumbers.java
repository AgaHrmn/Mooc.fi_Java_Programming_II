
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usrInput = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            usrInput.add(input);
        }

        double positiveAvg = usrInput.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num >= 0)
                .average()
                .getAsDouble();
        
        double negativeAvg = usrInput.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(num -> num < 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ans = scanner.nextLine();
        if (ans.equals("n")) {
            System.out.println("Average of the negative numbers:" + negativeAvg);
        } else if (ans.equals("p")){
            System.out.println("Average of the positive numbers:" + positiveAvg);
        } else {
            System.out.println("No result.");
        }
    }
}
