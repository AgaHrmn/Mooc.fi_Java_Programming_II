/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String input = scan.nextLine();

            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("To add:");
                input = scan.nextLine();
                list.add(input);
            } else if (input.equals("list")) {
                list.print();
            } else if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int num = Integer.valueOf(scan.nextLine());
                list.remove(num);
            }
        }
    }
}
