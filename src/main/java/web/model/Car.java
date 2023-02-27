package web.model;

public class Car {
    private String model;
    private String series;
    private int powerOfEngine;

    public Car() {
    }

    public Car(String model, String series, int powerOfEngine) {
        this.model = model;
        this.series = series;
        this.powerOfEngine = powerOfEngine;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    @Override
    public String toString() {
        return "Model = " + model +
                ", Series = " + series +
                ", Power of engine = " + powerOfEngine;
    }
}
