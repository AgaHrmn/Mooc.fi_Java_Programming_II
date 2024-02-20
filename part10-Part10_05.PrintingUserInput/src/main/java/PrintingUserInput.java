import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        System.out.println("Your input:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            inputs.add(input);
        }
        
        inputs.stream()
                .forEach(i -> System.out.println(i));

    }
}
