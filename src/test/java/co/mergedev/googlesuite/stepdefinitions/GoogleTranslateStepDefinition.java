package co.mergedev.googlesuite.stepdefinitions;

import co.mergedev.googlesuite.models.TranslateModel;
import co.mergedev.googlesuite.questions.ResultText;
import co.mergedev.googlesuite.tasks.OpenPage;
import co.mergedev.googlesuite.tasks.Translate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

public class GoogleTranslateStepDefinition {

    @Given("{actor} would like translate a text")
    public void iWouldLikeTranslateAText(Actor actor) {
        actor.attemptsTo(
                OpenPage.at()
        );
    }

    @When("{actor} translate {string} from {string} to {string}")
    public void iTranslateFromTo(Actor actor, String text, String sourceLanguage, String finalLanguage) {
        actor.attemptsTo(
                Translate.text(text, sourceLanguage, finalLanguage)
        );
    }

    @When("{actor} translate the information")
    public void iTranslateTheInformation(Actor actor, List<TranslateModel> translateModels) {
        actor.attemptsTo(
                Translate.text(translateModels.get(0).getWord(), translateModels.get(0).getSourceLanguage(), translateModels.get(0).getResultLanguage())
        );
    }

    @Then("{actor} should see the translation {string}")
    public void iShouldSeeTheTranslation(Actor actor, String resultText) {
        actor.attemptsTo(Ensure.that(ResultText.is(resultText)).isEqualTo(resultText));
    }

}
