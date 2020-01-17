package mypackage;
import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;

public class Hover {
	public static void takepicture(WebDriver driver, String filename) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//screenshots1//"+filename+".png"));
	}
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		takepicture(driver,"img1");
		Actions action=new Actions(driver);
		WebElement electronics=driver.findElement(By.linkText("Best Sellers"));
		action.moveToElement(electronics).build().perform();
		takepicture(driver,"img2");
		Thread.sleep(3000);
		electronics.click();
		//WebElement samsung=driver.findElement(By.linkText("Samsung"));
		//action.moveToElement(samsung).build().perform();
		takepicture(driver,"img3");
		//Thread.sleep(3000);
		//samsung.click();
		//takepicture(driver,"img4");
		Thread.sleep(3000);
		driver.close();
		
	}

}
