package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAutomation {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips Projects\\Drivers\\Chrome Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gozayaan.com/account/signin");
		driver.close();
	}

}
