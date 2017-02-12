/**
 *
 */
package project;

/**
 * @author shaundashjian
 *
 */
public class Airliner extends JetImpl {

	/**
	 *
	 */
	private int numSeats;
	private String airline;

	public Airliner(int id, String model, double speed, int range, int capacity, double price, Pilot pilot, int numSeats,
			String airline) {
		super(id, model, speed, range, capacity, price, pilot);
		this.numSeats = numSeats;
		this.airline = airline;
	}

	/**
	 * @return the numSeats
	 */
	public int getNumSeats() {
		return numSeats;
	}

	/**
	 * @param numSeats the numSeats to set
	 */
	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	/**
	 * @return the airline
	 */
	public String getAirline() {
		return airline;
	}

	/**
	 * @param airline the airline to set
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	}


}
