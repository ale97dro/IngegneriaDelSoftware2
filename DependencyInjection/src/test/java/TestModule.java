import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import model.*;

public class TestModule extends AbstractModule
{

    protected void configure() {

       // bind(IBody.class).to(FakeBody.class); //todo: bind con fake
        //bind(IEngine.class).to(FakeEngine.class); //todo bind con fake

       // bind(ICar.class).to(Car.class);
    }

    @Provides
    public IEngine provideFakeEngine()
    {
        return new FakeEngine("Modello", 50.0);
    }

    @Provides
    public IBody provideFakeBody()
    {
        return new FakeBody(300.0);
    }

    @Provides
    public Wheel[] provideWheels()
    {
        Wheel[] wheels = new Wheel[4];

        for(int i=0;i<wheels.length;i++)
        {
            wheels[i] = new Wheel();
            wheels[i].setWeight(3.0);
        }

        return wheels;
    }
}
