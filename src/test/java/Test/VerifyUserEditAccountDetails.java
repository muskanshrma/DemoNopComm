package Test;

import org.testng.annotations.Test;
import java.io.IOException;

public class VerifyUserEditAccountDetails extends BaseClass{
@Test
public void editDetails() throws IOException {
    pageFactory.getMyAccountsPage().editDetails();
  }
}