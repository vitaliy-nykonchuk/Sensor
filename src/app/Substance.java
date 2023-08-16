package app;

import java.util.ArrayList;
import java.util.List;

public class Substance {

    private final List<Sensor> sensors = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Sensor sensor) {
        sensors.add(sensor);
    }

    public void notifyAllObservers() {
        for (Sensor sensor : sensors) {
            sensor.update();
        }
    }
}
