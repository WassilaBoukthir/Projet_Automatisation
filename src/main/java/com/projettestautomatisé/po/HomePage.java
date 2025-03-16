package com.projettestautomatisé.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageObject {

    public HomePage(WebDriver driver) {
	super(driver);
    }


    @FindBy(xpath = "//img[@alt='VERMEG']")
    private WebElement headLine;

    @FindBy(xpath = "//li[@id='menu-item-16581']//a[normalize-space()='Contact us']")
    private WebElement Contact_US;
   
   @FindBy(id = "firstname-93c13876-216c-499d-8941-0449fbd55fdf")
   private WebElement First_Name;

   @FindBy(xpath = "//input[@id='lastname-93c13876-216c-499d-8941-0449fbd55fdf']")
   private WebElement Last_Name;
   
   @FindBy(xpath = "//input[@id='phone-93c13876-216c-499d-8941-0449fbd55fdf']")
   private WebElement Phone;
   

   public WebElement getPhone() {
	return Phone;
}

public void setPhone(WebElement phone) {
	Phone = phone;
}


@FindBy(xpath = "//input[@id='company-93c13876-216c-499d-8941-0449fbd55fdf']")
   private WebElement Company;

   @FindBy(xpath = "//input[@id='email-93c13876-216c-499d-8941-0449fbd55fdf']")
   private WebElement Email_Address;

  @FindBy(xpath = "//input[@id='jobtitle-93c13876-216c-499d-8941-0449fbd55fdf']")
  private WebElement Position;
  
	@FindBy(xpath = "//input[@value='Send']")
	private WebElement Send;
	
	@FindBy(xpath = "//input[@id='LEGAL_CONSENT.subscription_type_259521207-93c13876-216c-499d-8941-0449fbd55fdf']")
	private WebElement Cocher;
	

	public WebElement getCocher() {
		return Cocher;
	}

	public void setCocher(WebElement cocher) {
		Cocher = cocher;
	}


	@FindBy(xpath = "//label[@class='hs-main-font-element']")
	private WebElement Message_erreur;
	
	@FindBy(xpath = "//select[@id='subject-93c13876-216c-499d-8941-0449fbd55fdf']")
	  private WebElement Subject ;

	  @FindBy(xpath = "//textarea[@id='message-93c13876-216c-499d-8941-0449fbd55fdf']")
	  private WebElement Message ;
	  
	  @FindBy(xpath = "//select[@id='industry-93c13876-216c-499d-8941-0449fbd55fdf']")
	  private WebElement Industry;
	  //private List<WebElement> Industry ;
	  
	  @FindBy(xpath = "//select[@id='country-93c13876-216c-499d-8941-0449fbd55fdf']")
	 // private List<WebElement> Select_a_country ;
	  private WebElement Select_a_country ;
	  
	  @FindBy(id = "cn-accept-cookie")
	  private WebElement cnAcceptCookie;
	  
	  
	  
	  
	
  public WebElement getCnAcceptCookie() {
		return cnAcceptCookie;
	}

	public void setCnAcceptCookie(WebElement cnAcceptCookie) {
		this.cnAcceptCookie = cnAcceptCookie;
	}

public WebElement getMessage_erreur() {
		return Message_erreur;
	}

	public void setMessage_erreur(WebElement message_erreur) {
		Message_erreur = message_erreur;
	}

public WebElement getSend() {
		return Send;
	}

	public void setSend(WebElement send) {
		Send = send;
	}

public WebElement getHeadLine() {
	return headLine;
}

public void setHeadLine(WebElement headLine) {
	this.headLine = headLine;
}

public WebElement getContact_US() {
	return Contact_US;
}

public void setContact_US(WebElement contact_US) {
	Contact_US = contact_US;
}

public WebElement getFirst_Name() {
	return First_Name;
}

public void setFirst_Name(WebElement first_Name) {
	First_Name = first_Name;
}

public WebElement getLast_Name() {
	return Last_Name;
}

public void setLast_Name(WebElement last_Name) {
	Last_Name = last_Name;
}

public WebElement getCompany() {
	return Company;
}

public void setCompany(WebElement company) {
	Company = company;
}

public WebElement getEmail_Address() {
	return Email_Address;
}

public void setEmail_Address(WebElement email_Address) {
	Email_Address = email_Address;
}

public WebElement getPosition() {
	return Position;
}

public void setPosition(WebElement position) {
	Position = position;
}

public WebElement getSubject() {
	return Subject;
}

public void setSubject(WebElement subject) {
	Subject = subject;
}

public WebElement getMessage() {
	return Message;
}

public void setMessage(WebElement message) {
	Message = message;
}

public WebElement getIndustry() {
	return Industry;
}

public void setIndustry(WebElement industry) {
	Industry = industry;
}

public WebElement getSelect_a_country() {
	return Select_a_country;
}

public void setSelect_a_country(WebElement select_a_country) {
	Select_a_country = select_a_country;
}

  
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  