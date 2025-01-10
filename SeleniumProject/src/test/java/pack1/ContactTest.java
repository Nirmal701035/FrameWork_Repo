package pack1;

import org.testng.annotations.Test;
public class ContactTest {
	@Test
	public void createContactTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		System.out.println("Create Contact Test");
		
		System.out.println(URL);
		System.out.println(BROWSER);
	}
	@Test
	public void modifyContactTest() {
		System.out.println("Modify Contact Test");
	}
	

}
