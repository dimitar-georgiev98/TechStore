package uni.fmi.st.models;

/**
 * Model for child representation
 * 
 * @author Dimitar
 * 
 */

public class Child {

	private String firstName;
	private String lastName;
	private boolean disability;
	private boolean hasWorkingParent;
	private boolean sibling;
	private boolean twins;
	
	/**
	 * Constructor
	 * 
	 * @param firstName not null or empty first name.
	 * @param lastName not null or empty last name.
	 * @param disability not null child disabled or not.
	 * @param hasWorkingParent not null parent working or not.
	 * @param sibling not null is the child have brother/sister studying here.
	 * @param twins not null are the children twins.
	 */
	
	public Child(String firstName, String lastName, boolean disability, boolean hasWorkingParent, boolean sibling,
			boolean twins) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.disability = disability;
		this.hasWorkingParent = hasWorkingParent;
		this.sibling = sibling;
		this.twins = twins;
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
	 * @return the disability
	 */
	public boolean isDisability() {
		return disability;
	}

	/**
	 * @param disability the disability to set
	 */
	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	/**
	 * @return the hasWorkingParent
	 */
	public boolean itHasWorkingParent() {
		return hasWorkingParent;
	}

	/**
	 * @param hasWorkingParent the hasWorkingParent to set
	 */
	public void setHasWorkingParent(boolean hasWorkingParent) {
		this.hasWorkingParent = hasWorkingParent;
	}

	/**
	 * @return the sibling
	 */
	public boolean isSibling() {
		return sibling;
	}

	/**
	 * @param sibling the sibling to set
	 */
	public void setSibling(boolean sibling) {
		this.sibling = sibling;
	}

	/**
	 * @return the twins
	 */
	public boolean isTwins() {
		return twins;
	}

	/**
	 * @param twins the twins to set
	 */
	public void setTwins(boolean twins) {
		this.twins = twins;
	}	
}
