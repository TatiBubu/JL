class StaticTest{
	static int i =4;
}
class Incrementable {
	static void increment(){
		StaticTest.i++;
	}
}
public class TIJ_EIN_Ex7 {
	public static void main(String[] args) {
System.out.println("StaticTest.i = " + StaticTest.i);
StaticTest st1 = new StaticTest();
StaticTest st2 = new StaticTest();
System.out.println("st1.i = " + st1.i);
System.out.println("st2.i = " + st2.i);
Incrementable sf = new Incrementable();
sf.increment();
System.out.println("After sf.increment called, st1.i = " + st1.i);
System.out.println("After sf.increment called, st2.i = " + st2.i);
Incrementable.increment();
System.out.println("After Incrementable.increment called, st1.i = " + st1.i);
System.out.println("After Incrementable.increment called, st2.i = " + st2.i);
	}

}
