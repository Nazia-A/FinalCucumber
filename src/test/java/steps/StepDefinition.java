package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition{
 WebDriver driver;
     WebDriverWait wait;

    @Given("\"Set SkyBlue Background\" button exists")
@Before    public void skyBlueButtonExists() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://techfios.com/test/104");
    }

    @When("I click on the button")
    public void clickOnButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("skyblue")));
        driver.findElement(By.id("skyblue")).click();
    }

    @Then("the background color changes to sky blue")
    public void verifySkyBlueBackgroundColor() {
        String backgroundColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
        Assert.assertEquals(backgroundColor, "rgba(135, 206, 235, 1)", "Background color is not set to sky blue.");
    }

    @Given("\"Set SkyWhite Background\" button exists")
    public void skyWhiteButtonExists() {
        driver.get("https://techfios.com/test/104");
    }

    @Then("the background color changes to white")
    public void verifyWhiteBackgroundColor() {
        String backgroundColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
        Assert.assertEquals(backgroundColor, "rgba(255, 255, 255, 1)", "Background color is not set to white.");
    }
}
