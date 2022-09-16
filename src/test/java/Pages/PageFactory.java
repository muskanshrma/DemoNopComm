package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AddToCart addToCart;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public AddToCart getAddToCart() {
        if (addToCart == null) {
            addToCart = new AddToCart(driver);
        }
        return addToCart;
    }
}