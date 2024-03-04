package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;
import FlightControl.domain.*;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
    }

    //part 1
    public void addAirplane(String id, String cap) {
        this.airplanes.put(id, new Airplane(id, cap));
    }

    public void addFlight(Airplane airplane, String dep, String dest) {
        if (airplanes.containsKey(airplane.getID())) {
            Flight f = new Flight(airplane, dep, dest);
            this.flights.put(f.toString(), f);
        } else {
            System.out.println("No such plane in the data base.2");
        }
    }

    //part 2
    public Collection<Airplane> getAllAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getAllFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String id) {
        return this.airplanes.get(id);
    }
}
