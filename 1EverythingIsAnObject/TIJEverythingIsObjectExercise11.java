class AllTheColorsOfTheRainbow {  
 int anIntegerRepresentingColors;   
 void changeTheHueOfTheColor(int newHue) { 
 anIntegerRepresentingColors = newHue;
     }   
 } 
 public class TIJEverythingIsObjectExercise11{
 public static void main (String args[]){
 AllTheColorsOfTheRainbow t = new AllTheColorsOfTheRainbow();
 t.anIntegerRepresentingColors = 1;
 System.out.println("anIntegerRepresentingColors is "+ t.anIntegerRepresentingColors);
t.changeTheHueOfTheColor(7);
System.out.println("New hue is "+ t.anIntegerRepresentingColors);
 }
 }
