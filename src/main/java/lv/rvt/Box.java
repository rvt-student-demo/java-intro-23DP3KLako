package lv.rvt;

public class Box {
    public double length;
    public double height;
    public double width;

    public Box (double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }
    public Box (double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    public double volume() {
        return length * height *width;
    }

    public double area() {
        return 2 * (length * height + width * length * height * width);
    }
    
}