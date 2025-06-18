package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClassMethods {
	
	
	
public PojoClass() {
		
		PageFactory.initElements(driver, this);
		
	}
	
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
	
    @FindBy(xpath="//a[@href='login']")
    //@FindBy(xpath="//div[@class='cs-find-search']")

      private WebElement btn;

      @FindBy(id="username")
       private WebElement id;
     @FindBy(id="password")
       private WebElement pw;
     @FindBy (xpath="//input[@type='submit']")
       private WebElement submit;


	public WebElement getStuclick() {
		return stuclick;
	}

	public WebElement getAddClick() {
		return AddClick;
	}

	public WebElement getFullname() {
		return Fullname;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getNamewithintial() {
		return Namewithintial;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getGendarF() {
		return GendarF;
	}

	public WebElement getAdhaar() {
		return adhaar;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getAdmission() {
		return admission;
	}

	public WebElement getFirstday() {
		return firstday;
	}

	public WebElement getSchDetails() {
		return schDetails;
	}

	public WebElement getStudymedium() {
		return studymedium;
	}

	public WebElement getTransport() {
		return transport;
	}

	public WebElement getTemporyAddress() {
		return temporyAddress;
	}

	public WebElement getPermanentAddress() {
		return PermanentAddress;
	}

	public WebElement getEmailaddress() {
		return emailaddress;
	}

	public WebElement getMblNumber() {
		return mblNumber;
	}

	public WebElement getEmergencyContact() {
		return emergencyContact;
	}

	public WebElement getFatherFullName() {
		return fatherFullName;
	}

	public WebElement getFatherlastname() {
		return fatherlastname;
	}

	public WebElement getContactnameinitials() {
		return contactnameinitials;
	}

	public WebElement getEmergencyRelation() {
		return emergencyRelation;
	}

	public WebElement getEmergencyemailid() {
		return emergencyemailid;
	}

	public WebElement getContactMblNo() {
		return contactMblNo;
	}

	
	 @FindBy(xpath="(//i[@class='fa fa-check-square'])[8]")
	 private WebElement MouseOver;
	 
     @FindBy(xpath="(//a[@href='studentSearch'])[2]")
	   private WebElement stuclick;
     @FindBy(xpath="//i[@class='fa fa-plus-circle']")
	   private WebElement AddClick;
	
	  @FindBy(xpath="//input[@id='fullNameInput']") 
	  private WebElement Fullname;
	  
	  @FindBy(xpath="//input[@id='lastNameInput']") 
	  private WebElement LastName;
	 
	  @FindBy(xpath="//input[@id='nameWithInitialsInput']") 
	  private WebElement Namewithintial;
	 
	  @FindBy(xpath="//input[@id='radioFemale']") 
	  private WebElement Gender;
	 
	 @FindBy(xpath="//input[@id='radioFemale']") 
	 private WebElement GendarF;
	 
	  @FindBy(xpath="//input[@id='nationalIdinput']")
	  private WebElement adhaar;
	 
	  @FindBy(xpath="//input[@id='datepickerBirth']") 
	  private WebElement DOB;
	 
	  @FindBy(xpath="//input[@id='datepickerAdmission']") 
	  private WebElement admission ;
	 
	  @FindBy(xpath="//input[@id='datepickerFirstDay']") 
	  private WebElement firstday ;
	  
	  @FindBy(xpath="//a[@href='#schoolDetails']") 
	  private WebElement schDetails;
	  
	  @FindBy(xpath="(//option[@value='1'])[3]") 
	  private WebElement studymedium;
	  
	  @FindBy(xpath="//select[@id='transportRequirement']")
	  private WebElement transport;
	 
	  @FindBy(xpath="//textarea[@id='temporaryAddress']//textarea[@id='temporaryAddress']")
	  private WebElement temporyAddress ;
	  
	  @FindBy(xpath="//textarea[@id='address']")
	  private WebElement PermanentAddress ;
	  
	  @FindBy(xpath="(//input[@type='text'])[10]") 
	  private WebElement emailaddress ;
	 
	  @FindBy(xpath="//input[@type='mobileNumberId']") 
	  private WebElement mblNumber;
	  
	  @FindBy(xpath="//a[@href='#emergencyContact']")
	  private WebElement emergencyContact;
	  
	  @FindBy(xpath="//input[@id='emergencyfullName']")
	  private WebElement fatherFullName;
	  
	  @FindBy(xpath="//input[@id='emergencyLastName']")
      private WebElement fatherlastname;
	 
	  @FindBy(xpath="//input[@id='ContactNameInitials']")
	  private WebElement contactnameinitials;

	  @FindBy(xpath="//select[@id='emergencyRelation']")
	  private WebElement emergencyRelation;
	  
	  @FindBy(xpath="//input[@id='emergenceyEmailInput']")
	  private WebElement emergencyemailid;
	  
	  @FindBy(xpath="//input[@id='ContactMobileNo']")
	  private WebElement contactMblNo;
	  
	  @FindBy(xpath="(//button[@type='submit'])[2]")
	  private WebElement Submit;

	
	
	
	
	
	
	

}
