package Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class VerifyUserCanAddToCartFromWishlist extends BaseClass{
    @Test
    public void wishlist() throws IOException {
        pageFactory.getWishlistPage().wishlist();
    }
}