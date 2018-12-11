import com.google.inject.Inject;

public class Car {
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

    public Car()
    {

    }

    public double getWeight()
    {
        return 0.0;
    }
}
