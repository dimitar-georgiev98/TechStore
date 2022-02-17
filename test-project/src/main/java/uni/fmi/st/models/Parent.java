package uni.fmi.st.models;

import java.util.ArrayList;

/**
 * Model for parent representation
 * 
 * @author Dimitar
 * 
 */

public class Parent {

	private String firstName;
	private String lastName;
	private boolean isWorking;
	private ArrayList<Child> childrens;
	
	/**
	 * Constructor
	 * 
	 * @param firstName not null or empty first name.
	 * @param lastName not null or empty last name.
	 * @param isWorking not null parent working or not.
	 * @param childrens not null or empty children's number.
	 */
	
	public Parent(String firstName, String lastName, boolean isWorking, ArrayList<Child> childrens) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isWorking = isWorking;
		this.childrens = childrens;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return isWorking
	 */
	public boolean isWorking() {
		return isWorking;
	}

	/**
	 * @param isWorking the isWorking to set
	 */
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	/**
	 * @return the children's
	 */
	public ArrayList<Child> getChildrens() {
		return childrens;
	}

	/**
	 * @param childrens the children's to set
	 */
	public void setChildrens(ArrayList<Child> childrens) {
		this.childrens = childrens;
	}
}
