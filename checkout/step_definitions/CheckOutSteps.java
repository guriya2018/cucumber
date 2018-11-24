package step_definitions;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import static org.junit.Assert.*;
import implementation.Checkout;

public class CheckoutSteps {
	Checkout checkout;
	
@Given("^price of \"([^\"]*)\" is (\\d+)c$")
public void priceOfIsC(String name, int price) throws Throwable {
    int bananaPrice = price;
}

@When("^I checkout (\\d+) \"([^\"]*)\"$")
public void iCheckout(int itemCount, String itemName) throws Throwable {
Checkout checkout = new Checkout();
checkout.add(itemCount, bananaPrice);
}

@Then("^total price of \"([^\"]*)\" should be (\\d+)c$")
public void theTotalPriceShouldBeC(int total) throws Throwable {
assertEquals(total, checkout.total());
}
	
}




