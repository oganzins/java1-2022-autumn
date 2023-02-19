package lv.javaguru.training.homework9.Shape;

public class Square implements  Shape{

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }
    }
