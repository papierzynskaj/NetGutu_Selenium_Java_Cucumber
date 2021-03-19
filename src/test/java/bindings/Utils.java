package bindings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils{
    WebDriver driver;

    public void setProperty(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
    }

    public void waitForElementToBeClickable(WebElement field, long timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(field));
    }

    public void setField(WebElement element, String value){
        element.sendKeys(value);
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
}
