package app;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor(Substance substance) {
        this.substance = substance;
        this.substance.attach(this);
    }

    @Override
    public void update() {
        int temperature = substance.getState();
        System.out.println("Temperature: " + temperature);
        System.out.println("Color: " + Indicator.indicateColor(temperature));
        System.out.println("Weight (g): " + Indicator.indicateWeight(temperature));
    }
}
