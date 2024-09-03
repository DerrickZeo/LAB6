package aufgabe_c_f;

class Main {
    public static void main(String[] args) {

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


        Point originalPoint =new Point(2,3);
        Point clonedPoint = originalPoint.clone();

        Color originalColor = new Color((byte)255, (byte)0, (byte)0);
        Color clonedColor = originalColor.clone();

        ColorPoint originalColorPoint = new ColorPoint(4, 5, originalColor);
        ColorPoint clonedColorPoint = originalColorPoint.clone();

        CounterPoint originalCounterPoint = new CounterPoint(6,7);
        CounterPoint clonedCounterPoint = originalCounterPoint.clone();

        System.out.println("######################### COMPARE OBJECTS AND THEIR CLONES AFTER CLONING ###################");
        System.out.println("point gives: "+originalPoint.equals(clonedPoint));
        System.out.println("color gives: "+originalColor.equals(clonedColor));
        System.out.println("ColorPoint gives: "+ originalColorPoint.equals(clonedColorPoint));
        System.out.println("CounterPoint gives: "+originalCounterPoint.equals(clonedCounterPoint));

        System.out.println("########################### COMPARE HASHCODES AFTER CLONING ####################");
        System.out.println("point gives: "+ (originalPoint.hashCode()==clonedPoint.hashCode()));
        System.out.println("color gives: "+ (originalColor.hashCode() == clonedColor.hashCode()));
        System.out.println("ColorPoint gives: "+ (originalColorPoint.hashCode() == clonedColorPoint.hashCode()));
        System.out.println("CounterPoint gives: "+ (originalCounterPoint.hashCode() == clonedCounterPoint.hashCode()));

    }
}
