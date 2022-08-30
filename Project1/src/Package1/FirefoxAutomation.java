package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Eclips Projects\\Drivers\\Firefox driver\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();  //Starting empty Firefox browser
		
		driver.get("https://www.gozayaan.com/account/signin");  //opening goZayaan sign in URL
		
		driver.findElement(
				By.id("email"))
				.sendKeys("rifat.sakib90@gmail.com") ;  //finding by id
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("goZayaan@sakib90"); //finding by xpath
		
		driver.findElement(By.id("submitBtn")).click();  //clicking on submit btn
		
		System.out.println("Page title is "+driver.getTitle());  //getting page title after login
		
		driver.close(); //closing current tab
	}
}
