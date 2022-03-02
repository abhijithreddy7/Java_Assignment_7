package assignment.partfour.main;

import assignment.partfour.classes.BicycleFactory;
import assignment.partfour.classes.TricycleFactory;
import assignment.partfour.classes.UnicycleFactory;
import assignment.partfour.methods.AbstractFactory;

public class TestFactory {
    public static void main(String[] args) {

        AbstractFactory factory = new AbstractFactory();

        factory.createCycle(new UnicycleFactory());

        factory.createCycle(new BicycleFactory());

        factory.createCycle(new TricycleFactory());

    }
}
