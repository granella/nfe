package com.fincatto.nfe310.transformers;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.simpleframework.xml.transform.Transform;

class NFZonedDateTimeTransformer implements Transform<ZonedDateTime> {

    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @Override
    public ZonedDateTime read(final String data) throws Exception {
        return ZonedDateTime.parse(data, DATETIME_FORMATTER);
    }

    @Override
    public String write(final ZonedDateTime data) throws Exception {
        return data.format(DATETIME_FORMATTER);
    }
}
