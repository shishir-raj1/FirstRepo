package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumJava {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//import org.openqa.selenium.WebDriver;
		//import org.openqa.selenium.firefox.FirefoxDriver;
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\shihi\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shihi\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	

	}

}
