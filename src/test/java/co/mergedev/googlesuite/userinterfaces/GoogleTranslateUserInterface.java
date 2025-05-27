package co.mergedev.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslateUserInterface {

    public static final Target INPUT_SOURCE_TEXT = Target.the("Source text").locatedBy("//textArea[@aria-label=\"Texto de origen\"]");
    public static final Target BUTTON_SOURCE_LANGUAGE = Target.the("Button source language").locatedBy("//div[@jsname=\"gnoFo\"]//button[@aria-label=\"Más idiomas de origen\"]");
    public static final Target INPUT_SEARCH_SOURCE_LANGUAGE = Target.the("Input search language").locatedBy("//div[@jsname=\"gnoFo\"]//div[@jsname=\"XBgn9c\"]//input[@aria-label=\"Buscar idiomas\"]");
    public static final Target INPUT_SEARCH_RESULT_LANGUAGE = Target.the("Input search language").locatedBy("//div[@jsname=\"gnoFo\"]//div[@jsname=\"Kxj0sc\"]//input[@aria-label=\"Buscar idiomas\"]");
    public static final Target BUTTON_RESULT_LANGUAGE = Target.the("Button result language").locatedBy("//div[@jsname=\"gnoFo\"]//button[@aria-label=\"Más idiomas de destino\"]");
    public static final Target INPUT_RESULT_TEXT = Target.the("Result text").locatedBy("//span[.='{0}']");
}

//*[@id="yDmH0d"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[1]/div/div[2]/input
