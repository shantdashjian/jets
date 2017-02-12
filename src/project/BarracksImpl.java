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

}
