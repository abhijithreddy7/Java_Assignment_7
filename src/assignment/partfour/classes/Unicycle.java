package assignment.partfour.classes;

import assignment.partfour.interfaces.Cycle;

public class Unicycle implements Cycle {

    @Override
    public void ride() {
        System.out.println("Riding Unicycle");
    }

    @Override
    public void numberOfWheels() {
        System.out.println("Unicycle has 1 wheel.");
    }
}
