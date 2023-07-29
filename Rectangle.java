package src.main;

public class Rectangle extends Calculate{
    private double square;
    private double rectangle;

    public Rectangle(double recPerimeter, double recSquaremeter, double squarePerimeter, double squareSquaremeter) {
        super(recPerimeter, recSquaremeter, squarePerimeter, squareSquaremeter);
        this.square = square;
        this.rectangle = rectangle;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật{ diện tích= "+getRecSquaremeter()+", chu vi= "+getRecPerimeter()+"}"+'\n'+
                "Hình vuông{ diện tích= " +getSquareSquaremeter()+", chu vi= "+getSquarePerimeter()+"}";
    }
}
