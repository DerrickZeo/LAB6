package aufgabe_ab;

class CounterPoint extends Point {
    private static int count = 0;

    public CounterPoint(int x, int y) {
        super(x, y);
        count++;
    }

    /*public boolean equals(Object o){
       return super.equals(o);
    }*/
    public boolean equals(Object o){
        if(this == o)return true;
        if(!(o instanceof CounterPoint)) return false;
        CounterPoint that = (CounterPoint) o;
        return (getX()== that.getX()) && (getY()== that.getY());
    }
    public int hashCode(){
        return super.hashCode();
    }

    public static int getCount(){
        return count;
    }

}
