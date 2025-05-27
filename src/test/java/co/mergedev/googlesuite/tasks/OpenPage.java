package co.mergedev.googlesuite.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.util.EnvironmentVariables;

public class OpenPage implements Task {

    private EnvironmentVariables envVars;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String baseUrl =  EnvironmentSpecificConfiguration.from(envVars).getConfig("serenity").getString("home.page");
        actor.attemptsTo(
                Open.url(baseUrl)
        );
    }

    public static OpenPage at() {
        return Instrumented.instanceOf(OpenPage.class).withProperties();
    }
}
