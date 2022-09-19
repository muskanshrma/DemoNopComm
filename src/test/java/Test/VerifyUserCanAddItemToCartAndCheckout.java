package Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class VerifyUserCanAddItemToCartAndCheckout extends BaseClass {

    @Test
    public void addToCart() throws IOException {
        pageFactory.getAddToCart().addToCart();
    }
}