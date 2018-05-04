package m2idolibarr.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class Testdolibarr {
	
	// On instancie le driver
	ChromeDriver driver = new ChromeDriver();
	
	
	@Before
	public void setup() {
		
		
				driver.get("http://demo.testlogiciel.pro/dolibarr");
				driver.findElement(By.id("username")).sendKeys("jsmith");
				driver.findElement(By.id("password")).sendKeys("hp");
				driver.findElement(By.cssSelector("input.button")).click();
				//driver.findElementByClassName("button").click();
				//driver.findElement(By.cssSelector("img.login")).click();
	}
	
	@After
	public void tearDown() {

		
		driver.findElement(By.xpath("//img[@alt='Déconnexion']")).click();
		driver.close();
	}
	
	
	@Test
	public void testConnexion() {
	
						
		Assert.assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
			
			}
	
	@Test
	public void testTonton() {
		
		//ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.findElement(By.cssSelector("div.mainmenu.companies")).click();
		driver.findElement(By.linkText("Nouveau tiers")).click();
		driver.findElement(By.name("nom")).sendKeys("test");
		driver.findElement(By.name("firstname")).sendKeys("firsttest");
		new Select(driver.findElement(By.name("civilite_id"))).selectByVisibleText("Docteur");;
		
		
		// non possible car existe ailleurs
		//driver.findElement(By.cssSelector("input.button")).click();
		
		driver.findElement(By.xpath("//input[@value='Créer tiers']")).click();
		//driver.findelement(formsoc
		
		
	}

}
