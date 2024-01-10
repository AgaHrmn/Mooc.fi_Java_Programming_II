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
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> hm;

    public StorageFacility() {
        this.hm = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!(this.hm.containsKey(unit))) {
            this.hm.put(unit, new ArrayList<>());
            this.hm.get(unit).add(item);
        } else {
            this.hm.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.hm.containsKey(storageUnit)) {
            return this.hm.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (this.hm.containsKey(storageUnit) && !(this.hm.get(storageUnit).isEmpty())) {
            this.hm.get(storageUnit).remove(item);
            if (this.hm.get(storageUnit).isEmpty()) {
                this.hm.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> keys = new ArrayList<>();
        for (String k : this.hm.keySet()) {
            if (!(this.hm.get(k).isEmpty())) {
                keys.add(k);
            }
        }
        return keys;
    }
}
