package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private int number;
    private boolean workingState;

    public TemperatureSensor() {
        this.workingState = false;
    }

    public boolean isOn() {
        return this.workingState;
    }

    public void setOn() {
        this.workingState = true;
    }

    public void setOff() {
        this.workingState = false;
    }

    public int read() {
        if (!(this.isOn())) {
            throw new IllegalStateException();
        }
        return this.number = new Random().nextInt(61) - 30;
    }
}
