package model;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class CarModule extends AbstractModule {

    protected void configure()
    {
        bind(IBody.class).to(Body.class);
        bind(IEngine.class).to(Engine.class);

        bind(ICar.class).to(Car.class);
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
