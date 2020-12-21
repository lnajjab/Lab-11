
public class Function1 extends Function {


	@Override
	public String answerString(double optVal, double x, double y, double z) {
		return "Minimum cost is $" + optVal + " with height = " + y + "cm and radius = " + x + "cm";
	}

	@Override
	public double fnValue(double x) {
		if (x > 0)
			return 0.8 * Math.PI * Math.pow(x, 2) + (800.0 / x);
		else
			return 0;
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return (2000/ (Math.PI * Math.pow(x, 2)));
	}

	@Override
	public double getZVal(double x) {
		return -1;
	}

	public String toString() {
		return "Minimize the cost of a can that will hold two liters of liquid";
	}
}
