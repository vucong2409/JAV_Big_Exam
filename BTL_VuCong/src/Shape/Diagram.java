package Shape;

import java.util.ArrayList;
import java.util.Iterator;

public class Diagram implements Drawable {
    Iterable<Drawable> diagrams;
    public Diagram(Iterable<Drawable> input_) {
        this.diagrams = input_;
    }
    public void add(Drawable hello) {
        ArrayList<Drawable> x = new ArrayList<Drawable>();
        Iterator<Drawable> x2 = this.diagrams.iterator();
        if (x2.hasNext()) {
            x.add(x2.next());
        }
        x.add(hello);
        this.diagrams = x;

    }
    public void remove(Drawable hello) {

    }
    public void draw()  {

    }
}
