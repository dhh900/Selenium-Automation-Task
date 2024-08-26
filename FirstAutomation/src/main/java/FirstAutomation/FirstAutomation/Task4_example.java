package FirstAutomation.FirstAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Task4_example {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.example.com");
		driver.findElement(By.linkText("More information...")).click();

		driver.findElement(By.tagName("h1"));
		System.out.println("The main heading text: " + driver.findElement(By.tagName("h1")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Example Domains");

		driver.findElement(By.tagName("p"));
		System.out.println("The first paragraph text: " + driver.findElement(By.tagName("p")).getText());
		Assert.assertTrue(driver.findElement(By.tagName("p")).getText().contains("As described"));
		
		driver.findElement(By.linkText("Domain Names"));
		System.out.println("The footer text: " + driver.findElement(By.linkText("Domain Names")).getText());
		Assert.assertEquals(driver.findElement(By.linkText("Domain Names")).getText(), "Domain Names");

//      driver.findElement(By.id(".............................."));

		driver.close();
	}
}
