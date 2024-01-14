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

public class ChangeHistory {

    private ArrayList<Double> pw;

    public ChangeHistory() {
        this.pw = new ArrayList<>();
    }

    public void add(double status) {
        this.pw.add(status);
    }

    public void clear() {
        this.pw.clear();
    }

    public String toString() {
        return this.pw.toString();
    }

    public double maxValue() {
        if (pw.size() > 0) {
            double maxValue = pw.get(0);
            for (double e : pw) {
                if (e > maxValue) {
                    maxValue = e;
                }
            }
            return maxValue;
        }
        return 0.0;
    }

    public double minValue() {
        if (pw.size() > 0) {
            double minValue = pw.get(0);
            for (double e : pw) {
                if (e < minValue) {
                    minValue = e;
                }
            }
            return minValue;
        }
        return 0.0;
    }

    public double average() {
        double sum = 0;
        if (pw.size() > 0) {

            for (double e : pw) {
                sum += e;
            }
            return sum / pw.size();
        }
        return 0;

    }
}
