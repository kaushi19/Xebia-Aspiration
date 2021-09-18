package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aspirationPage2 {

		WebDriver driver;
		public aspirationPage2(WebDriver driver)
		{
		this.driver = driver;
}
		By getAButton = By.xpath("//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[1]/div[2]/button");
        public void clickgetAspirationButton()
        {
         driver.findElement(getAButton).click();
        }
        
         By closeLink = By.xpath("/html/body/div[1]/div/div/div/button");
         public void clickCloseLink()
         {
        	 
        	 driver.findElement(closeLink).click();
         }
         
        By getAPButton = By.xpath("//*[@id=\"content-area\"]/div/spend-save-plans/div/div/div[2]/div[2]/button");
        public void clickgetAspirationPlusButton()
        {
        driver.findElement(getAPButton).click();
}
		public String getProductsPageTitle() {
			By productsPageTitle = By.xpath("//*[@id=\"content-area\"]/div/spend-save-plans/div/h1");
			return driver.findElement(productsPageTitle).getText();
		}
		public String getyearlyPlanText() {
			By yearlyPlan = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/p");
			return driver.findElement(yearlyPlan).getText();
		}
		public String getmonthlyPlanText() {
			By monthlyPlan = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p");
			return driver.findElement(monthlyPlan).getText();
		}
}


