package assignment.partfour.classes;

import assignment.partfour.interfaces.Cycle;
import assignment.partfour.interfaces.CycleFactory;

public class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
