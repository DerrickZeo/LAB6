package aufgabe_c_f;


class ColorPoint implements Cloneable{
    private Color color;
    private Point point;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = color;
    }

    public ColorPoint(ColorPoint other){
        point = new Point(other.point);
        color = new Color(other.color);
    }

    public ColorPoint clone(){
        try {
            ColorPoint cloned = (ColorPoint) super.clone();
            cloned.color = this.color.clone();
            cloned.point = this.point.clone();
            return cloned;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof ColorPoint)) return false;
        ColorPoint colorPoint = (ColorPoint) o;
        return point.equals(colorPoint.point) && color.equals(colorPoint.color);
    }

    public int hashCode(){
        return 31*point.hashCode() + color.hashCode();
    }
}
