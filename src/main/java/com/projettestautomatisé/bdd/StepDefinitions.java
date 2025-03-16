package com.projettestautomatisé.bdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.projettestautomatisé.po.CareersPage;
import com.projettestautomatisé.po.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private WebDriver driver;
    private JavascriptExecutor js;
    private CareersPage careersPage;
 
    private HomePage homePage;

    @Given("Je suis sur la page Home")
    public void je_suis_sur_la_page_home() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "--remote-allow-origins=*");

        driver = new ChromeDriver(options);
       
      
        careersPage = new CareersPage(driver);
        homePage=new HomePage(driver);
        driver.get("https://www.vermeg.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
    }

 
    @When("Je clique sur Careers")
    public void je_clique_sur_careers() {
    	 
        careersPage.getCareers().click();
    }

    @When("Je clique sur Featured Jobs")
    public void je_clique_sur_featured_jobs() {
        careersPage.getFEATURED_JOBS().click();
    }

    @When("Je saisis une référence valide dans le champ Keywords")
    public void je_saisis_une_reference_valide_dans_le_champ_keywords() {
        careersPage.getKeywords().sendKeys("LGO-Jan2025");
    }

    @When("Je saisis une référence invalide dans le champ Keywords")
    public void je_saisis_une_reference_invalide_dans_le_champ_keywords() {
        careersPage.getKeywords().sendKeys("INVALID-REF");
    }

    @When("Je clique sur SEARCH")
    public void je_clique_sur_search() {
        careersPage.getSEARCH().click();
    }

    @Then("Un message d erreur s affiche")
    public void un_message_d_erreur_s_affiche() {
        assertEquals("No offers found.", careersPage.getNoOfferFound().getText());
    }

    @When("Je saisis un pays valide uniquement dans le champ Country")
    public void je_saisis_un_pays_valide_uniquement_dans_le_champ_country() {
        careersPage.getCOUNTRY().sendKeys("Tunisia");
    }

    @Then("Le tableau Offers Jobs s'affiche avec le pays sélectionné")
    public void le_tableau_offers_jobs_s_affiche_avec_le_pays_selectionne() {
        assertTrue(careersPage.getCountryJobOffers().size()>=1);
    }

    @When("Je saisis ADMINISTRATIVE valide")
    public void je_saisis_administrative_valide() {
        careersPage.getJOB_Type().sendKeys("ADMINISTRATIVE");
    }

    @Then("Le tableau Offers Jobs s'affiche avec le Job Type en question")
    public void le_tableau_offers_jobs_s_affiche_avec_le_job_type_en_question() {
      
    }

    @When("Je saisis {string} ou {string} dans le champ Job Type")
    public void je_saisis_ou_dans_le_champ_job_type(String jobType1, String jobType2) {
        careersPage.getJOB_Type().sendKeys(jobType1);
    }

    @When("Je clique sur l'offre Job {string}")
    public void je_clique_sur_l_offre_job(String jobTitle) {
        careersPage.getOffersJob().click();
    }

    @Then("La page Senior Cloud Architect s'affiche correctement")
    public void la_page_senior_cloud_architect_s_affiche_correctement() {
        assertEquals("Senior Cloud Architect", careersPage.getJOB_Type().getText());
    }

    @Then("Un formulaire est affiché")
    public void un_formulaire_est_affiche() {
        
    }

    @Then("J'entre des données valides")
    public void j_entre_des_donnees_valides() {
        careersPage.getKeywords().sendKeys("LGO-Jan2025");
        careersPage.getCOUNTRY().sendKeys("Tunisia");
        careersPage.getJOB_Type().sendKeys("ADMINISTRATIVE");
    }

    @Then("J'entre des données invalides")
    public void j_entre_des_donnees_invalides() {
        careersPage.getKeywords().sendKeys("INVALID-REF");
        careersPage.getCOUNTRY().sendKeys("XXX");
        careersPage.getJOB_Type().sendKeys("UNKNOWN");
    }

    @Then("Le tableau Offers Jobs s'affiche")
    public void le_tableau_offers_jobs_s_affiche() {
       
    }

  
    @When("Je saisis une <référence valide> dans le champ Keywords")
    public void je_saisis_une_référence_valide_dans_le_champ_keywords() {
     	careersPage.getKeywords().sendKeys("LGO-Jan2025");
        
    }

    @Then("Le tableau Offers Jobs s affiche uniquement avec la référence en question")
    public void le_tableau_offers_jobs_s_affiche_uniquement_avec_la_référence_en_question() {
    	
    	assertEquals("LGO-Jan2025", careersPage.getReference().getText().replaceAll(" ", ""));

      
    }

    @When("Je saisis une <référence invalide> dans le champ Keywords")
    public void je_saisis_une_référence_invalide_dans_le_champ_keywords() {
     	careersPage.getKeywords().sendKeys("LGO-Jan2025");
     
    }
    

    @When("Je saisis un pays différent de Tunisia dans le champ Country")
    public void je_saisis_un_pays_différent_de_tunisia_dans_le_champ_country() {
    	careersPage.getCOUNTRY().sendKeys("France");
       
    }
     /////  *******************************Scenario BDD_Home Contact_US****************************************************************************
    
    @When("Je clique sur Contact US")
    public void je_clique_sur_contact_us() {
    	 driver.get("https://www.vermeg.com/");
    	homePage.getContact_US().click();
    }

    @Then("Le formulaire est affiché")
    public void le_formulaire_est_affiché() {
      
    }
    
    

    @When("Entrer des données valides")
    public void entrer_des_données_valides() {
    	
    	try {
    		homePage.getCnAcceptCookie().click();
    		js.executeScript("window.scrollTo(0,450);");
    		driver.switchTo().frame(0);
    		
    		
    		
    		//homePage.wait.until(ExpectedConditions.visibilityOf(homePage.getFirst_Name()));
		
    		//homePage.log.info("attribute 1"+homePage.getFirst_Name().getAttribute("value"));
    		
    		homePage.getFirst_Name().clear();
	    	homePage.getFirst_Name().sendKeys("Wassila");
    		
	    	
	    	homePage.getLast_Name().clear();
	    	
	    	homePage.getLast_Name().sendKeys("Boukthir");
	    	
	    	homePage.log.info("attribute 2"+homePage.getFirst_Name().getAttribute("value"));
	    	
	    	homePage.log.info("homePage.getFirst_Name().sendKeys(\"Wassila\");");
	    	

	    	homePage.getCompany().sendKeys("ODC");
	    	homePage.getEmail_Address().sendKeys("wassila.boukthir@gmail.com");
	    	
	    	homePage.getSelect_a_country().sendKeys("Tunisia");
	    	homePage.getPhone().sendKeys("56429620");
	    	
	    	
	    	homePage.getPosition().sendKeys("orange");
	    	homePage.getIndustry().sendKeys("Accounting");
	    	homePage.getSubject().sendKeys("Technical Support");
	    	
	    	homePage.getMessage().sendKeys("Hello");
	    	
	    	homePage.getCocher().click();

	    	
	    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			homePage.takeScreenShot("Entrer des données valides");
			e.printStackTrace();
		}
    	
    	
    	
    }
    
    @When("Je clique sur Send")
    public void je_clique_sur_send() {
    	
    	homePage.getSend().click();
       
    }

