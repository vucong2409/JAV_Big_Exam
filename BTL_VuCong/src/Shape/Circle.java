package Shape;

public class Circle extends Shape{
    private Point center;
    private double radius;

    public Circle(Point x_, double y_) {
        center = x_;
        radius = y_;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double x_) {
        radius = x_;
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point x_) {
        center = x_;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public boolean equals(Object x) {
        Circle e = (Circle) x;
        if (e.center == this.center && e.radius == this.radius) {
            return true;
        }
        return false;
    }


    @Override
    public void draw() {
        System.out.println("This is a circle with r = " + radius + " and center = " + center.toString());
    }
}
