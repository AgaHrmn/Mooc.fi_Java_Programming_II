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

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public String toString() {
        String str = "";
        for (Movable obj : this.herd) {
            str += obj + "\n";
        }
        return str;
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        if (!this.herd.isEmpty()) {
            for (Movable obj : this.herd) {
                obj.move(dx, dy);
            }
        }
    }
}
