package model;

public interface ICar {
    public IEngine getEngine();
    public IBody getBody();
    public Frame getFrame();
    public Interior getInterior();
    public Wheel[] getWheels();
}
