package Timeouts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class pageloadtimeoutsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

        driver.get("https://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}

