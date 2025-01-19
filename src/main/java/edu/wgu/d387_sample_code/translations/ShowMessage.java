package edu.wgu.d387_sample_code.translations;

import java.util.Locale;
import java.util.ResourceBundle;

public class ShowMessage {
    String getWelcomeMessage(Locale locale){
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcome");
    }
}
