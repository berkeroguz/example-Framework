package operations;

import org.openqa.selenium.WebDriver;

public class Browser {
    private final WebDriver driver;
    private final WaitFactory waitFactory;
    public Browser(WebDriver driver){
        this.driver=driver;
        waitFactory= new WaitFactory(driver);
    }



}
