
import java.util.Comparator;
import java.util.Optional;
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public int totalWeight() {
        return this.Items.stream()
                .map(i -> i.getWeight())
                .reduce(0, (total, weight) -> total + weight);
    }

    public void printItems() {
        Items.stream()
                .forEach(i -> System.out.println(i));
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.Items.stream()
                .max(Comparator.comparing(Item::getWeight))
                .get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
