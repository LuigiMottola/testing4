import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateHandler {

    public Integer restituisciAnno(String dateTime) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTime);
        Integer year = offsetDateTime.getYear();
        return year;
    }

    public String restituisciNomeMese(String dateTime){
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTime);
        String monthAsString = offsetDateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);
        return monthAsString;
    }

    public Integer restituisciGiornoDelMese(String dateTime){
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTime);
        Integer dayOfMonth = offsetDateTime.getDayOfMonth();
        return dayOfMonth;
    }

    public String restituisciGiornoSettimana(String dateTime){
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTime);
        String dayOfWeek = offsetDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);
        return dayOfWeek;
    }

}