package selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeWebDriver {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:/Software/Driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Tina");
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        Thread.sleep(2000);

        WebElement Day =  driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Day.sendKeys("21");
        Month.sendKeys("April");
        Year.sendKeys("1981");
        Thread.sleep(2000);

        driver.findElement(By.id("Email")).sendKeys("tinashah2181@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Company")).sendKeys("T.S.Ltd");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[3]/div[2]/div/label")).click();
        driver.findElement(By.id("Password")).sendKeys("tina21");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("tina21");
        Thread.sleep(2000);
        driver.findElement(By.id("register-button")).click();





    }

}

