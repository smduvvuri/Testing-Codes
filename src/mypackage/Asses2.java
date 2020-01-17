package mypackage;
import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asses2 {
	public static void takepicture(WebDriver driver, String filename) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//screenshots//"+filename+".png"));
	}
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		takepicture(driver,"img1");
		Actions action=new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		/*takepicture(driver,"img2");
		Thread.sleep(3000);
		WebElement watch=driver.findElement(By.linkText("Sonata Super Fibre Analog Black Small Dial Men's Watch -NL7930PP01"));		action.moveToElement(watch).build().perform();
		Thread.sleep(3000);
		watch.click();
		takepicture(driver,"img4"); */
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("img[data-image-index=\"3\"]")).click();
		Thread.sleep(3000);
		takepicture(driver, "img2");
		Thread.sleep(3000);
		driver.close();
		

		
	}

}
