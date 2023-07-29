package src.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài hình chữ nhật");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập chiều rộng hình chữ nhật");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời nhập cạnh hình vuông");
        double side = Double.parseDouble(scanner.nextLine());
        double recPerimeter = 2*(length+width);
        double recSquaremeter = length*width;
        double squarePerimeter = 4*side;
        double squareSquaremeter = side*side;
        Rectangle rectangle = new Rectangle(recPerimeter,recSquaremeter,squarePerimeter,squareSquaremeter);
        System.out.println(rectangle);
    }
}