//    @When("Je clique sur Send")
//    public void je_clique_sur_send() {
//    	
//    	try {
//    		driver.get("https://www.vermeg.com/");
//    		homePage.getSend().click();
//			homePage.getCnAcceptCookie().click();
//			
//			homePage.perform(homePage.getSend());
//		} catch (Exception e) {
//			homePage.takeScreenShot("Je_clique_sur_Send");
//		}
//    	homePage.getSend().click();
//       
//    }

    @Then("Le formulaire est envoyée avec succès")
    public void le_formulaire_est_envoyée_avec_succès() {
       
    }

//// **********************************************Scénario InValide*******************************************

    

    @When("Entrer des données Invalides")
    public void entrer_des_données_invalides() {
  
    }
    
    
    ///***********************Direct application*****************************
    
    @When("Je clique sur Direct Application")
    public void je_clique_sur_direct_application() {
    	careersPage.getDirect_App().click();
      
    }

    @Then("J entre des données valides")
    public void j_entre_des_données_valides() {
    	
    	try {
    	
    		js.executeScript("window.scrollTo(0,150);");
    		//driver.switchTo().frame(0);

    		
    		
    		
    	careersPage.getEmail().sendKeys("ghada.haouach5@gmail.com");
    	
    	
    	careersPage.getLast_name().sendKeys("haouach");
    	careersPage.getFirst_name().sendKeys("ghada");
    	careersPage.getAddress().sendKeys("marsa");
    	
    	careersPage.getCountry().sendKeys("Tunisia");
    	careersPage.getRegion().sendKeys("ben arous");
    	careersPage.getPhone_number().sendKeys("24680968");
    	careersPage.getAvailability().sendKeys("Immediate");
    	careersPage.getLevel_of_studies().sendKeys("Bac+5");
    	
    	careersPage.getExperience().sendKeys("0 to 2 years");
    	careersPage.getProfil().sendKeys("IT");
    	
    	careersPage.getCocher_msg().click();
    	
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			//careersPage.takeScreenShot("Entrer des données valides");
			e.printStackTrace();
		}
    	
       
    }

    @When("Je clique sur Apply")
    public void je_clique_sur_apply() {
    	
    	careersPage.getApply().click();
        
    }

    @Then("Le formulaire est envoyé avec succès")
    public void le_formulaire_est_envoyé_avec_succès() {
    	
    	//assertEquals(" ", careersPage.getJOB_Type().getText());
       
    }

      
    

}
