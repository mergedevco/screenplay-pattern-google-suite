package co.mergedev.googlesuite.tasks;

import co.mergedev.googlesuite.userinterfaces.GoogleTranslateUserInterface;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


public class Translate implements Task {

    private final String text;
    private final String sourceLanguage;
    private final String finalLanguage;

    public Translate(String text, String sourceLanguage, String finalLanguage) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.finalLanguage = finalLanguage;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(text).into(GoogleTranslateUserInterface.INPUT_SOURCE_TEXT),
                Click.on(GoogleTranslateUserInterface.BUTTON_SOURCE_LANGUAGE),
                Enter.theValue(sourceLanguage).into(GoogleTranslateUserInterface.INPUT_SEARCH_SOURCE_LANGUAGE),
                Hit.the(Keys.ENTER).into(GoogleTranslateUserInterface.INPUT_SEARCH_SOURCE_LANGUAGE),
                Click.on(GoogleTranslateUserInterface.BUTTON_RESULT_LANGUAGE),
                Enter.theValue(finalLanguage).into(GoogleTranslateUserInterface.INPUT_SEARCH_RESULT_LANGUAGE),
                Hit.the(Keys.ENTER).into(GoogleTranslateUserInterface.INPUT_SEARCH_RESULT_LANGUAGE)
        );
    }

    public static Translate text(String text, String sourceLanguage, String finalLanguage) {
        return Instrumented.instanceOf(Translate.class).withProperties(text, sourceLanguage, finalLanguage);
    }

}
