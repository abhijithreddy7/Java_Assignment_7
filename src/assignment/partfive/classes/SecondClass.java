package assignment.partfive.classes;

public class SecondClass extends FirstClass {
    public class SecondInner extends FirstClass.FirstInner {

        public SecondInner(String str) {
            super(str);
        }
    }
}
