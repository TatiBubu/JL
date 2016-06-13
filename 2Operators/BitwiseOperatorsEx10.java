//Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes, 
//with a zero in the least-significant digit, and the second, also alternating, 
//with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for this). 
//Take these two values and combine them in all possible ways using the bitwise operators, 
//and display the results using Integer.toBinaryString( ).
import static net.mindview.util.Print.*;
public class BitwiseOperatorsEx10 {
	public static void main(String args[]){
int a = 0x2544;
int b =0x3B4A;
print("a = "+Integer.toBinaryString(a));
print("b = "+Integer.toBinaryString(b));
int x=a|b;
print("a OR b "+Integer.toBinaryString(x));
int i=a&b;
print("a AND b "+Integer.toBinaryString(i));
int y=a^b;
print("a XOR b "+Integer.toBinaryString(y));
int z=~a;
print("NOT a: "+Integer.toBinaryString(z));
int j=~b;
print("NOT b "+Integer.toBinaryString(j));
	}
}
/* Output:
 * a = 10010101000100
b = 11101101001010
a OR b 11111101001110
a AND b 10000101000000
a XOR b 1111000001110
NOT a: 11111111111111111101101010111011
NOT b 11111111111111111100010010110101
*/
