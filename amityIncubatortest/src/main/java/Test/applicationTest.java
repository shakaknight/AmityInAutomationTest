package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataMaker.BeforeAndAfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class applicationTest extends BeforeAndAfterTest{
	//public static String browser="firefox";
	public static WebDriver driver;
	
	@Parameters({ "browser" })
	@Test
	public void launchApplicationt(String browser) throws InterruptedException {
	// public static void main(String[] args) throws InterruptedException {
		
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://startupapply.amityincubator.com/");
		driver.findElement(By.id("mat-input-0")).sendKeys("Virtual hand");
		
		Thread.sleep(5000);
		driver.findElement(By.className("mat-select-trigger")).click();
		//driver.findElement(By.className("mat-select-trigger")).click();
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.id("mat-option-1")).click();
//		
		Thread.sleep(3000);
		driver.findElement(By.id("mat-select-1")).click();
//		driver.findElement(By.xpath("/html/body/app-root/div/app-form/div/div[2]/form/div[1]/div/div[2]/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-option-54")));
		driver.findElement(By.id("mat-option-54")).click();

		driver.findElement(By.xpath("/html/body/app-root/div/app-form/div/div[2]/form/div[1]/div/div[3]/div[1]/div[3]/div[1]/div/div/div[1]/label")).click();
		driver.findElement(By.id("mat-button-toggle-2-button")).click();
		driver.findElement(By.id("boot")).click();
		
		Thread.sleep(1000);
		WebElement chooseFile = driver.findElement(By.id("logoinput"));
		chooseFile.sendKeys("D:\\all\\testfiles\\test.png");
		Thread.sleep(1000);
		
		driver.findElement(By.id("brief")).sendKeys("A startup is a young company founded by one "
				+ "or more entrepreneurs to develop a unique product or service "
				+ "and bring it to market. By its nature, the typical startup "
				+ "tends to be a shoestring operation, with initial funding from "
				+ "the founders or their friends and families.");
		
		//continue button
		driver.findElement(By.xpath("/html/body/app-root/div/app-form/div/div[2]/form/div[2]/button")).click();;
		
		//2nd page
		driver.findElement(By.id("mat-input-1")).sendKeys("Rahul");
		driver.findElement(By.id("mat-input-2")).sendKeys("Yadav");
		driver.findElement(By.id("mat-input-3")).sendKeys("ananddubey016@gmail.com");
		driver.findElement(By.id("mat-input-4")).sendKeys("9876543210");
		
		Thread.sleep(3000);
		driver.findElement(By.id("mat-select-2")).click();
		driver.findElement(By.id("mat-option-56")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("mat-select-3")).click();
		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-option-91")));
		driver.findElement(By.id("mat-option-93")).click();

		
		driver.findElement(By.id("mat-input-5")).sendKeys("https://startupapply.amityincubator.com/");
		driver.findElement(By.id("mat-input-6")).sendKeys("https://startupapply.amityincubator.com/");
		Thread.sleep(1000);
		chooseFile = driver.findElement(By.id("pitchinput"));
		chooseFile.sendKeys("D:\\all\\testfiles\\testpdf.pdf");
		Thread.sleep(1000);
		driver.close();
		System.out.println("The test ran sucessfully");
	}

}
