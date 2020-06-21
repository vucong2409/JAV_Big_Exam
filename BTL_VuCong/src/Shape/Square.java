package Shape;

public class Square extends Rectangle {
    public Square(Point x_, double y_) {
        super(x_,y_,y_);
    }
    public double getSide() {
        return getWidth();
    }
    @Override
    public void draw() {
        System.out.println("This is a square with side = " + getSide() + " and left top in " + this.getLeftTop().toString());
    }
}
