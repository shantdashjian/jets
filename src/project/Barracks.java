package project;

import java.util.ArrayList;

public interface Barracks {
	void hirePilot(Pilot pilot);

	ArrayList<Pilot> getPilots();

	void displayPilots();
}
