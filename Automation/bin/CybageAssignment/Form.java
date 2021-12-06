package CybageAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\MyData\\MyWorkspace\\Automation\\bin\\CybageAssignment\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();

		driver.navigate().to("https://demoqa.com/");
		
		driver.findElement(By.xpath("//div[h5='Elements']//h5//..//..")).click();
		
		WebElement forms = driver.findElement(By.xpath("//div[text()=\"Forms\"]"));
		js.executeScript("arguments[0].scrollIntoView();", forms);
		forms.click();
		
		WebElement practiceForm = driver.findElement(By.xpath("//span[text()=\"Practice Form\"]"));
		js.executeScript("arguments[0].scrollIntoView();", practiceForm);
		practiceForm.click();
		
		System.out.println(driver.findElement(By.xpath("//h5[text()=\"Student Registration Form\"]")).getText());
		
		driver.findElement(By.id("firstName")).sendKeys("TestFirstName");
		driver.findElement(By.id("lastName")).sendKeys("TestLastName");
		driver.findElement(By.id("userEmail")).sendKeys("testemail@mail.com");
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByValue("1980");
		Select mon = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		mon.selectByVisibleText("January");
		driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--015\"]")).click();
		
//		driver.findElement(By.xpath("//div[@id=\"subjectsContainer\"]//div[1]//div[1]")).click();
//		driver.findElement(By.xpath("//input[@id=\"subjectsInput\"]")).sendKeys("a");
//		Thread.sleep(1000);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id=\"subjectsInput\"]")));
//		
//
//		List<WebElement> list = driver.findElements(By.xpath("///input[@id=\"subjectsInput\"]"));
//		
//		System.out.println("Auto Suggest List ::" + list.size());
//		
//		for(int i = 0 ;i< list.size();i++)
//		{
//			System.out.println(list.get(i).getText());
//			
//			if(list.get(i).getText().equals("Arts"))
//			{
//				list.get(i).click();
//				break;
//			}
//		}
//		
		driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-1\"]//..//child::label")).click();
		driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-3\"]//..//child::label")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\MyData\\sampleFile.jpeg");
		
		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("This is a dummy address");
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("state")));
		driver.findElement(By.id("state")).click();
		driver.findElement(By.xpath("//div[text()=\"Haryana\"]")).click();

		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("city")));
		driver.findElement(By.id("city")).click();
		driver.findElement(By.xpath("//div[text()=\"Panipat\"]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//button[@id=\"closeLargeModal\"]")).click();
		driver.quit();
	}
}
