package uni.fmi.st.service;

import java.util.ArrayList;

import uni.fmi.st.models.Child;
import uni.fmi.st.models.Parent;

/**
 * Provides functionality to calculate the children's points
 * 
 * @author Dimitar
 *
 */

public class PointsService {

	private ArrayList<Parent> parents;

	/**
	 * Constructor
	 * 
	 * @param parents list of parents
	 */

	public PointsService(ArrayList<Parent> parents) {
		super();
		this.parents = parents;
	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param isWorking
	 * @param isSibling
	 * @param isDisability
	 * @param isTwins
	 * @return
	 */
	public String pointsByFirstAndLastName(String firstName, String lastName) {
		int points = 0;

		for (Parent parent : parents) {
			for (Child child : parent.getChildrens()) {

				if (firstName == null || firstName.length() < 3 || firstName.isBlank()) {
					return "Въведете име с поне 3 символа!";
				}

				if (lastName == null || lastName.length() < 3 || lastName.isBlank()) {
					return "Въведете фамилия с поне 3 символа!";
				}

				if (child == null) {
					return "Задължително трябва да добавите дете!";
				}

				if (child.isSibling()) {
					points++;
				}

				if (child.isDisability()) {
					points += 2;
				}

				if (child.isTwins()) {
					points++;
				}
				
				if (child.itHasWorkingParent()) {
					points++;
				}
			}
		}
		return String.format("%s %s приет за класиране с %d точки!", firstName, lastName, points);
	}
}
