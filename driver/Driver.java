package driver;

import java.util.Scanner;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.ShapeType;
import model.Triangle;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Pilih jenis bentuk (0: Lingkaran, 1: Persegi Panjang, 2: Segitiga): ");
        int choice = scanner.nextInt();
        ShapeType shapeType = null;

        switch (choice) {
            case 0:
                shapeType = ShapeType.CIRCLE;
                break;
            case 1:
                shapeType = ShapeType.RECTANGLE;
                break;
            case 2:
                shapeType = ShapeType.TRIANGLE;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (shapeType == ShapeType.CIRCLE) {
            System.out.println("Keliling Lingkaran: " + calculatePerimeter(circle));
        } else if (shapeType == ShapeType.RECTANGLE) {
            System.out.println("Keliling Persegi Panjang: " + calculatePerimeter(rectangle));
        } else if (shapeType == ShapeType.TRIANGLE) {
            System.out.println("Keliling Segitiga: " + calculatePerimeter(triangle));
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
