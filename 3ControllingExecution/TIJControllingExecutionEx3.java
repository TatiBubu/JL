//Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. 
//It will then run until you interrupt it from the keyboard (typically by pressing Control-C).
import java.util.*;
import static net.mindview.util.Print.*;
public class TIJControllingExecutionEx3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int value1, value2;
		value2 = rand.nextInt(100);
		int i=1;
		while (i ==1) {
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
