package bindings;

import cucumber.api.java.ca.I;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Generic extends Utils{

    @I("^Generic: Open Page (.+)$")
    public void gotToHomepage(String url){
        setProperty();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
        maximizeWindow();
        WebElement cookies = driver.findElement(By.xpath("//div[@class='wt-overlay__footer__action']//button[contains(.,'Akceptuj')]"));
        waitForElementToBeClickable(cookies, 20);
        cookies.click();

        WebElement homePage = driver.findElement(By.xpath("//div[@id='desktop-category-nav']"));
        waitForElementToBeClickable(homePage, 30);
        Assert.assertTrue(homePage.isDisplayed());
    }

    @I("^Etsy Homepage: Click button Zaloguj się$")
    public void clickSignIn(){
        setProperty();
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        WebElement signIn = driver.findElement(By.xpath("//div[@class='wt-flex-shrink-xs-0']//button"));
        waitForElementToBeClickable(signIn, 20);
        signIn.click();

        WebElement signInTitle = driver.findElement(By.xpath("//h1[contains(.,'Sign in') or contains(.,'Zaloguj się')]"));
        waitForElementToBeClickable(signInTitle, 30);
        Assert.assertTrue(signInTitle.isDisplayed());
    }

    @I("^Etsy Homepage: Verify correct login / registration$")
    public void assertCorrect(){
        WebElement loggedUser = driver.findElement(By.xpath("//button[@class='wt-menu__trigger wt-btn wt-btn--transparent wt-tooltip__trigger wt-btn--icon wt-pr-xs-1 wt-display-inline-flex-xs reduced-margin-xs']"));
        Assert.assertTrue(loggedUser.isDisplayed());
        //driver.quit();
    }

    @I("^Etsy Login Component: Click Register$")
    public void clickRegister(){
        WebElement signIn = driver.findElement(By.xpath("//div[@class='wt-grid__item-xs-12']//button[contains(.,'Zarejestruj')]"));
        waitForElementToBeClickable(signIn, 20);
        signIn.click();

        WebElement registerTitle = driver.findElement(By.xpath("//h1[contains(.,'Create your account') or contains(.,'Załóż konto')]"));
        waitForElementToBeClickable(registerTitle, 30);
        Assert.assertTrue(registerTitle.isDisplayed());
    }

    @I("^Etsy Login Component: Register with email: (.+), First name: (.+), Password: (.+), Newsletter: (.+)$")
    public void fillForm(String email, String name, String password, String newsletter) throws Throwable {
        Thread.sleep(10000);
        WebElement emailAddress = driver.findElement(By.xpath("//div[@class='wt-mb-xs-2 wt-validation ']//input"));
        WebElement firstName = driver.findElement(By.id("join_neu_first_name_field"));
        WebElement passwordValue = driver.findElement(By.id("join_neu_password_field"));
        WebElement newsletterCheckbox = driver.findElement(By.id("email_marketing_opt_in"));
        WebElement registerButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']"));

        setField(emailAddress, email);
        setField(firstName, name);
        setField(passwordValue, password);
        if (!newsletter.contains("nie")){
            newsletterCheckbox.click();
        }
        registerButton.click();

    }

    @I("^Etsy Login Component: Login with email: (.+), Password: (.+)$")
    public void fillForm(String email,  String password) throws Throwable {
        Thread.sleep(10000);
        WebElement emailAddress = driver.findElement(By.xpath("//div[@class='wt-mb-xs-2 wt-validation ']//input"));
        WebElement passwordValue = driver.findElement(By.id("join_neu_password_field"));
        WebElement signInButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']"));

        setField(emailAddress, email);
        setField(passwordValue, password);
        signInButton.click();

    }
}
