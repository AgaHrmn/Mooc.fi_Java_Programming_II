/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap <LicensePlate, String> vr;
    public VehicleRegistry() {
        this.vr = new HashMap <>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vr.get(licensePlate) == null ) {
            this.vr.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }
    public String get(LicensePlate licensePlate) {
        return this.vr.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate) {
        if (this.vr.containsKey(licensePlate)) {
            this.vr.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        ArrayList<LicensePlate> plates = new ArrayList<>();
        for (LicensePlate plate : this.vr.keySet()) {
            if (!(plates.contains(plate))){
                plates.add(plate);
            }
        }
        for (LicensePlate p : plates) {
            System.out.println(p.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String o : this.vr.values()) {
            if (!(owners.contains(o))){
                owners.add(o);
            }
        }
        for (String o : owners) {
            System.out.println(o);
        }
    }
    
}
