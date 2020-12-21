
public class Function3 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		return "The minimum distance between f(" + x + ") and (0, 1) is " + optVal;
	}

	@Override
	public double fnValue(double x) {
		return Math.pow(Math.pow(x, 4) - Math.pow(x, 2) + 1, 0.5);
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return -1;
	}

	@Override
	public double getZVal(double x) {
		return -1;
	}

	public String toString() {
		return "Find the minimum distance between the function f(x) = x^2 and the point (0, 1)";
	}
}
