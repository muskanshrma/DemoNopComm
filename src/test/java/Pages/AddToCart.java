package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class AddToCart {
    WebDriver driver;
    WebDriverWait wait;

    String cityName = "city eg";
    String add = "city address";
    String zipcode = "12345";
    String number = "123452345";

    By computers = By.xpath("(//a[contains(text(), 'Computers')])[1]");
    By notebooks = By.xpath("(//a[contains(text(), 'Notebooks ')]");
    By addToCart = By.xpath("(//button[contains(@class, 'add-to-cart')])[1]");
    By terms = By.xpath("//input[@name='termsofservice']");
    By cart = By.xpath("//span[contains(text(), 'Shopping cart')]");
    By checkout = By.xpath("//button[@name='checkout']");
    By register = By.xpath("//button[contains(@class, 'register')]");
    By firstName = By.xpath("//input[@name='FirstName']");
    By lastName = By.xpath("//input[@name='LastName']");
    By emailid = By.xpath("//input[@name='Email']");
    By password = By.xpath("//input[@name='Password']");
    By confirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    By continueButton = By.xpath("//button[contains(text(), 'Continue')]");
    By country = By.xpath("//select[@class='valid']");
    By UsCountry = By.xpath("//*[contains(text(), 'United States')]");
    By city = By.xpath("//input[@name='BillingNewAddress.City']");
    By address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    By zip = By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']");
    By phone = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    By cont = By.xpath("(//button[contains(text(), 'Continue')])[1]");
    By confirm = By.xpath("//button[contains(text(), 'Confirm')]");

    public AddToCart(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addToCart() throws IOException {
        String path = System.getProperty("user.dir") + "//src//test//java//TestData//demonop.xlsx";
        FileInputStream prop1 = null;
        try {
            prop1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String fName = sheet.getRow(1).getCell(0).getStringCellValue();
        String lName = sheet.getRow(1).getCell(1).getStringCellValue();
        String email = sheet.getRow(1).getCell(2).getStringCellValue();
        String pass = sheet.getRow(1).getCell(3).getStringCellValue();

        driver.findElement(computers).click();
        driver.findElement(notebooks).click();
        driver.findElement(addToCart).click();
        driver.findElement(addToCart).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(cart));
        driver.findElement(cart).click();
        driver.findElement(terms).click();
        driver.findElement(checkout).click();
        driver.findElement(register).click();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(emailid).sendKeys(email);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
        driver.findElement(register).click();
        driver.findElement(continueButton).click();
        driver.findElement(terms).click();
        driver.findElement(checkout).click();
        driver.findElement(continueButton).click();
        driver.findElement(country).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(UsCountry));
        driver.findElement(UsCountry).click();
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(address).sendKeys(add);
        driver.findElement(zip).sendKeys(zipcode);
        driver.findElement(phone).sendKeys(number);
        driver.findElement(cont).click();
        driver.findElement(continueButton).click();
        driver.findElement(continueButton).click();
        driver.findElement(continueButton).click();
        driver.findElement(confirm).click();
    }
}