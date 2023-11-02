package Adaptee;

public class WeightMachineForBabies implements WeightMachine{

    double weightInPounds;

    public WeightMachineForBabies(double i)
    {
        this.weightInPounds=i;
    }

    @Override
    public double getWeight() {
        return this.weightInPounds;
    }
}
