package co.com.choucair.certification.maloneydavid.stepdefinitions;
import co.com.choucair.certification.maloneydavid.tasks.Login;
import co.com.choucair.certification.maloneydavid.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class  ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search fot the course Recursos Automatización Bancolombia$")
    public void heSearchFotTheCourseRecursosAutomatizacionBancolombia() {
    }

    @Then("^he finds the course called recources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledRecourcesRecursosAutomatizacionBancolombia() {
    }
}
