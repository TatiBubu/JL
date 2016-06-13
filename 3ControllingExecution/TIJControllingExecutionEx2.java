
//Write a program that generates 25 random int values. For each value, use an if-else statement 
//to classify it as greater than, less than, or equal to a second randomly generated value.

import java.util.*;
import static net.mindview.util.Print.*;

public class TIJControllingExecutionEx2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int value1, value2;
		value2 = rand.nextInt(100);
		for (int i = 1; i < 25; i++) {
			value1 = rand.nextInt(100);
			if (value1 > value2)
				print(value1 + " > " + value2);
			else if (value2 > value1)
				print(value2 + " > " + value1);
			else
				print(value1 + " = " + value2);

		}
	}
}
/*Output: 56 > 24
56 > 52
56 > 39
56 > 23
97 > 56
56 > 50
56 > 9
56 > 13
56 > 36
56 > 27
56 > 34
92 > 56
56 > 34
87 > 56
75 > 56
58 > 56
56 > 34
56 > 9
56 > 48
56 > 14
79 > 56
56 > 21
98 > 56
78 > 56

*/