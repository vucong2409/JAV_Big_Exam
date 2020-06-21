package Shape;

public class Point {
    private double x;
    private double y;
    public Point(double x_, double y_) {
        this.x = x_;
        this.y = y_;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x_) {
        this.x = x_;
    }
    public void setY(double y_) {
        this.y = y_;
    }
    @Override
    public String toString() {
        String s = new String();
        s = "(" + this.x + "," + this.y + ")";
        return s;
    }
    public boolean equals(Point obj) {
        if (obj.getX() == this.x && obj.getY() == this.y) {
            return true;
        } else return false;
    }
}
