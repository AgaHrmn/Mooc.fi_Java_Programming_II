/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
import java.util.ArrayList;
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> itemsInBox;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }
    
    public int getSumWeight() {
        int sum = 0;
        for (Item i : itemsInBox) {
            sum += i.getWeight();
        }
        return sum;
    }
    public void add(Item item){
        if (this.getSumWeight() + item.getWeight() <= capacity) {
            itemsInBox.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
    if (itemsInBox.contains(item)) {
        return true;
    }
    return false;
    }
    
}
