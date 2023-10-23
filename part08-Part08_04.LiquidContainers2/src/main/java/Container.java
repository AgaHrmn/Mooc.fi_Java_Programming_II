/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
public class Container {

    private int liquid;

    public int contains() {
        return liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (liquid + amount <= 100) {
                liquid += amount;
            } else {
                liquid = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount <= liquid) {
            liquid -= amount;
        } else {
            liquid = 0;
        }
    }
    
    public String toString() {
        return liquid + "/100";
    }

}
