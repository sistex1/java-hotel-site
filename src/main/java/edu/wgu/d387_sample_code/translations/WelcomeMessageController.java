package edu.wgu.d387_sample_code.translations;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@CrossOrigin("http://localhost:4200")
public class WelcomeMessageController {

    @GetMapping("/welcome")
    public String[] welcomeMessage(){

        String[] messages = new String[2];

        Thread en_US = new Thread(() -> {
            ShowMessage showMessageEN = new ShowMessage();
            messages[0] = showMessageEN.getWelcomeMessage(Locale.US);
            System.out.println(messages[0]);
        });

        Thread fr_CA = new Thread(() -> {
            ShowMessage showMessageFR = new ShowMessage();
            messages[1] = showMessageFR.getWelcomeMessage(Locale.CANADA_FRENCH);
            System.out.println(messages[1]);
        });

        en_US.start();
        fr_CA.start();

        return messages;
    }
}
