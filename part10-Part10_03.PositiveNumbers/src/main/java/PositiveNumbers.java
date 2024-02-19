
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("numbers: ('end' to stop)");

        while (true) {
            String value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            }
            list.add(Integer.valueOf(value));
        }
        System.out.println("Positive numbers " + positive(list));

    }

    public static List<Integer> positive(List<Integer> integers) {
        return integers.stream()
                .filter(v -> v >= 0)
                .collect(Collectors.toList());
    }
}
