
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {

            System.out.println("First: " + first + "/" + "100" + "\n" + "Second: " + second + "/" + "100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    if (amount > 0) {
                        if (first + amount <= 100) {
                            first += amount;
                        } else {
                            first = 100;
                        }
                    }
                    break;
                case "move":
                    if (first != 0) {
                        if (amount <= first) {
                            first -= amount;
                            if (second + amount <= 100) {
                                second += amount;
                            } else {
                                second = 100;
                            }

                        } else {
                            if (second + first <= 100) {
                                second += first;
                                first = 0;
                            } else {
                                second = 100;
                                first = 0;
                            }
                        }
                    }
                    break;
                case "remove":

                    if (amount <= second) {
                        second -= amount;
                    } else {
                        second = 0;
                    }

                    break;
            }

        }
    }

}
