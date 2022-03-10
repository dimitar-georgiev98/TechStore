package uni.fmi.st.service;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
import uni.fmi.st.models.Child;

/**
 * Test class for {@link ParentServiceTest}
 * 
 * @author Dimitar
 *
 */

public class ParentServiceTest {

	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)} 
	 * with valid argument. Everything is true and the parent will be added.
	 */
	@Test
	public void testAddParentWithValidInputs() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", false, true, false, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		String message = parentService.addParent("Драган", "Драганов", true, childrens);
		assertEquals("Успешно добавен родител!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not valid first name. First name has to be minimum 3 symbols.
	 */
	@Test
	public void testAddParentWithNotValidFirstName() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, false, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Др", "Драганов", true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with empty first name. First name can't be empty.
	 */
	@Test
	public void testAddParentWithNotValidFirstName1() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, false, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("", "Драганов", true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with null first name. First name can't be null.
	 */
	@Test
	public void testAddParentWithNotValidFirstName2() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, false, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent(null, "Драганов", true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with invalid first name. First name must be valid.
	 */
	@Test
	public void testAddParentWithNotValidFirstName3() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, false, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("    ", "Драганов", true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not valid last name. Last name has to be minimum 3 symbols.
	 */
	@Test
	public void testAddParentWithNotValidLastName() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Драган", "Др", true, childrens);
		assertEquals("Въведете фамилия с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with empty last name. Last name can't be empty.
	 */
	@Test
	public void testAddParentWithNotValidLastName1() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Драган", "", true, childrens);
		assertEquals("Въведете фамилия с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not valid last name.
	 */
	@Test
	public void testAddParentWithNotValidLastName2() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Драган", "   ", true, childrens);
		assertEquals("Въведете фамилия с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with null last name. Last name can't be null.
	 */
	@Test
	public void testAddParentWithNotValidLastName3() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Драган", null, true, childrens);
		assertEquals("Въведете фамилия с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not valid last name. Last name has to be minimum 3 symbols.
	 */
	@Test
	public void testAddParentWithNotValidFirstAndLastName() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Др", "Др", true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with empty first and last name. First and last name can't be empty.
	 */
	@Test
	public void testAddParentWithEmptyFirstAndLastName() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("", "", true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not valid first and last name. First and last name has to be minimum 3 symbols.
	 */
	@Test
	public void testAddParentWithNotValidFirstAndLastName1() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("  ", "  ", true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not valid first and last name. First and last name has to be minimum 3 symbols.
	 */
	@Test
	public void testAddParentWithNullFirstAndLastName() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, false);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent(null, null, true, childrens);
		assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not added child. You must add child.
	 */
	@Test
	public void testAddParentWithNotAddedChild() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, true);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Драган", "Драганов", true, null);
		assertEquals("Задължително трябва да добавите дете!", message);
	}
	
	/**
	 * test {@link ParentService#addParent(String,String,Boolean,String)}
	 * with not working parent. For working parent you get 1 point for the kid.
	 */
	@Test
	public void testAddParentWithNotWorkingParent() {
		ParentService parentService = new ParentService();
		Child child = new Child("Пешо" , "Петров", true, true, true, true);
		ArrayList<Child> childrens = new ArrayList<Child>();
		childrens.add(child);
		
		String message = parentService.addParent("Драган", "Драганов", false, childrens);
		assertEquals("За работещ родител се добавя 1 точка към класирането!", message);
	}
}
