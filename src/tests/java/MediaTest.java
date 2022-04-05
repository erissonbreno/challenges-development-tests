package tests.java;

import br.com.challenges.QA_Level_2.Media;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaTest {

    @Test
    public void shouldCalculateMediaWhenTheTwoNumbersAreCorrectly() {

    }

    @Test
    public void shouldShowErrorWhenNoteIsBiggerThan10() {

    }

    @Test
    public void shouldPresentFiveDecimalNumbersWhenMediaAreCalculated() {
        var expectedResult = "MEDIA = 6.59091";
        var actualResult = Media.mediaCalculate(10, 5);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldBeUsedDotAsDecimalSeparator() {

    }


}