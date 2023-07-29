package src.main;

public class Calculate {
    private double recPerimeter;
    private double recSquaremeter;
    private double squarePerimeter;
    private double squareSquaremeter;
    private double length;
    private double width;
    private double side;

    public Calculate(double recPerimeter, double recSquaremeter, double squarePerimeter, double squareSquaremeter) {
        this.recPerimeter = recPerimeter;
        this.recSquaremeter = recSquaremeter;
        this.squarePerimeter = squarePerimeter;
        this.squareSquaremeter = squareSquaremeter;
    }

    public double getRecPerimeter() {
        return recPerimeter;
    }

    public void setRecPerimeter(double recPerimeter) {
        this.recPerimeter = recPerimeter;
    }

    public double getRecSquaremeter() {
        return recSquaremeter;
    }

    public void setRecSquaremeter(double recSquaremeter) {
        this.recSquaremeter = recSquaremeter;
    }

    public double getSquarePerimeter() {
        return squarePerimeter;
    }

    public void setSquarePerimeter(double squarePerimeter) {
        this.squarePerimeter = squarePerimeter;
    }

    public double getSquareSquaremeter() {
        return squareSquaremeter;
    }

    public void setSquareSquaremeter(double squareSquaremeter) {
        this.squareSquaremeter = squareSquaremeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
