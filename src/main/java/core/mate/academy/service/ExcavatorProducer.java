package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;

import core.mate.academy.model.Excavator;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    
    private Excavator excavator1 = new Excavator();
    private Excavator excavator2 = new Excavator();
    private Excavator excavator3 = new Excavator();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<Excavator>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        return excavators;
    }

}
