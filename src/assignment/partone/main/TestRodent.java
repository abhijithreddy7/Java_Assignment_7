package assignment.partone.main;

import assignment.partone.classes.Gerbil;
import assignment.partone.classes.Hamster;
import assignment.partone.classes.Mouse;
import assignment.partone.classes.Rodent;

public class TestRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster()};

        for(Rodent rodent : rodents){
            rodent.eat();
        }
    }
}