package project;

import java.util.ArrayList;

public interface Hanger {

	void displayFleet();

	Jet getFastestJet();

	Jet getLongestRangeJet();

	void addJet(Jet jet);

	ArrayList<Jet> getFleet();
}
