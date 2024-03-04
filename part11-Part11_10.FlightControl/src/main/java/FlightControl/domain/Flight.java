package FlightControl.domain;

public class Flight {

    private Airplane airplane;
    private String departure;
    private String destination;

    public Flight(Airplane airplane, String dep, String dest) {
        this.airplane = airplane;
        this.departure = dep;
        this.destination = dest;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public String getDep() {
        return this.departure;
    }
    
    public String getDest() {
        return this.destination;
    }
    
    public String toString() {
        return this.airplane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
}
