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

public class MisplacingBox extends Box {

    private ArrayList<Item> itemsInBox;

    public MisplacingBox() {
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Item item) {
        itemsInBox.add(item);
    }

    public boolean isInBox(Item item) {
//        if (this.itemsInBox.contains(item)) {
//            return false;
//        }
        return false;
    }

}
