package model;

public class Triangle implements Shape {
    private double base;
    private double height;
    private double hypotenuse; // Panjang sisi miring

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(base * base + height * height); // Menggunakan teorema Pythagoras
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

}
