package project;

public interface InputHelper {

	/**
	 * helper method to ensure input is int
	 *
	 * @param prompt
	 * @return int
	 */
	static int getInt(String prompt) {
		System.out.print(prompt);
		while (!JetsAdminCenter.kb.hasNextInt()) {
			System.out.print(prompt);
			JetsAdminCenter.kb.next();
		}
		return JetsAdminCenter.kb.nextInt();
	}

	/**
	 * helper method to ensure input is double
	 *
	 * @param prompt
	 * @return double
	 */
	static double getDouble(String prompt) {
		System.out.print(prompt);
		while (!JetsAdminCenter.kb.hasNextDouble()) {
			System.out.print(prompt);
			JetsAdminCenter.kb.next();
		}
		return JetsAdminCenter.kb.nextDouble();
	}

	/**
	 * helper method to ensure input is String
	 *
	 * @param prompt
	 * @return String
	 */
	static String getString(String prompt) {
		JetsAdminCenter.kb.nextLine();
		System.out.print(prompt);
		while (!JetsAdminCenter.kb.hasNextLine()) {
			System.out.print(prompt);
			JetsAdminCenter.kb.nextLine();
		}
		return JetsAdminCenter.kb.nextLine();
	}

}