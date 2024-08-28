package FirstAutomation.FirstAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Task4_NewyorkTimes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nytimes.com/international/");

		driver.findElement(By.tagName("h1"));
		System.out.println("The main heading text: " + driver.findElement(By.tagName("h1")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "New York Times - Top Stories");

		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]/div[1]/div[1]/section[1]/div[1]/p[1]"));
		System.out.println("The first paragraph text: " + driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]/div[1]/div[1]/section[1]/div[1]/p[1]"))
				.getText());
		Assert.assertTrue(driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/a[1]/div[1]/div[1]/section[1]/div[1]/p[1]"))
				.getText().contains("The arrest of Telegram’s founder"));

		driver.findElement(By.linkText("Privacy Policy"));
		System.out.println("The footer text: " + driver.findElement(By.linkText("Privacy Policy")).getText());
		Assert.assertEquals(driver.findElement(By.linkText("Privacy Policy")).getText(), "Privacy Policy");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-tkwi90")));
		searchField.sendKeys("Egypt" + Keys.ENTER);
		System.out.println("Element located: " + (searchField != null));

		driver.close();
	}
}
