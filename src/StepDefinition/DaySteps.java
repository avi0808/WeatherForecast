//StepDefinition file for the Day.feature file

package StepDefinition;		

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class DaySteps {				
	WebDriver driver;
    
	//The given statement from the feature file	
	
    @Given("^the user enters the five day weather forecast for Glasgow city$")				
    public void Select_city() throws Throwable							
    {		
    	System.setProperty("webdriver.chrome.driver", "C://test//chromedriver.exe");					
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("http://localhost:3000/");	
        System.out.println("");					
    }		
    
    //The when statement from the feature file

    @When("^the user clicks any row of the day$")					
    public void Show_Forecast() throws Throwable 							
    {		
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]")).click();				
    }		
    
    //The Then statement from the feature file

    @Then("^the three hourly weather forecast of that day should be displayed$")					
    public void Verify_Forecast() throws Throwable 							
    {    		
    	WebElement startTime= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/span[1]/span"));
    	WebElement endTime= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[8]/span[1]/span"));
    	Assert.assertEquals(startTime.getText(),"0230");
    	Assert.assertEquals(endTime.getText(),"2330");
        System.out.println("The three hourly weather forecast of the day is displayed");			
    }		
    
    //The And statement from the feature file
    
    @And("^the user clicks on the same row of the day again$")
    public void Hide_Forecast() throws Throwable
    {
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]")).click();    	
    }
    
    //The final Then statement froom the feature file
    
    @Then("^the three hourly weather forecast should be hidden$")					
    public void Verify_HiddenForecast() throws Throwable 							
    {    		
    	if(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/span[1]/span"))!=null)
    	{
    		System.out.println("Forecast is not hidden");
    	}
    	else
    	{
    		System.out.println("Forecast is hidden");
    	}

    }

}