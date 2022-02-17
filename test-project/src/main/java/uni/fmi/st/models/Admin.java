package uni.fmi.st.models;

/**
 * Model for administrator representation
 * 
 * @author Dimitar
 * 
 */

public class Admin {
	
	private String firstName;
	private String lastName;
	
	/**
	 * Constructor
	 * 
	 * @param firstName not null or empty first name.
	 * @param lastName not null or empty last name.
	 */
	
	public Admin(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
}
