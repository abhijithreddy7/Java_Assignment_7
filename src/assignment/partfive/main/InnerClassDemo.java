package assignment.partfive.main;

import assignment.partfive.classes.FirstClass;
import assignment.partfive.classes.SecondClass;

public class InnerClassDemo {
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        FirstClass.FirstInner fin = sc.new FirstInner("Inside first inner class!");

    }
}
