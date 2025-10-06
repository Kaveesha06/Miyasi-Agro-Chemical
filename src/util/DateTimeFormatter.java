package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatter {

    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // Format only date (yyyy-MM-dd)
    public static String formatDate(Date date) {
        return (date == null) ? null : DATE_FORMATTER.format(date);
    }

    // Format date and time (yyyy-MM-dd HH:mm)
    public static String formatDateTime(Date date) {
        return (date == null) ? null : DATE_TIME_FORMATTER.format(date);
    }

    // Parse only date string (yyyy-MM-dd)
    public static Date parseDate(String date) throws ParseException {
        if (date == null || date.trim().isEmpty()) return null;
        return DATE_FORMATTER.parse(date);
    }

    // Parse date and time string (yyyy-MM-dd HH:mm)
    public static Date parseDateTime(String dateTime) throws ParseException {
        if (dateTime == null || dateTime.trim().isEmpty()) return null;
        return DATE_TIME_FORMATTER.parse(dateTime);
    }
}
