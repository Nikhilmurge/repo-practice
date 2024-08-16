package example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
 public static void main(String[] args) throws Exception  {
	 String path="C:\\Users\\admin\\eclipse-workspace_javapro\\client\\screenshots";
   WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chorme.driver", path);
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com/");
    Thread.sleep(3000);
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File(path+"screen1.jpg"));
    
    driver.close();
 
 
 
 }
}
