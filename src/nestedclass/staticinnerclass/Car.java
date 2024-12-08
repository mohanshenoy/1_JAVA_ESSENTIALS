package nestedclass.staticinnerclass;

public class Car {

    static class Wheel {
        private int diameter;
        public int getDiameter() {
            return diameter;
        }
        public void setDiameter(int diameter) {
            this.diameter = diameter;
        }
    }
}
