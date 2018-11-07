public class Circle {
    private double radius = 1.0;
    private String color;
    private boolean filled;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "A Circle with radius="
                +getRadius()
                +" Area: "+getArea()
                +" Perimeter: "+getPerimeter();
    }
}
