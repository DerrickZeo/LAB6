package aufgabe_c_f;

 class CounterPoint implements Cloneable {
     private static int count = 0;
     private Point point;

     public CounterPoint(int x, int y) {
         point = new Point(x, y);
         count++;
     }

     public CounterPoint(CounterPoint other){
         point = new Point(other.point);
     }

     public CounterPoint clone(){
         try {
             CounterPoint cloned = (CounterPoint) super.clone();
             cloned.point = this.point.clone();
             return cloned;
         }catch (CloneNotSupportedException e){
             throw new AssertionError();
         }
     }

     public boolean equals(Object o){
         if(this == o) return true;
         if(!(o instanceof CounterPoint)) return false;
         CounterPoint that = (CounterPoint) o;
         return point.equals( that.point);
     }

     public int hashCode(){
         return point.hashCode();
     }

     public static int getCount(){
         return count;
     }
}
