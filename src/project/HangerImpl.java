package project;

import java.util.ArrayList;

public class HangerImpl implements Hanger {
	private ArrayList<Jet> fleet;

	public HangerImpl() {
		this.fleet = new ArrayList<Jet>();
	}

	/**
	 * @param fleet
	 */
	public HangerImpl(ArrayList<Jet> fleet) {
		this.fleet = fleet;
	}

	/**
	 * @return the fleet
	 */
	@Override
	public ArrayList<Jet> getFleet() {
		return fleet;
	}

	/**
	 * @param fleet
	 *            the fleet to set
	 */
	public void setFleet(ArrayList<Jet> fleet) {
		this.fleet = fleet;
	}

	/**
	 * @return the fastest jet in the fleet
	 */
	@Override
	public Jet getFastestJet() {
		if (fleet.size() == 0) {
			return null;
		}
		Jet fastest = fleet.get(0);
		for (Jet jet : fleet) {
			if (jet.getSpeed() > fastest.getSpeed()) {
				fastest = jet;
			}
		}
		return fastest;
	}

	/**
	 * @return the longest range jet in the fleet
	 */
	@Override
	public Jet getLongestRangeJet() {
		if (fleet.size() == 0) {
			return null;
		}
		Jet fastest = fleet.get(0);
		for (Jet jet : fleet) {
			if (jet.getRange() > fastest.getRange()) {
				fastest = jet;
			}
		}
		return fastest;
	}

	/**
	 * displays the fleet of jets
	 */
	@Override
	public void displayFleet() {
		for (Jet jet : getFleet()) {
			System.out.println(jet);
		}
	}

	/**
	 * adds a jet to the fleet
	 *
	 * @param jet
	 *            the jet to add
	 */
	@Override
	public void addJet(Jet jet) {
		fleet.add(jet);

	}

}
