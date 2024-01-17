import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateHandlerTest {

    DateHandler testingObj = new DateHandler();

    @Test
    void restituisciAnnoData() {
        String dateTime = "2023-03-01T13:00:00Z";

        Integer result = testingObj.restituisciAnno(dateTime);
        assertEquals(2023, result);
    }

    @Test
    void restituisciMeseData() {
        String dateTime = "2023-03-01T13:00:00Z";

        String result = testingObj.restituisciNomeMese(dateTime);
        assertEquals("marzo", result);
    }
    @Test
    void restituisciGiornoMese() {
        String dateTime = "2023-03-01T13:00:00Z";

        Integer result = testingObj.restituisciGiornoDelMese(dateTime);
        assertEquals(01, result);
    }

    @Test
    void restituisciGiornoSettimana() {
        String dateTime = "2023-03-01T13:00:00Z";

        String result = testingObj.restituisciGiornoSettimana(dateTime);
        assertEquals("mercoledì", result);
    }

    void eccezioneAnnoSeStringaNull(){
        String dateTime = null;
        try{
            testingObj.restituisciAnno(dateTime);
        } catch (NullPointerException e){
            System.out.println("Lancio NullPointer se la stringa da trasformare è null");
        }
    }
    void eccezioneMeseSeStringaNull(){
        String dateTime = null;
        try{
            testingObj.restituisciNomeMese(dateTime);
        } catch (NullPointerException e){
            System.out.println("Lancio NullPointer se la stringa da trasformare è null");
        }
    }

    void eccezioneGiornoMeseSeStringaNull(){
        String dateTime = null;
        try{
            testingObj.restituisciGiornoDelMese(dateTime);
        } catch (NullPointerException e){
            System.out.println("Lancio NullPointer se la stringa da trasformare è null");
        }
    }

    void eccezioneGiornoSettimanaSeStringaNull(){
        String dateTime = null;
        try{
            testingObj.restituisciGiornoSettimana(dateTime);
        } catch (NullPointerException e){
            System.out.println("Lancio NullPointer se la stringa da trasformare è null");
        }
    }
}