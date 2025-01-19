package edu.wgu.d387_sample_code.timezones;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
public class ConvertedTimeController {
    //works
    @GetMapping("/presentation")
    public String[] presentationTime(){
        String[] times = {"Our presentation will go live at: "+ ConvertTime.getTimeConvert()[0]};
        return times;
    }
}
