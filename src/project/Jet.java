package project;

public interface Jet {
	double getSpeedInMach();
	public static double convertToMach(double mph){
		double result = Math.round(mph * 0.00131 * 100.0) / 100.0;
		System.out.println(result);
		return result;
	}
}
