package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Main {

  static protected WebDriver driver;

  static {
     chromedriver().setup();
     var options = new ChromeOptions();
     options.addArguments("--no-sandbox");// bz we are using codespace container, this prevents from complications
     driver = new ChromeDriver(options); //new chrome browser will be opened

  }

  public static void main(String[] args) {
    driver.get("https://google.com");
    driver.quit();

  }
}