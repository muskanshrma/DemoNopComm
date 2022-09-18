package Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class VerifyUserCanCompareItems extends BaseClass{

    @Test
    public void compare() throws IOException {
        pageFactory.getComparisonPage().compare();
    }
}