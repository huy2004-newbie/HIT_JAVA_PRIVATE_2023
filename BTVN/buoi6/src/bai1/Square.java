package bai1;

public class Square extends Rectangle{
    private double side;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "--Square--" + "\nArea: " + super.getArea() + "\nPerimeter: " + super.getPerimeter();
    }
}
