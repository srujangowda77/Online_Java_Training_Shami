package BrowserActivity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\New folder\\Online_Java_Training_Shami\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();

		// First appraoch
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[contains(@title,'Month')]/option"));
		dropdown.get(8).click();
		System.out.println(dropdown.get(8).isEnabled());
		System.out.println("drop down size is" + dropdown.size());

		// seconnd appraoch

		WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@title,'Month')]"));
		Select sel = new Select(dropdown1);
		sel.selectByVisibleText("Apr");
		sel.selectByValue("2");
		sel.selectByIndex(0);
		System.out.println(sel.getFirstSelectedOption().getText());

		// third appraoch

		WebElement bm1 = driver.findElement(By.xpath("//select[contains(@title,'Month')]"));
		Select month1 = new Select(bm1);
		List<WebElement> dropdown3 = month1.getOptions();

		for (int i = 0; i < dropdown3.size(); i++) {
			String dropdownvalue = dropdown3.get(i).getText();

			if (dropdownvalue.equalsIgnoreCase("Dec")) {
				dropdown3.get(i).click();
				System.out.println("selected value is   " + dropdownvalue);
			}

		}

		// fourth way
		bm1.sendKeys("Mar");

		// Fifth way

		driver.findElement(By.xpath("//select[contains(@title,'Month')]")).sendKeys("Nov");

		// Multiple value selection

		System.out.println(month1.isMultiple());
		month1.selectByVisibleText("Apr");
		month1.selectByValue("2");
		month1.selectByIndex(0);

		// Deselct the selected dropdown

		month1.deselectByIndex(6);
		month1.deselectByValue("10");
		month1.deselectByVisibleText("Feb");
		month1.deselectAll();

	}

}
