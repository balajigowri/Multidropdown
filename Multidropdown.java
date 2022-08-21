package seleniumwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\sajis\\eclipse-workspace\\Seleniumpractise\\ChromeDriver\\chromedriver.exe");
	
	ChromeOptions opt = new ChromeOptions();
	ChromeOptions inc = opt.addArguments("incognito");
	WebDriver driver = new ChromeDriver(inc);
	driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");
	
	WebElement singdrop = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select s = new Select(singdrop);
	boolean ismultiple = s.isMultiple();
	System.out.println(ismultiple);
	System.out.println("-----------------------------");
	s.selectByValue("Monday");
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	WebElement multidrop = driver.findElement(By.xpath("//select[@name='States']"));
	Select s2 = new Select(multidrop);
	s2.selectByValue("California");
	s2.selectByValue("Florida");
	s2.selectByValue("New Jersey");
	s2.selectByValue("New York");
	List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();	
	for (WebElement webElement : allSelectedOptions) {
		System.out.println(webElement.getText());
		
	}
System.out.println("--------------------------------");
	List<WebElement> options = s2.getOptions();
	for (WebElement webElement : options) {
		System.out.println(webElement.getText());
	}
	
	
}
// Changes for Multidropdown in Branch
	
	
	
	
	
	
	
}
