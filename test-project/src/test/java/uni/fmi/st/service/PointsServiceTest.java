package uni.fmi.st.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import uni.fmi.st.models.Child;

/**
 * Test class for {@link PointsServiceTest}
 * 
 * @author Dimitar
 *
 */
public class PointsServiceTest {
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with valid arguments. Child will be added.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithValidInputs() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, false, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", "Петров");
		 assertEquals("Пешо Петров приет за класиране с 4 точки!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with invalid first name. First name  has to be minimum 3 symbols.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidFirstName() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пе", "Петров");
		 assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with invalid last name. Last name  has to be minimum 3 symbols.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidLastName1() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", "Пе");
		 assertEquals("Въведете фамилия с поне 3 символа!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with invalid first and last name. First and last name has to be minimum 3 symbols not empty.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidFirstAndLastName2() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, false, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName(" ", " ");
		 assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with null last name. Last name can't be null has to be minimum 3 symbols.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithNullLastName() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", null);
		 assertEquals("Въведете фамилия с поне 3 символа!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with null child. You must add one child cannot be null.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithoutAddedChild() {
		 ParentService parentService = new ParentService();
		 
		 //Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(null);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", "Петров");
		 assertEquals("Задължително трябва да добавите дете!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with working parent. For working parent you get + 1 point for the kid.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithWorkingParent() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров" ,false, true, false, false);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", "Петров");
		 assertEquals("Пешо Петров приет за класиране с 1 точки!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with invalid first and last name. First and last name can't be null has to be minimum 3 symbols.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidFirstAndLastName() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пе", "Пе");
		 assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with null first and last name. Last name cannot be null has to be minimum 3 symbols.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithNullFirstAndLastName() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName(null, null);
		 assertEquals("Въведете име с поне 3 символа!", message);
	}

	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with empty last name. Last name has to be minimum 3 symbols not empty.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithEmptyLastName() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", "");
		 assertEquals("Въведете фамилия с поне 3 символа!", message);
	}

	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with invalid first name.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidFirstName1() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("      ", "Петров");
		 assertEquals("Въведете име с поне 3 символа!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with invalid last name.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidLastName2() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", "      ");
		 assertEquals("Въведете фамилия с поне 3 символа!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with almost valid first name.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidFirstName2() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, true, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пеш", "Петров");
		 assertEquals("Пеш Петров приет за класиране с 5 точки!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with almost valid first and last name.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidFirstAndLastName1() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, false, false, true);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пеш", "Пет");
		 assertEquals("Пеш Пет приет за класиране с 3 точки!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with almost valid last name. Last name has to be minimum 3 symbols.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithInvalidLastName() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, false, false);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("Пешо", "Пет");
		 assertEquals("Пешо Пет приет за класиране с 3 точки!", message);
	}
	
	/**
	 * test {@link PointsService#rankingByFirstAndLastName(String,String)}
	 * with empty first and invalid last name.
	 */
	@Test
	public void testPointsByFirstAndLastNameWithEmptyFirstAndInvalidLastName() {
		 ParentService parentService = new ParentService();
		 
		 Child child = new Child("Пешо", "Петров", true, true, false, false);
		 ArrayList<Child> childrens = new ArrayList<>();
		 childrens.add(child);
		 parentService.addParent("Драган", "Драганов", true, childrens);
		 PointsService rankingService = new PointsService(parentService.getParents());
		 String message = rankingService.pointsByFirstAndLastName("", "     ");
		 assertEquals("Въведете име с поне 3 символа!", message);
	}
}
