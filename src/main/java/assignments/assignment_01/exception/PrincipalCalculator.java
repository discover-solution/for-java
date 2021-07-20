package assignments.assignment_01.exception;

public class PrincipalCalculator {

	public static double calculatePrincipal(int interest, int time, int rate) {
		double principal = -1.0;
		try {
			principal = (interest * 100) / (time * rate);
		} catch (ArithmeticException e) {

		}
		return principal;
	}
}