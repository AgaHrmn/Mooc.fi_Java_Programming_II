import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
    public double weight() {
        double total = 0;
        if (this.box.isEmpty()) {
            return 0;
        }
        for (Packable p : box) {
            total += p.weight();
        }
        return total;
    }
    public void add(Packable item) {
        if (this.weight() + item.weight() <= capacity){
            this.box.add(item);
        }
    }
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
