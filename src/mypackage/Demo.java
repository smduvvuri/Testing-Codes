package mypackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		Demo demo=new Demo();
		demo.callWeb();
	}
	public void callWeb()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
	}

}
