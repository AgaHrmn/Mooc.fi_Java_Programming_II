
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First:" + first.toString() + "\nSecond: " + second.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    if (first.contains() != 0) {
                        if (amount <= first.contains()) {
                            first.remove(amount);
                            second.add(amount);
                        } else {
                            second.add(first.contains());
                            first.remove(amount);
                        }
                    }
                    break;
                case "remove":
                    second.remove(amount);
                    break;
            }
        }
    }
}
