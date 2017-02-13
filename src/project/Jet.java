package project;

public interface Jet {
	/**
	 * returns speed in Mach
	 *
	 * @return speed in Mach
	 */
	double getSpeedInMach();

	/**
	 * returns speed in Mach
	 *
	 * @param mph
	 * @return speed in Mach
	 */
	public static double convertToMach(double mph) {
		double result = Math.round(mph * 0.00131 * 100.0) / 100.0;
		return result;
	}

	double getSpeed();

	int getRange();

	int getId();

	void setSpeed(double d);
}
