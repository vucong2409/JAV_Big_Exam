package Shape;

public class Rectangle extends Shape {
    protected Point leftTop;
    protected double height;
    protected double width;
    public Rectangle(Point x_, double y_, double z_) {
        leftTop = x_;
        height = y_;
        width = z_;
    }

    public Point getLeftTop() {
        return leftTop;
    }
    public void  setLeftTop(Point x_) {
        leftTop = x_;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double y_) {
        height = y_;;
    }
    public  double getWidth() {
        return width;
    }
    public void setWidth(double z_) {
        width = z_;
    }
    public void draw() {
        System.out.println("This is a rect with height = " + height + ", width = " + width + " and left top in " + leftTop.toString());
    }
    public double getPerimeter() {
        return (height + width) * 2;
    }
    public double getArea() {
        return height*width;
    }

    @Override
    public boolean equals(Object x) {
        Rectangle lul = (Rectangle) x;
        if (this.height == lul.height && this.width == lul.width) {
            return true;
        } else return false;
    }
}
