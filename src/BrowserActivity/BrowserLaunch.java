package BrowserActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\Online_Java_Training_Shami\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		String Title = driver.getTitle();
		String Tit = "Sign up for Facebook | Facebook";
		if (Title.equals(Tit)) {
			System.out.println("Titles are matching");
		}

		else

		{
			System.out.println("Titles are not matching");
		}
		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("srujan");
		
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Gowda");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8073211174");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123Srujan");
		
		driver.close();
	}

}
