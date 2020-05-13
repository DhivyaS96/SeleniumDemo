package demo.seleniumprgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\42923\\eclipse-workspace\\SeleniumDemoProj\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		//System.out.println(driver.getWindowHandles().size());
		//driver.switchTo().alert().accept();
		//alert.accept();
		System.out.println("Done");
		WebElement orgin= driver.findElement(By.xpath("//input[@placeholder=\"From*\"]"));
		orgin.sendKeys("Chennai");
		System.out.println("Done fully till orgin");
		Select entry= new Select(driver.findElement(By.xpath("//*[@id=\"origin\"]/span/div/ul/li[4]")));
		entry.selectByVisibleText("CHENNAI PARK - MPK");
		//driver.findElement(By.xpath("//li[@class=\"ng-star-inserted ui-autocomplete-list-item ui-corner-all\"][2]")).click();
		System.out.println("Selected");
		

	}

}
