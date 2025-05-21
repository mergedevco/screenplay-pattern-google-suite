package co.mergedev.googlesuite.tasks;

import co.mergedev.googlesuite.userinterfaces.GoogleTranslateUserInterface;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(GoogleTranslateUserInterface.class)
        );
    }

    public static OpenPage at() {
        return Instrumented.instanceOf(OpenPage.class).withProperties();
    }
}
