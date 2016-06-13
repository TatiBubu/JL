//Exercise 8: (2) Show that hex and octal notations work with long values. 
//Use Long.toBinaryString( ) to display the results.
import static net.mindview.util.Print.*;
public class LireralsHexOctalwithLong {

public static void main(String[] args) {
  long i1 = 0x2f; // Hexadecimal (lowercase)
  print("i1: " + Long.toBinaryString(i1));
  long i2 = 0X2F; // Hexadecimal (uppercase)
  print("i2: " + Long.toBinaryString(i2));
  long i3 = 0177; // Octal (leading zero)
  print("i3: " + Long.toBinaryString(i3));
  char c = 0xffff; // max char hex value
  print("c: " + Long.toBinaryString(c));
  byte b = 0x7f; // max byte hex value
  print("b: " + Long.toBinaryString(b));
  short s = 0x7fff; // max short hex value
  print("s: " + Long.toBinaryString(s));
  
}
} 