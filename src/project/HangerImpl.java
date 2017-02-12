package project;

import java.util.ArrayList;

public class HangerImpl implements Hanger {
	private ArrayList<Jet> fleet;

	public HangerImpl() {
		super();
		this.fleet = new ArrayList<Jet>();
	}
	/**
	 * @param fleet
	 */
	public HangerImpl(ArrayList<Jet> fleet) {
		super();
		this.fleet = fleet;
	}

	/**
	 * @return the fleet
	 */
	public ArrayList<Jet> getFleet() {
		return fleet;
	}
	/**
	 * @param fleet the fleet to set
	 */
	public void setFleet(ArrayList<Jet> fleet) {
		this.fleet = fleet;
	}
	@Override
	public void addJet(Jet jet) {
		// TODO Auto-generated method stub

	}

}
