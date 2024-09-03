package aufgabe_c_f;

 class Color implements Cloneable {
     private byte  red, green, blue;

     public Color(byte red, byte green, byte blue) {
         this.red = red;
         this.green = green;
         this.blue = blue;
     }

     public Color(Color other){
         red = other.red;
         green = other.green;
         blue = other.blue;
     }

     public Color clone(){
         try{
             return (Color) super.clone();
         }catch (CloneNotSupportedException e){
             throw new AssertionError();
         }
     }

     public byte getRed() {
         return red;
     }

     public void setRed(byte red) {
         this.red = red;
     }

     public byte getGreen() {
         return green;
     }

     public void setGreen(byte green) {
         this.green = green;
     }

     public byte getBlue() {
         return blue;
     }

     public void setBlue(byte blue) {
         this.blue = blue;
     }

     public boolean equals(Object o){
         if(this == o) return true;
         if(!(o instanceof Color)) return false;
         Color color = (Color) o;
         return (red == color.red)&&(green== color.green)&&(blue==color.blue);
     }

     public int hashCode(){
         return 31*31* Byte.hashCode(red) + 31* Byte.hashCode(green) + Byte.hashCode(blue);
     }
}
