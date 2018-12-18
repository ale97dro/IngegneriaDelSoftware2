package model;

public class Engine implements IEngine {

    private String model;
    private double weight;

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
