package aufgabe_c_f;

import java.awt.*;

class Point implements Cloneable {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other){
        x = other.x;
        y = other.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Point)) return false;
        Point other = (Point)o;
        return (x == other.x) && (y == other.y);
    }

    public int hashCode(){
        return 31*Integer.hashCode(x) + Integer.hashCode(y);
    }

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
