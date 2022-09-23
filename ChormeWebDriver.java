package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;

public class ChormeWebDriver {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

       driver.findElement(By.className("ico-register")).click();
       driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label")).click();
       driver.findElement(By.id("FirstName")).sendKeys("Richa");
       driver.findElement(By.id("LastName")).sendKeys("Mehta");
       Thread.sleep(2000);

       WebElement Day =  driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Day.sendKeys("10");
        Month.sendKeys("May");
        Year.sendKeys("1991");
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys("richamehta1081@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Company")).sendKeys("R.C.Ltd");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[3]/div[2]/div/label")).click();
        driver.findElement(By.id("Password")).sendKeys("xyz123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz123");
        Thread.sleep(2000);
        driver.findElement(By.id("register-button")).click();



    }
}
