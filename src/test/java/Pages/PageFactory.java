package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AddToCart addToCart;
    private ComparisonPage comparisonPage;
    private MyAccountsPage myAccount;
    private WishlistPage wishlist;


    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public AddToCart getAddToCart() {
        if (addToCart == null) {
            addToCart = new AddToCart(driver);
        }
        return addToCart;
    }
    public ComparisonPage getComparisonPage() {
        if (comparisonPage == null) {
            comparisonPage = new ComparisonPage(driver);
        }
        return comparisonPage;
    }
    public MyAccountsPage getMyAccountsPage() {
        if (myAccount == null) {
            myAccount = new MyAccountsPage(driver);
        }
        return myAccount;
    }
    public WishlistPage getWishlistPage() {
        if (wishlist == null) {
            wishlist = new WishlistPage(driver);
        }
        return wishlist;
    }
}