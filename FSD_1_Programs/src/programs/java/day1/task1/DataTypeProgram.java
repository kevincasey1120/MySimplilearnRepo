package programs.java.day1.task1;

/////////////////////////////////////////////////////////////////////////////

//CAL-TECH FULL STACK DEVELOPMENT COURSE
//
//DEVELOPER/STUDENT:   Kevin Casey
//ORIGINATION DATE:  27 MARCH 2021
//LAST UPDATED  ON:  27 MARCH 2021
/////////////////////////////////////////////////////////////////////////////

public class DataTypeProgram {

//------------------------------
//>  MY GLOBAL VARIABLES
//------------------------------
	private static int age = 34;
	private static long population = 2345644333L;
	private static float pi = 3.1456755f;
	private static char gwender = 'M';
	private static double distance = 33433456.3456643356444444444433333;

	public static void main(String[] args) {

//------------------------------
//>  WELCOME OUTPUT
//------------------------------
		System.out.println("------------------------------------------");
		System.out.println("Yay! - This is my First DAY-1 Java Program");
		System.out.println("------------------------------------------");

//------------------------------
//>  MY LOCAL VARIABLES
//------------------------------
		int a = 10;
		int b = 20;
		int c = a + b;

//------------------------------
//>  VARIABLE OUTPUT
//------------------------------
		System.out.println("\nGLOBAL VARIABLE 'age' of TYPE:(int) is:" + age);
		System.out.println(" LOCAL VARIABLE   'c' of TYPE:(int) is:" + c);
	}

}
