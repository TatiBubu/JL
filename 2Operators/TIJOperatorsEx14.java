//Write a method that takes two String arguments and uses all the boolean comparisons to compare the two Strings 
//and print the results. For the == and !=, also perform the equals( ) test. In main( ), call your method with 
//some different String objects.
public class TIJOperatorsEx14 {
		static void stringTest(String x, String y) {
		// Арифметичні оператори:
		x = (String) (x + y);
		// ! x=(String)(x-y);
		// ! x=(String)(x*y);
		// ! x=(String)(x/y);
		// ! x=(String)(x%y);
		// ! x++;
		// ! x--;
		// x=(String)+y;
		// !x=(String)-y;
		// Реляційні і логічні:
		
		// ! f(x>y);
		// ! f(x>=y);
		// ! f(x<y);
		// ! f(x<=y);
		System.out.println("x == y is "+x == y);
		System.out.println("x != y is "+x != y);
		
		// ! f(!y);
		// x=x&&y;
		// x = x || y;
		// Побітові оператори:
		// ! x = ~y;
		// ! x = x&y;
		// ! x = x|y;
		// ! x = x^y;
		// ! x = x << 1;
		// ! x = x >> 1;
		// ! x = x >>>1;
		// Суміжне присвоєння:
		x += y;
		// ! x-=y;
		// ! x*=y;
		// ! x/=y;
		// ! x%=y;
		// ! x>>=1;
		// ! x<<=1;
		// ! x>>>=1;
		// ! x&=y;
		// ! x^=y;
		// ! x|=y;
		// Кастинг:
		// ! boolean bl = (boolean)x;
		// ! char c = (char)x;
		// ! byte b = (byte)x;
		// ! short s = (short)x;
		// ! int i = (int)x;
		// ! long l = (long)x;
		//! float f = (float)x;
		//! double d = (double)x;
	}
	public static void main (String []args){
	String x = "first";
	String y = "second";
	System.out.println ("x.equals(y) = "+ x.equals(y));
	stringTest("first", "first");
	}
}
