package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddroy\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions actions = new Actions(driver);

        actions.contextClick(driver.findElement(By.xpath("//span[contains(text(),'right click me')]"))).perform();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(text(),'copy')]")).click();
        System.out.println(driver.switchTo().alert().getText());

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        driver.quit();
    }
}
