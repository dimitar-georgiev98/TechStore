package uni.fmi.st.service;

import java.util.ArrayList;
import uni.fmi.st.models.Child;
import uni.fmi.st.models.Parent;

/**
 * Provides functionality to register new parent and child in the system
 * 
 * @author Dimitar
 *
 */

public class ParentService {
	
	private ArrayList<Parent> parents;

	/**
	 * Constructor
	 * 
	 * @param parents list of parents
	 */
	
	public ParentService(ArrayList<Parent> parents) {
		super();
		this.parents = parents;
	}
	
	public ParentService() {
		this.parents = new ArrayList<Parent>();
	}
	
	/**
	 * @return the parents
	 */
	public ArrayList<Parent> getParents(){
		return this.parents; 
	}
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param isWorking
	 * @param childrens
	 * @return
	 */
	public String addParent(String firstName, String lastName, boolean isWorking, ArrayList<Child> childrens) {
				
		if(firstName == null || firstName.length() < 3 || firstName.isBlank())
	    {
			return "Въведете име с поне 3 символа!";
		}
		
		if(lastName == null || lastName.length() < 3 || lastName.isBlank())
		{
			return "Въведете фамилия с поне 3 символа!";
		}
		
		if(childrens == null) {
			return "Задължително трябва да добавите дете!";
		}
		
		if(isWorking == false) {
			return "За работещ родител се добавя 1 точка към класирането!";
		}
		
		parents.add(new Parent(firstName, lastName, isWorking, childrens));
		return "Успешно добавен родител!";
	}
}
