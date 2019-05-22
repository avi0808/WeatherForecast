package StepDefinition;		

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class CitySteps {				
	WebDriver driver;
	
    //the localhost application starts with Glasgow city weather report directly
    
	@Given("^the user enters the city name as \"(.*)\"$")				
    public void Select_city() throws Throwable							
    {		
    	System.setProperty("webdriver.chrome.driver", "C://test//chromedriver.exe");					
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("http://localhost:3000/");			
    }		

    @When("^the user clicks on show forecast/report/proceed/continue$")					
    public void Show_Forecast() throws Throwable 							
    {		
       System.out.println("");					
    }		

    @Then("^Five day weather forecast should be displayed$")					
    public void Verify_Forecast() throws Throwable 							
    {    		
        System.out.println("");					
    }		

}