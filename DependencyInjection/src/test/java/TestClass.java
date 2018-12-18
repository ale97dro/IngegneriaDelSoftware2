import com.google.inject.Guice;
import com.google.inject.Injector;
import model.Car;
import model.ICar;
import org.junit.Test;

public class TestClass
{
    Injector injector = Guice.createInjector(new TestModule());

    @Test
    public void computeWeightTest()
    {
        Car car = injector.getInstance(Car.class);

        System.out.println(car.getWeight());
    }
}
