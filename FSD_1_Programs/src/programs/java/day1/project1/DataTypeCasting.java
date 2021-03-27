package programs.java.day1.project1;

/////////////////////////////////////////////////////////////////////////////
//CAL-TECH FULL STACK DEVELOPMENT COURSE
//
//DEVELOPER/STUDENT:   Kevin Casey
//ORIGINATION DATE:  27 MARCH 2021
//LAST UPDATED  ON:  27 MARCH 2021
/////////////////////////////////////////////////////////////////////////////

public class DataTypeCasting {

	public static void main(String[] args) {

//---------------------------------------------------
		int intA = 50;
		long longA = 50000;
		System.out.println("int value of " + intA + "    long value of " + longA);
		long longOfInt = intA; // IMPLICIT
		int intOfLong = (int) longA; // EXPLICIT
		System.out.println("IMPLICIT CAST:  (a long from int) " + longOfInt);
		System.out.println("EXPLICIT CAST:  (a int from long) " + intOfLong);

//---------------------------------------------------
		double doubleA = 500.00;
		float floatA = 50000;
		System.out.println("double value of " + doubleA + "    float value of " + floatA);
		double doubleOfFloat = (float) floatA; // IMPLICIT
		float floatOfDoubble = (float) doubleA; // EXPLICIT
		System.out.println("IMPLICIT CAST:  (a double from float) " + doubleOfFloat);
		System.out.println("EXPLICIT CAST:  (a float from double) " + floatOfDoubble);
	}
}
