package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationHomePage {
	WebDriver driver;

	public CalculationHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='display']")
	WebElement result;
	
	@FindBy(xpath="//input[@type='button' and @value='C']")
	WebElement clear;
	
	@FindBy(xpath="//input[@type='button' and @value='9']")
	WebElement firstValue;
	
	@FindBy(xpath="//input[@type='button' and @value='3']")
	WebElement secondValue;
	
	@FindBy(xpath="//input[@type='button' and @value='+']")
	WebElement add;
	
	@FindBy(xpath="//input[@type='button' and @value='-']")
	WebElement subtract;
	
	@FindBy(xpath="//input[@type='button' and @value='×']")
	WebElement multiply;
	
	@FindBy(xpath="//input[@type='button' and @value='÷']")
	WebElement divide;
	
	@FindBy(xpath="//input[@type='button' and @value='=']")
	WebElement equal;

	public WebElement firstValue() {
		return firstValue;
	}

	public WebElement secondValue() {
		return secondValue;
	}
	
	public WebElement add() {
		return add;
	}
	
	public WebElement subtract() {
		return subtract;
	}
	
	public WebElement multiply() {
		return multiply;
	}
	
	public WebElement divide() {
		return divide;
	}
	
	public WebElement clear() {
		return clear;
	}
	
	public WebElement equal() {
		return equal;
	}
	
	public WebElement result() {
		return result;
	}

}
