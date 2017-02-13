package project;

import java.util.ArrayList;

public class HangerImpl implements Hanger {
	private ArrayList<JetImpl> fleet;

	public HangerImpl() {
		super();
		this.fleet = new ArrayList<JetImpl>();
	}

	/**
	 * @param fleet
	 */
	public HangerImpl(ArrayList<JetImpl> fleet) {
		super();
		this.fleet = fleet;
	}

	/**
	 * @return the fleet
	 */
	public ArrayList<JetImpl> getFleet() {
		return fleet;
	}

	/**
	 * @param fleet
	 *            the fleet to set
	 */
	public void setFleet(ArrayList<JetImpl> fleet) {
		this.fleet = fleet;
	}

	@Override
	public void addJet(JetImpl jet) {
		fleet.add(jet);

	}

	/**
	 * @return the fastest jet in the fleet
	 */
	public JetImpl getFastestJet() {
		if (fleet.size() == 0) {
			return null;
		}
		JetImpl fastest = fleet.get(0);
		for (JetImpl jet : fleet) {
			if (jet.getSpeed() > fastest.getSpeed()) {
				fastest = jet;
			}
		}
		return fastest;
	}

	/**
	 * @return the longest range jet in the fleet
	 */
	public JetImpl getLongestRangeJet() {
		if (fleet.size() == 0) {
			return null;
		}
		JetImpl fastest = fleet.get(0);
		for (JetImpl jet : fleet) {
			if (jet.getRange() > fastest.getRange()) {
				fastest = jet;
			}
		}
		return fastest;
	}

	/**
	 * displays the fleet of jets
	 */
	public void displayFleet() {
		for (JetImpl jetImpl : getFleet()) {
			System.out.println(jetImpl);
		}
	}

}
