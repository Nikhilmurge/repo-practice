package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        boolean res=driver.findElement(By.xpath("//span[contains(text(),'results for')]")).isDisplayed();
        
        if(res) {
        	System.out.println("i m get it");
        
        }else {
        	System.out.println("i m not get it ");
        }
     
	}

}
