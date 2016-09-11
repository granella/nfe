package com.fincatto.nfe310.transformers;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.simpleframework.xml.transform.Transform;

public class NFLocalTimeTransformer implements Transform<LocalTime> {

    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public LocalTime read(final String time) throws Exception {
        return LocalTime.parse(time, TIME_FORMATTER);
    }

    @Override
    public String write(final LocalTime localTime) throws Exception {
        return TIME_FORMATTER.format(localTime);
    }
}
