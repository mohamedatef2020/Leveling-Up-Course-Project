package practiceTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public static void openCloseBrowser () {
    WebDriver driver = new ChromeDriver();

    driver.quit();
  }
}
