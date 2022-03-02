package assignment.partfour.methods;

import assignment.partfour.interfaces.Cycle;
import assignment.partfour.interfaces.CycleFactory;

public class AbstractFactory {
    public void createCycle(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.ride();
        c.numberOfWheels();
    }
}
