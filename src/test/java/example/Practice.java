package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("shoes for women");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        driver.findElement(By.xpath("(//*[@class=\"s-image\"])[position()=1]")).click();
        driver.findElement(By.xpath("(//*[@class=\"a-price-whole\"])[1]")).click();
        driver.close();
	}
}
