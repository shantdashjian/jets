package project;

public class PilotImpl implements Pilot {
	private String name;
	private int age;
	private int experience;
	/**
	 * @param name
	 * @param age
	 * @param experience
	 */
	public PilotImpl(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}


	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}


	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot [");
		builder.append("name= " + getName());
		builder.append(", age= " + getAge());
		builder.append(", experience= " + getExperience());
		builder.append("] ");

		return builder.toString();
	}


}
