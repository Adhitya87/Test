package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;


public class SearchGoogle {
    WebDriver driver;
    @Given("I'm Open the browser")
    public void OpenBrowser() throws AWTException, InterruptedException{
            final String dir = System.getProperty("user.dir");
            System.out.println("current dir = " + dir);
            System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
            driver = new ChromeDriver();
    }

    @And("I go to Google website")
    public void WebGoogle() throws InterruptedException {
            driver.get("https://www.google.co.id/");
            Thread.sleep(1000);
        }

        @And("I'm on google website")
        public void OnGoogleWebsite() {
            driver.findElement(By.name("btnK")).isDisplayed();
        }


    @When("I try to search {string}")
    public void Search(String searchValue) {
        driver.findElement(By.name("q")).sendKeys(searchValue);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("I find some result related with {string}")
    public void Result(String result) {
        driver.findElement(By.xpath("//a[@href='https://id.linkedin.com/in/hilda-lisnawati-a01687166']")).isDisplayed();
        String urlLinkedin = driver.findElement(By.xpath("//a[@href='https://id.linkedin.com/in/hilda-lisnawati-a01687166']")).getText();
        System.out.println(urlLinkedin);
//        driver.close();
    }


}
