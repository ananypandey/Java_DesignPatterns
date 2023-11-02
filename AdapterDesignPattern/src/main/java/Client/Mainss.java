package Client;

import Adaptee.WeightMachine;
import Adaptee.WeightMachineForBabies;
import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImpl;

public class Mainss {
    public static void main(String[] args) {
        WeightMachineForBabies weightMachineForBabies = new WeightMachineForBabies(22);
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(weightMachineForBabies);
        System.out.println(weightMachineAdapter.getWeight());

    }
}
