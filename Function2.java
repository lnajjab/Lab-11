
public class Function2 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		return "The minimum time for the dog to get the ball if it runs " + x + "m is " + optVal + " seconds";
	}

	@Override
	public double fnValue(double x) {
		if (x <= 4 && x >= 0)
			return (x / 3) + 2 * Math.pow(Math.pow(x, 2) - (8 * x) + 25, 0.5);
		else
			return 0;
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
		return "Minimize the distance a dog will run and swim to get a ball from the ocean.";
	}

}
