
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (!(this instanceof LicensePlate)) {
            return false;
        }
        LicensePlate lp = (LicensePlate) ob;
        if (this.liNumber.equals(lp.liNumber) && this.country.equals(lp.country)) {
            return true;
        }
        
        return false;
    }
    
    public int hashCode() {
        if (this.country == null) {
            return this.liNumber.hashCode();
        } else if (this.liNumber == null) {
            return this.country.hashCode();
        }
        return this.liNumber.hashCode() + this.country.hashCode();
    } 

}
