package Adapter;

import Adaptee.WeightMachine;
import Adaptee.WeightMachineForBabies;

public class WeightMachineAdapterImpl implements WeightMachineAdapter
{
    double weightInKgs;

    public WeightMachineAdapterImpl(WeightMachineForBabies weightMachineForBabies) {
        this.weightInKgs = weightMachineForBabies.getWeight()*0.4;
    }


    @Override
    public double getWeight() {
        return this.weightInKgs;
    }
}
