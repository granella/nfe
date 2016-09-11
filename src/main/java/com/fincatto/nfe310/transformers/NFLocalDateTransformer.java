package com.fincatto.nfe310.transformers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import org.simpleframework.xml.transform.Transform;

class NFLocalDateTransformer implements Transform<LocalDate> {

    private static final DateTimeFormatter DATE_FORMATTER_WITH_TIMEZONE = DateTimeFormatter.ISO_OFFSET_DATE;
    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

    @Override
    public LocalDate read(final String data) throws Exception {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .appendOptional(DATE_FORMATTER_WITH_TIMEZONE)
                .appendOptional(DATETIME_FORMATTER)
                .toFormatter();

        return LocalDate.parse(data, dateTimeFormatter);
    }

    @Override
    public String write(final LocalDate data) throws Exception {
        return DATETIME_FORMATTER.format(data);
    }
}
