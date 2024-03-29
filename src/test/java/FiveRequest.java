import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FiveRequest {
    String SITE_URL = "https://yandex.ru/";
    WebDriver driver;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    //карта мап купить
    @Test
    public void firstTest() throws InterruptedException {
        driver.get(SITE_URL);

        WebElement username = driver.findElement(By.xpath("//input[@tabindex='2']"));
        Thread.sleep(5000);

        username.sendKeys("карта мап купить", Keys.ENTER);

        Thread.sleep(5000);

        WebElement ttcsite = driver.findElement(By.partialLinkText("ttc.com.ru"));
        ttcsite.click();
    }

    //карта мап купить спб
    @Test
    public void secondTest() throws InterruptedException {
        driver.get(SITE_URL);

        WebElement username = driver.findElement(By.xpath("//input[@tabindex='2']"));
        Thread.sleep(5000);

        username.sendKeys("карта мап купить спб", Keys.ENTER);

        Thread.sleep(5000);

        WebElement ttcsite = driver.findElement(By.partialLinkText("ttc.com.ru"));
        ttcsite.click();
    }

    //карточка мап купить
    @Test
    public void thirdTest() throws InterruptedException {
        driver.get(SITE_URL);

        WebElement username = driver.findElement(By.xpath("//input[@tabindex='2']"));
        Thread.sleep(5000);

        username.sendKeys("карточка мап купить", Keys.ENTER);

        Thread.sleep(5000);

        WebElement ttcsite = driver.findElement(By.partialLinkText("ttc.com.ru"));
        ttcsite.click();
    }

    //карточка мап купить спб
    @Test
    public void fourthTest() throws InterruptedException {
        driver.get(SITE_URL);

        WebElement username = driver.findElement(By.xpath("//input[@tabindex='2']"));
        Thread.sleep(5000);

        username.sendKeys("карточка мап купить спб", Keys.ENTER);

        Thread.sleep(5000);

        WebElement ttcsite = driver.findElement(By.partialLinkText("ttc.com.ru"));
        ttcsite.click();
    }

    //карта допуска к международным перевозкам купить
    @Test
    public void fithTest() throws InterruptedException {
        driver.get(SITE_URL);

        WebElement username = driver.findElement(By.xpath("//input[@tabindex='2']"));
        Thread.sleep(5000);

        username.sendKeys("карта допуска к международным перевозкам купить", Keys.ENTER);

        Thread.sleep(5000);

        WebElement ttcsite = driver.findElement(By.partialLinkText("ttc.com.ru"));
        ttcsite.click();
    }
}



