package app;

public class Indicator {

    public static String indicateColor(int temperature) {
        if (temperature <= 0) return "white";
        else return "black";
    }

    public static int indicateWeight(int temperature) {
        if (temperature <= 0) {
            return 1;
        } else {
            return temperature * 2;
        }
    }
}
