package stepsDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Cielo;

public class LoginStep {
	Cielo cielo = new Cielo();

	@Given("Load entire site")
	public void load_entire_site() {
		cielo.carrocel().click();		
	}

	@Then("Click in button")
	public void click_in_button() {
		cielo.botao().click();
	}

}
