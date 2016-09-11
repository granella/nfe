package com.fincatto.nfe310.transformers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.simpleframework.xml.transform.Transform;

class NFLocalDateTimeTransformer implements Transform<LocalDateTime> {

    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    @Override
    public LocalDateTime read(final String data) throws Exception {
        return LocalDateTime.parse(data, DATETIME_FORMATTER);
    }

    @Override
    public String write(final LocalDateTime data) throws Exception {
        return DATETIME_FORMATTER.format(data);
    }
}
