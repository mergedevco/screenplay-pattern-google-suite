package co.mergedev.googlesuite.questions;

import co.mergedev.googlesuite.userinterfaces.GoogleTranslateUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ResultText implements Question<String> {

    private final String resultText;

    public ResultText(String resultText) {
        this.resultText = resultText;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(GoogleTranslateUserInterface.INPUT_RESULT_TEXT.of(resultText), isVisible()).forNoMoreThan(Duration.ofMinutes(1))
        );
        return Text.of(GoogleTranslateUserInterface.INPUT_RESULT_TEXT.of(resultText)).answeredBy(actor);
    }

    public static ResultText is(String resultText) {
        return new ResultText(resultText);
    }
}
