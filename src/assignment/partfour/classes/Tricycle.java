package assignment.partfour.classes;

import assignment.partfour.interfaces.Cycle;

public class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Riding Tricycle");
    }
    @Override
    public void numberOfWheels() {
        System.out.println("Tricycle has 3 wheels.");
    }
}
