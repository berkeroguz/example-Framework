package pages;

import operations.Browser;
import operations.WaitFactory;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public abstract class IBasePage {

    protected final Browser browser;
    protected final WaitFactory waitFactory;
    protected final WebDriver driver;
    public IBasePage(){
        this.driver=Driver.getDriver();
        this.browser= new Browser(driver);
        this.waitFactory = new WaitFactory(driver);
    }

    private HomePage homePage;

    public HomePage getHomePage(){
        if(homePage==null){
            return homePage = new HomePage(Driver.getDriver());
        }
        return homePage;
    }

}
