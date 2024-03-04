package FlightControl.ui;

import FlightControl.domain.*;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class UserInterface {

    private FlightControl fc;
    private Scanner s;

    public UserInterface() {
        this.fc = new FlightControl();
        this.s = new Scanner(System.in);
    }

    public void start() {
        startAAC();
        System.out.println("");
        startFC();
        System.out.println("");
    }

    private void startAAC() {
        System.out.println("Airport Asset Control");
        System.out.println("");
        boolean aac = true;
        while (aac) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String input = s.nextLine();

            switch (input) {
                case "1":
                    addAirplane();
                    break;
                case "2":
                    addFlight();
                    break;
                case "x":
                    aac = false;
                    break;
            }
        }
    }

    private void startFC() {
        System.out.println("Flight Control");
        System.out.println("");
        boolean fc = true;
        while (fc) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String input = s.nextLine();

            switch (input) {
                case "1":
                    printAirplanes();
                    break;
                case "2":
                    printFlights();
                    break;
                case "3":
                    printAirplaneDetails();
                    break;
                case "x":
                    fc = false;
                    break;
            }
        }
    }

    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = s.nextLine();
        System.out.print("Give the airplane capacity: ");
        String cap = s.nextLine();;

        fc.addAirplane(id, cap);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        String id = s.nextLine();
        System.out.print("Give the departure airport id: ");
        String dep = s.nextLine();
        System.out.print("Give the target airport id: ");
        String dest = s.nextLine();

        if (fc.getAirplane(id).equals(null)) {
            System.out.println("No such plane in the Data Base.");
        } else {
            fc.addFlight(fc.getAirplane(id), dep, dest);
        }
    }

    private void printAirplanes() {
        for (Airplane a : fc.getAllAirplanes()) {
            System.out.println(a);
        }
    }

    private void printFlights() {
    for (Flight f : fc.getAllFlights()) {
        System.out.println(f);
    }
}

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id:");
        String id = s.nextLine();

        if (fc.getAirplane(id) == null) {
            System.out.print("No such plane in the Data Base.");
        } else {
            System.out.println(fc.getAirplane(id));
        }
    }

}
