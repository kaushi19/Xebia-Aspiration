package stepDefinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.aspirationPage1;
import pageObjects.aspirationPage2;

public class aspirationTestCode {
	String driverPath = "C:\\chromedriver.exe";
	WebDriver driver;
	String url = "https://www.aspiration.com/";
	aspirationPage1 objPage1;
	//aspirationPage1 objPage1 = new aspirationPage1(driver);
	aspirationPage2 objPage2;
	//aspirationPage2 objPage2 = new aspirationPage2(driver);}
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	{
		aspirationPage1 objPage1 = new aspirationPage1(driver);
		aspirationPage2 objPage2 = new aspirationPage2(driver);
	}

@Given("user visits https:\\/\\/aspiration.com\\/")
public void user_visits_https_aspiration_com() {
	driver.get("url");    
    throw new io.cucumber.java.PendingException();
}

@When("user clicks on Spend & Save")
public void user_clicks_on_spend_save() {
    //objPage1 = new aspirationPage1(driver);
    objPage1.clickSpendSave();
    throw new io.cucumber.java.PendingException();
}

@Then("user navigates to Products page")
public void user_navigates_to_products_page() {
    //objPage2 = new aspirationPage2(driver);
    String productsPageTitle = objPage2.getProductsPageTitle();
    Assert.assertTrue(productsPageTitle.toLowerCase().contains("Spend & Save Plans"));
    throw new io.cucumber.java.PendingException();
}

@Then("user clicks on Get Aspiration")
public void user_clicks_on_get_aspiration() {
    //objPage2 = new aspirationPage2(driver);
    objPage2.clickgetAspirationButton();
    throw new io.cucumber.java.PendingException();
}

@Then("user clicks on Close")
public void user_clicks_on_close() {
    objPage2.clickCloseLink();
    throw new io.cucumber.java.PendingException();
}

@Then("user clicks on Get Aspiration Plus")
public void user_clicks_on_get_aspiration_plus() {
    objPage2.clickgetAspirationPlusButton();
    throw new io.cucumber.java.PendingException();
}

@Then("plans should be displayed")
public void plans_should_be_displayed() {
    String yearlyPlan = objPage2.getyearlyPlanText();
    Assert.assertTrue(yearlyPlan.toLowerCase().contains("$71.88 paid once yearly"));
    String monthlyPlan = objPage2.getmonthlyPlanText();
    Assert.assertTrue(monthlyPlan.toLowerCase().contains("$7.99 paid monthly"));
    throw new io.cucumber.java.PendingException();
}

}
