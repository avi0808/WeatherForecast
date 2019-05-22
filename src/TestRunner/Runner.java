package TestRunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features/Day.feature",glue={"src/StepDefinition/DaySteps.java"})						
public class Runner 				
{		

}