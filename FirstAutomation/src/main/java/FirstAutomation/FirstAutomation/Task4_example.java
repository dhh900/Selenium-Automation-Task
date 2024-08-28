package FirstAutomation.FirstAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Task4_example {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.example.com");
		driver.findElement(By.linkText("More information...")).click();

		driver.findElement(By.tagName("h1"));
		System.out.println("The main heading text: " + driver.findElement(By.tagName("h1")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Example Domains");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains((text()),'As described in')]")));
		System.out.println("The first paragraph text: "
				+ driver.findElement(By.xpath("//p[contains(text(),'As described in')]")).getText());
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains((text()),'As described in')]")).getText()
				.contains("As described"));

		driver.findElement(By.linkText("Domain Names"));
		System.out.println("The footer text: " + driver.findElement(By.linkText("Domain Names")).getText());
		Assert.assertEquals(driver.findElement(By.linkText("Domain Names")).getText(), "Domain Names");

		driver.close();
	}
}
