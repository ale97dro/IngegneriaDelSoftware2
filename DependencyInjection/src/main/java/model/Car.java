package model;

import com.google.inject.Inject;

public class Car implements ICar {
    @Inject
    private IEngine engine;
    @Inject
    private IBody body;
    @Inject
    private Frame frame;
    @Inject
    private Interior interior;
    @Inject
    private Wheel[] wheels;

    public double getWeight()
    {
        double weight = 0.0;

        weight = engine.getWeight() + body.getWeight() + frame.getWeight() + interior.getWeight();

        for(int i=0;i<wheels.length;i++)
            weight += wheels[i].getWeight();

        return weight;
    }

    //Override
    public IEngine getEngine()
    {
        return engine;
    }

    public IBody getBody() {
        return body;
    }

    public Frame getFrame() {
        return frame;
    }

    public Interior getInterior() {
        return interior;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setModel(String model)
    {
        engine.setModel(model);
    }
}
