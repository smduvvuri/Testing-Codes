package webdriverexamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot1 {
public static void takepicture(WebDriver driver,String filename) throws Exception
{
TakesScreenshot ts=(TakesScreenshot)driver;
File source=	ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(source, new File(".//sceenshots//"+filename+".png"));
}
}
