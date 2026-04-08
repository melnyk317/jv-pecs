package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;

import core.mate.academy.model.Truck;

public class TruckProducer implements MachineProducer<Truck> {

    private Truck truck1 = new Truck();
    private Truck truck2 = new Truck();
    private Truck truck3 = new Truck();

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<Truck>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        return trucks;
    }

}
