import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ElementNotVisible {

    private static WebDriver driver;

    private WebDriver setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(1295, 843));
        return driver;
    }


    @Test
    public void clickOnElementByTypeHidden(){
        driver = setupDriver();
        driver.get("https://www.lambdatest.com/blog/49-common-selenium-exceptions-automation-testing/");
        WebElement link = driver.findElement(By.xpath("//input[@id='comment_parent']"));
        link.click();

    }

    @Test
    public void clickOnNotVisibleElement(){
        driver = setupDriver();
        driver.get("https://preview.harriscountyfws.org/");
        WebElement link = driver.findElement(By.xpath("//option[@value='1']"));
        link.click();
    }

    @Test
    public void clickOnHiddenButton(){
        driver = setupDriver();
        driver.get("http://omayo.blogspot.com/");
        WebElement link = driver.findElement(By.xpath("//*[@id='hbutton']"));
        link.click();
    }

    @Test
    public void clickOnNotLoadedButton(){
        driver = setupDriver();
        driver.get("https://www.easemytrip.com/");

        driver.findElement(By.id("ddate")).click();
        driver.findElement(By.id("fst_5_04/06/2021")).click();
        driver.findElement(By.className("src_btn")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Book Now']")));
        driver.findElement(By.xpath("//button[text()='Book Now']")).click();
    }



}
