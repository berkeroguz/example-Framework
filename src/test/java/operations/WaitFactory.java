package operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitFactory {
    private final WebDriverWait wait;

    public WaitFactory(WebDriver driver) {
        wait = new WebDriverWait(driver,(Duration.ofSeconds(20)) );
    }
}
