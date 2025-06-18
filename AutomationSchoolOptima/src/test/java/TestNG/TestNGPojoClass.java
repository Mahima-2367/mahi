package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Demo.BaseClassMethods;

public class TestNGPojoClass extends BaseClassMethods {

	
	public TestNGPojoClass() {
		
		PageFactory.initElements(driver, this);
		
		
		}
		
		@FindBy(xpath="//a[@href='login']")
		
		private WebElement btn;

		public WebElement getBtn() {
			return btn;
		}
		public WebElement getId() {
			return id;
		}
		public WebElement getPw() {
			return pw;
		}
		public WebElement getSubmit() {
			return submit;
		}

		@FindBy(id="username")
		   private WebElement id;
		@FindBy(id="password")
		  private WebElement pw;
		@FindBy (xpath="//input[@type='submit']")
		private WebElement submit;
		

	
	
	
}
