package mappers;

import enums.PackageSize;
import model.Transaction;

import java.time.DateTimeException;
import java.time.ZonedDateTime;

/*
it is assumed that transaction format will always be YYYY-MM-DD SIZE SUPPLIER
that is why it was chosen to keep index values as just numbers
 */
public class TransactionMapper {

    public static Transaction transactionFromString(final String s)
            throws DateTimeException, UnsupportedOperationException, IllegalStateException {

        final String[] stringSplit = s.split(" ");
        if (stringSplit.length != 3)
            throw new UnsupportedOperationException("Wrong transaction data");

        final ZonedDateTime date = DateMapper.zonedDateTimeFromString(stringSplit[0]);

        PackageSize size;
        try {
            size = PackageSize.from(stringSplit[1]);
        } catch (IllegalStateException e) {
            throw new IllegalStateException();
        }

        return new Transaction(
                date,
                size,
                stringSplit[2]
        );
    }
}
