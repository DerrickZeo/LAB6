package aufgabe_ab;

class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof ColorPoint)) return false;
        if(!super.equals(o)) return false;
        ColorPoint colorPoint = (ColorPoint) o;
        return color.equals(colorPoint.color);
    }

    public int hashCode(){
        return 31*super.hashCode() + color.hashCode();
    }

}
