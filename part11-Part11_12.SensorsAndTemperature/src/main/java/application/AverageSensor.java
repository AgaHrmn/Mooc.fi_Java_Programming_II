package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Integer> readingsList;
    private ArrayList<Sensor> sensors;


    public AverageSensor() {
        this.readingsList = new ArrayList<>();
        this.sensors = new ArrayList<>();

    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!(s.isOn())) {
                return false;
            }

        }
        return true;
    }

    public void setOn() {

        for (Sensor s : sensors) {
            if (!(s.isOn())) {
                s.setOn();
            }
        }
    }

    public void setOff() {
        for (Sensor s : sensors) {
            if ((s.isOn())) {
                s.setOff();
            }
        }
    }

    public int read() {
        
        if (this.sensors.isEmpty() || !(this.isOn())) {
            throw new IllegalStateException("error");
        }
        int avg = this.sensors.stream().map(s -> s.read()).reduce(0, (prev, curr) -> prev + curr) / this.sensors.size();
        this.readingsList.add(avg);
        return avg;
    }
    
    public List<Integer> readings() {
        
        return this.readingsList;
    }
}
