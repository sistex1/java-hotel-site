package edu.wgu.d387_sample_code.timezones;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertTime {

    //no instantiation needed to use
    public static String[] getTimeConvert() {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        ZonedDateTime ET = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = zonedDateTime.withZoneSameInstant( ZoneOffset.UTC);

        String[] times = {ET.format(formatter) + "ET // " + MT.format(formatter) + "MT // " + UTC.format(formatter) + "UTC"};
        return times;

    }

}
