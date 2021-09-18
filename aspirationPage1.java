package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aspirationPage1 {

		WebDriver driver;
		public aspirationPage1(WebDriver driver)
		{
		this.driver = driver;
}
		By ssLink = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]");
        public void clickSpendSave()
        {
         driver.findElement(ssLink).click();
        
}
}

