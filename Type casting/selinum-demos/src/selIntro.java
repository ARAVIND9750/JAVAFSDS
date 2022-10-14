

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selIntro {
	
	public static void main(String[] args) {
		
		WebDriver webdriver = null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
					webdriver = new ChromeDriver();
		webdriver = new ChromeDriver();
		
	System.setProperty("webdriver.gecko.driver", "C:\\tools\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	webdriver = new FirefoxDriver();
		
	System.setProperty("webdriver.edge.driver", "C:\\tools\\edgedriver_win64\\msedgedriver.exe");
	webdriver = new EdgeDriver();
		
		webdriver.get("https://www.simplilearn.com");
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		webdriver.quit();
	}

}