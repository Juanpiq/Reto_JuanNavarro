package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import model.RetoDatos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

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
    public void heInsertHisPersonalData(List<RetoDatos> retoDatos) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Set.personalData(retoDatos.get(0).getStrFirstName(),retoDatos.get(0).getStrLastName(),retoDatos.get(0).getStrEmail()));
    }

    @And("^he insert his Address$")
    public void heInsertHisAddress(List<RetoDatos> retoDatos) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Submit.address(retoDatos.get(0).getStrZip()));
    }

    @And("^he insert his Devices Information$")
    public void heInsertHisDevicesInformation() throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Report.aboutDevices());
    }

    @And("^he insert a Password$")
    public void heInsertAPassword(List<RetoDatos> retoDatos) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Generate.newPassword(retoDatos.get(0).getStrPassword()));
    }

    @Then("^he can create a New Account$")
    public void heCanCreateANewAccount(List<RetoDatos> retoDatos) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retoDatos.get(0).getStrTitleText())));
    }
}
