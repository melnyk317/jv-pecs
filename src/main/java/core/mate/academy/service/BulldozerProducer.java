package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;

import core.mate.academy.model.Bulldozer;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        return createList(3);
    }

    private static List<Bulldozer> createList(int amount) {
        List<Bulldozer> bulldozers = new ArrayList<Bulldozer>();
        for (int i = 0; i < amount; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
    
}
