package aufgabe_ab;

import aufgabe_ab.Color;
import aufgabe_ab.ColorPoint;

class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2,3);

        System.out.println("comparing two points using == gives: "+ (p1 == p2));
        System.out.println("comparing two points using equals method gives: "+ p1.equals(p2));

        Color color = new Color((byte) 0, (byte)255, (byte)0); //green
        Point point = new Point(1,4);
        CounterPoint c1 = new CounterPoint(1,4);
        ColorPoint colorPoint = new ColorPoint(1,4, color);

        System.out.println("#################################################");
        System.out.println("comparing Point with colorPoint gives: "+point.equals(colorPoint));
        System.out.println("comparing colorPoint with Point gives: "+colorPoint.equals(point));
        System.out.println("comparing point with counterPoint gives: "+point.equals(c1));
        System.out.println("comparing counterPoint with point gives: "+c1.equals(point));
        System.out.println("comparing colorPoint with counterPoint gives: "+colorPoint.equals(c1));
        System.out.println("comparing counterPoint with colorPoint gives: "+c1.equals(colorPoint));




    }
}