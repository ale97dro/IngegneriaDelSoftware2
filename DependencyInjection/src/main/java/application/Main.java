package application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import model.CarModule;
import model.ICar;
import model.Wheel;

public class Main
{
    public static void main(String[] args)
    {
        Injector injector = Guice.createInjector(new CarModule());

        ICar car = injector.getInstance(ICar.class);

        System.out.println(car.getEngine());
        System.out.println(car.getFrame());
        Wheel[] wheels = car.getWheels();

        for(Wheel w : wheels)
            System.out.println("Peso: " + w.getWeight());
    }
}
