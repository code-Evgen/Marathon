package day9.Task2;

public class Rectangle extends Figure{
    private double high;
    private double width;

    public Rectangle(double high, double width, String color) {
        super(color);
        this.high = high;
        this.width = width;
    }

    @Override
    public double area(){
        return width * high;
    }

    @Override
    public double perimeter() {
        return 2 * (width + high);
    }
}
