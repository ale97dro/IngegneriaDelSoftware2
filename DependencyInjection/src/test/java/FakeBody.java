import model.Body;
import model.IBody;

public class FakeBody implements IBody {
    private double weight;

    public FakeBody(double weight)
    {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
