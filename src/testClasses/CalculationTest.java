package testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.CalculationHomePage;

public class CalculationTest {
	WebDriver driver = new ChromeDriver();
	
	public String prodUrl = "https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html";
	public String stageUrl = "https://nuix.github.io/SDET/senior-sdet/stagingCalc/index.html";
	CalculationHomePage chp = new CalculationHomePage(driver);
	
	@BeforeTest
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", "\\src\\main\\java\\resources\\chromedriver.exe");
		driver.manage().window().maximize();		
		driver.get(stageUrl);
	}
	
	@Test
	public void addition() throws InterruptedException {
		Thread.sleep(2000);
		chp.clear().click();
		Thread.sleep(2000);
		chp.firstValue().click();
		Thread.sleep(2000);
		chp.add().click();
		Thread.sleep(2000);
		chp.secondValue().click();
		Thread.sleep(2000);
		chp.equal().click();
		Thread.sleep(2000);
		System.out.println("Addition of two values is = "+chp.result().getText());
	}
	
	@Test
	public void subtraction() throws InterruptedException {
		Thread.sleep(2000);
		chp.clear().click();
		Thread.sleep(2000);
		chp.firstValue().click();
		Thread.sleep(2000);
		chp.subtract().click();
		Thread.sleep(2000);
		chp.secondValue().click();
		Thread.sleep(2000);
		chp.equal().click();
		Thread.sleep(2000);
		System.out.println("Subtraction of two values is = "+chp.result().getText());
	}
	
	@Test
	public void multiplication() throws InterruptedException {
		Thread.sleep(2000);
		chp.clear().click();
		Thread.sleep(2000);
		chp.firstValue().click();
		Thread.sleep(2000);
		chp.multiply().click();
		Thread.sleep(2000);
		chp.secondValue().click();
		Thread.sleep(2000);
		chp.equal().click();
		Thread.sleep(2000);
		System.out.println("Multiplication of two values is = "+chp.result().getText());
	}
	
	@Test
	public void divsion() throws InterruptedException {
		Thread.sleep(2000);
		chp.clear().click();
		Thread.sleep(2000);
		chp.firstValue().click();
		Thread.sleep(2000);
		chp.divide().click();
		Thread.sleep(2000);
		chp.secondValue().click();
		Thread.sleep(2000);
		chp.equal().click();
		Thread.sleep(2000);
		System.out.println("Division of two values is = "+chp.result().getText());
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	 

}
