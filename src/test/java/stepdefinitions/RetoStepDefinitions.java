package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Join;
import tasks.OpenUp;
import tasks.Set;
import tasks.Submit;

public class RetoStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Juan wants to Sign Up at Utest\\.com$")
    public void thanJuanWantsToSignUpAtUtestCom() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(), (Join.onThePage()));
    }


    @When("^he insert his Personal Data$")
    public void heInsertHisPersonalData() {
        OnStage.theActorInTheSpotlight().attemptsTo(Set.personalData());
    }

    @And("^he insert his Address$")
    public void heInsertHisAddress() {
        OnStage.theActorInTheSpotlight().attemptsTo(Submit.address());
    }

    @And("^he insert his Devices Information$")
    public void heInsertHisDevicesInformation() {

    }

    @And("^he insert a Password$")
    public void heInsertAPassword() {

    }

    @Then("^he can create a New Account$")
    public void heCanCreateANewAccount() {

    }
}
