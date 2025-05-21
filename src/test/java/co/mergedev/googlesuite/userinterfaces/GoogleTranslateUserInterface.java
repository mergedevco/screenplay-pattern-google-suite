package co.mergedev.googlesuite.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://translate.google.com/")
public class GoogleTranslateUserInterface extends PageObject {

    public static final Target INPUT_SOURCE_TEXT = Target.the("Source text").locatedBy("//textArea[@aria-label=\"Texto de origen\"]");
    public static final Target BUTTON_SOURCE_LANGUAGE = Target.the("Button source language").locatedBy("//button[@aria-label=\"Más idiomas de origen\"]");
    public static final Target INPUT_SOURCE_LANGUAGE = Target.the("Input source language").locatedBy("//input[@aria-label=\"Buscar idiomas\"]");


    public static final Target INPUT_RESULT_TEXT = Target.the("Result text").locatedBy("//span[.='{0}']");
}
