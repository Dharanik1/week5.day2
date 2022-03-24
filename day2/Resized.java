package Week5.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	    driver.switchTo().frame(0);
	    WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	     
	    Actions build = new Actions(driver);
	    build.clickAndHold(drag).moveByOffset(500, 300).release(drag).perform();
	     
	}

}
