package mappers;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
not to throw an error when date is in the future is intentional, due to transaction being pre-invoice
 */
public class DateMapper {
    public static ZonedDateTime zonedDateTimeFromString(final String s) throws DateTimeException {
        final String[] stringSplit = s.split("-");
        final Integer[] dateValues = new Integer[stringSplit.length];

        for (int i = 0; i < stringSplit.length; i++)
            dateValues[i] = Integer.valueOf(stringSplit[i]);

        return ZonedDateTime.of(
                dateValues[0],
                dateValues[1],
                dateValues[2],
                0,
                0,
                0,
                0,
                ZoneId.of("UTC"));
    }
}
