package javacoding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitexplictwait
{
	private static FluentWait<WebDriver> wait;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		WebDriverWait data = new WebDriverWait(driver,20);		
		WebElement data2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		data2.sendKeys("qa testing for beginners" +Keys.ENTER);
		
	
	}
	
}