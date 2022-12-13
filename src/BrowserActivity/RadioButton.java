package BrowserActivity;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\Online_Java_Training_Shami\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		
		// first approach 
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		
		//Second approach-- Not appropriate 
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio buttons"+radios.size());
		radios.get(0).click();
		System.out.println(radios.get(2).isSelected());
		System.out.println(radios.get(0).isDisplayed());
		System.out.println(radios.get(1).isEnabled());
		
		
		// 3rd way 
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		System.out.println(radios.size());
		String expvalue = "Male";
		
		for (int i=0; i<radios1.size();i++)
			
		{
			
			if (radios1.get(i).getText().equalsIgnoreCase(expvalue))
				
			{
				
			radios1.get(i).click();
			System.out.println(expvalue+"Clicked");
			break;
			}
		}

	}

}
