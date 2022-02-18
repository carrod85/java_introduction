package ee.itcollage.level13;

import ee.itcollage.level11.Word;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class AnalisisResultTest {
    private List<String> words = Arrays.asList("radar", "cola");
    private PalindromeWords palin = new PalindromeWords();

    @Test
    void getResult() {
        AnalysisResult analisis = palin.analyzePalindromes(words);
        assertEquals(true,analisis.getPalindromes().contains("radar"));
    }
}
