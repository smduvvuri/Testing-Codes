package mypackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage
{
	 public LoginPage(WebDriver driver2)
     {
        driver=driver2;
        }
	 private WebDriver driver;
       
	
       //targets
       private By username=By.id("username");
       private By password=By.id("password");
       private By submit1=By.id("submit");

       //Actions
       public void setUsername()
       {
       driver.findElement(username).sendKeys("mercury");
       }


       public void setPassword()
        {
        driver.findElement(password).sendKeys("mercury");
        }

        public void clickOnSignin()
        {
          driver.findElement(submit1).click();
         }

      //Login Action
      public void login()
       {
        this.setUsername();
        this.setPassword();
        this.clickOnSignin();
       }
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	LoginPage page=new LoginPage(driver);
	page.login();
	
}
}


