package firstpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Firstclass {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\mohit\\eclipse\\java-2021-03\\Thirdproject\\src\\test\\resources\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
	}

}
