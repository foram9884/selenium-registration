package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirefoxWebDriver {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","c:/software/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get ("http:/demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Tara");
        driver.findElement(By.id("LastName")).sendKeys("jain");
        Thread.sleep(2000);

        WebElement Day =  driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Day.sendKeys("26");
        Month.sendKeys("june");
        Year.sendKeys("1985");
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys("tarajain2685@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Company")).sendKeys("T.J.Ltd");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[3]/div[2]/div/label")).click();
        driver.findElement(By.id("Password")).sendKeys("abcd789");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd789");
        Thread.sleep(2000);
        driver.findElement(By.id("register-button")).click();

















    }
}
