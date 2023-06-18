package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\user\\selenium-workspace\\CucumberFinal\\src\\test\\resources\\features",
        glue = "steps",
        strict = true,
        monochrome= true,
        		//dryRun = false
        tags = "@SkyBlueBackground or @WhiteBackground",
        		
//        		
        		plugin = {"pretty",
        				"html:target/reports/cucumber.html",
        				"json:target/reports/cucumber.json"
        		}
        
)



public class Finalrunner {

}
