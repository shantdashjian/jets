package project;

import java.util.ArrayList;

public class BarracksImpl implements Barracks {
	private ArrayList<Pilot> pilots;

	public BarracksImpl() {
		this.pilots = new ArrayList<Pilot>();
	}

	/**
	 * @param pilots
	 */
	public BarracksImpl(ArrayList<Pilot> pilots) {
		this.pilots = pilots;
	}

	/**
	 * @return the pilots
	 */
	@Override
	public ArrayList<Pilot> getPilots() {
		return pilots;
	}

	/**
	 * @param pilots
	 *            the pilots to set
	 */
	public void setPilots(ArrayList<Pilot> pilots) {
		this.pilots = pilots;
	}

	@Override
	public void hirePilot(Pilot pilot) {
		pilots.add(pilot);
	}

	@Override
	public void displayPilots() {
		for (Pilot pilot : getPilots()) {
			System.out.println(pilot);
		}
	}

}
