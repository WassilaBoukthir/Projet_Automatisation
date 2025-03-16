package com.projettestautomatisé.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends PageObject {

	public CareersPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//img[@alt='VERMEG']")
	private WebElement headLine;
	
	
	@FindBy(xpath = "//div[@class='custom_menu_1 main_menu_underline_effect']//a[@class='mega-menu-link'][normalize-space()='Careers']")
	private WebElement Careers;
	
	@FindBy(xpath = "//li[@id='menu-item-219']//span[@class='menu-text'][normalize-space()='Featured Jobs']")
	private WebElement FEATURED_JOBS;
	
	@FindBy(xpath = "//input[@id='keywords']")
	private WebElement Keywords;
	
	@FindBy(xpath = "//input[@name='eolia_search']")
	private WebElement SEARCH;
	
	@FindBy(xpath = "//div[@class='custom_menu_1 main_menu_underline_effect']//a[@class='mega-menu-link'][normalize-space()='Careers'")
	private WebElement OffersJob;
	
	@FindBy(xpath = "//span[@title='Country']//input[@placeholder='Choose...']")
	private WebElement COUNTRY;
	
	@FindBy(xpath = "//span[@title='Job Type']//input[@placeholder='Choose...']")
	private WebElement JOB_Type;
	
	@FindBy(xpath = "//a[normalize-space()='LGO-Jan2025']")
	private WebElement Reference ;
	
	@FindBy(xpath = "//a[normalize-space()='Tunisia']")
	private List<WebElement> countryJobOffers ;
	
	////*******************direct applications***************************************
	///
	///
	@FindBy(xpath = "//li[@id='menu-item-20']//span[@class='menu-text'][normalize-space()='Direct Application']")
	private WebElement Direct_App ;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email ;
	
	@FindBy(xpath = "//input[@id='nom']")
	private WebElement last_name ;
	
	@FindBy(xpath = "//input[@id='prenom']")
	private WebElement first_name ;
	
	public WebElement getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(WebElement phone_number) {
		this.phone_number = phone_number;
	}


	@FindBy(xpath = "//input[@id='adresse']")
	private WebElement address ;
	
	@FindBy(xpath = "//select[@id='select2-pays-container']")
    private WebElement country ;
	
	
	



	//select[@id='subject-93c13876-216c-499d-8941-0449fbd55fdf']
	@FindBy(xpath = "//span[@id='select2-regorigine-container']")
	
	private WebElement region ;
	
	@FindBy(xpath = "//input[@id='port']")
	private WebElement phone_number ;
	
	
	
	@FindBy(xpath = "//span[@id='select2-liste4-container']")
	private WebElement availability ;
	
	
	
	@FindBy(xpath = "//span[@id='select2-liste1-container']")
	private WebElement level_of_studies ;
	
	
	
	public WebElement getDirect_App() {
		return Direct_App;
	}

	public void setDirect_App(WebElement direct_App) {
		Direct_App = direct_App;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public void setLast_name(WebElement last_name) {
		this.last_name = last_name;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public void setFirst_name(WebElement first_name) {
		this.first_name = first_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getRegion() {
		return region;
	}

	public void setRegion(WebElement region) {
		this.region = region;
	}

	public WebElement getAvailability() {
		return availability;
	}

	public void setAvailability(WebElement availability) {
		this.availability = availability;
	}

	public WebElement getLevel_of_studies() {
		return level_of_studies;
	}

	public void setLevel_of_studies(WebElement level_of_studies) {
		this.level_of_studies = level_of_studies;
	}

	public WebElement getExperience() {
		return experience;
	}

	public void setExperience(WebElement experience) {
		this.experience = experience;
	}

	public WebElement getProfil() {
		return profil;
	}

	public void setProfil(WebElement profil) {
		this.profil = profil;
	}

	public WebElement getCocher_msg() {
		return cocher_msg;
	}

	public void setCocher_msg(WebElement cocher_msg) {
		this.cocher_msg = cocher_msg;
	}

	public WebElement getApply() {
		return apply;
	}

	public void setApply(WebElement apply) {
		this.apply = apply;
	}


	@FindBy(xpath = "//span[@id='select2-liste3-container']")
	private WebElement experience ;
	
	@FindBy(xpath = "//span[@id='select2-liste5-container']")
	private WebElement profil ;
	
	@FindBy(xpath = "//input[@id='custom_gprd']")
	private WebElement cocher_msg ;
	
	@FindBy(xpath = "//input[@id='g-recaptcha']")
	private WebElement apply;
	
	
	
	public WebElement getReferenceSearched(String reference) {
		return driver.findElement(By.xpath("//a[normalize-space()='"+reference+"']"));
	}
	
	public WebElement getReference() {
		return Reference;
	}


	public void setReference(WebElement reference) {
		Reference = reference;
	}


	public WebElement getHeadLine() {
		return headLine;
	}


	public void setHeadLine(WebElement headLine) {
		this.headLine = headLine;
	}


	public WebElement getCareers() {
		return Careers;
	}


	public void setCareers(WebElement careers) {
		Careers = careers;
	}


	public WebElement getFEATURED_JOBS() {
		return FEATURED_JOBS;
	}


	public void setFEATURED_JOBS(WebElement fEATURED_JOBS) {
		FEATURED_JOBS = fEATURED_JOBS;
	}


	public WebElement getKeywords() {
		return Keywords;
	}


	public void setKeywords(WebElement keywords) {
		Keywords = keywords;
	}


	public WebElement getSEARCH() {
		return SEARCH;
	}


	public void setSEARCH(WebElement sEARCH) {
		SEARCH = sEARCH;
	}


	public WebElement getOffersJob() {
		return OffersJob;
	}


	public void setOffersJob(WebElement offersJob) {
		OffersJob = offersJob;
	}


	public WebElement getCOUNTRY() {
		return COUNTRY;
	}


	public void setCOUNTRY(WebElement cOUNTRY) {
		COUNTRY = cOUNTRY;
	}


	public WebElement getJOB_Type() {
		return JOB_Type;
	}


	public void setJOB_Type(WebElement jOB_Type) {
		JOB_Type = jOB_Type;
	}


	@FindBy(xpath = "//*[@id=\"main\"]/div/div[2]")
	private WebElement noOfferFound;
	
	
	

	public WebElement getNoOfferFound() {
		return noOfferFound;
	}

	public void setNoOfferFound(WebElement noOfferFound) {
		this.noOfferFound = noOfferFound;
	}

	public List<WebElement> getCountryJobOffers() {
		return countryJobOffers;
	}

	public void setCountryJobOffers(List<WebElement> countryJobOffers) {
		this.countryJobOffers = countryJobOffers;
	}
	
	
	
	
	
	
	
	
	
	
}
