package businessscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProg {
	@Test
	public void hardwork() throws InterruptedException {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.get("https://www.gmail.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.rameshsoft.com");
		
		Thread.sleep(2000);
		driver.close();

	}

}
