package FlightControl.domain;

public class Airplane {
    private String ID;
    private String capacity;
    
    public Airplane(String id, String cap) {
        this.ID = id;
        this.capacity = cap;
    }
    
    public String getID(){
        return this.ID;
    }
    public String getCap(){
        return this.capacity;
    }
    
    public String toString() {
        return this.ID + " (" + this.capacity + " capacity)";
    }
}
