package core.mate.academy.service;

import java.util.List;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class type) throws ThereIsNoSuchMachineExeption {
        if (type != Bulldozer.class && type != Excavator.class && type != Truck.class
                && type != Machine.class) {
            throw new ThereIsNoSuchMachineExeption("There is no such type of machines");
        }
        if (type == Bulldozer.class) {
            return (List<Machine>) (List<?>) new BulldozerProducer().get();
        } else if (type == Excavator.class) {
            return (List<Machine>) (List<?>) new ExcavatorProducer().get();
        } else {
            return (List<Machine>) (List<?>) new TruckProducer().get();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List machines) {
        for (int i = 0; i < machines.size(); i++) {
            if (machines.get(i) == Machine.class) {
                ((Machine) machines.get(i)).doWork();
            }
        }
    }
}
