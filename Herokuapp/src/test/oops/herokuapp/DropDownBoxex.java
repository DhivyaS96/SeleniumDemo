package test.oops.herokuapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\42923\\workspace\\Herokuapp\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.linkText("Dropdown")).click();
//		Select select= new Select(driver.findElement(By.id("dropdown")));
//		List<WebElement> li= select.getOptions();
//		for(WebElement lis: li){
//			System.out.println(lis.getAttribute("value"));
//		}
		driver.findElement(By.linkText("Checkboxes")).click();
		Select s =new Select(driver.findElement(By.id("checkboxes")));
		List<WebElement> li= s.getAllSelectedOptions();
		for(WebElement l: li){
			System.out.println(l.getAttribute("type"));
		}
		
		
		

	}

}
