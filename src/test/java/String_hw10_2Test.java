import org.junit.jupiter.api.*;

public class String_hw10_2Test {
    String_hw10_2 hw10_2;

    @BeforeEach
    void setUp() {
        hw10_2 = new String_hw10_2();
    }
    @Test
    public void stringToNumbersTestHappyPath(){
        String str = "1,2,3,4,5";
        int[] expected =  {1, 2, 3, 4, 5};
        int[] actual = String_hw10_2.stringToNumbers(str);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void stringToLettersTestHappyPath(){
        String str = "hgjhjbn/;'fdz233";
        String expected = "hgjhjbnfdz";
        String actual = String_hw10_2.stringToLetters("hgjhjbn/;'fdz233");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringToLettersAndSpacesTestHappyPath(){
        String str = "hgjhj bn/;'fdz233";
        String expected = "hgjhj bnfdz";
        String actual = String_hw10_2.stringToLettersAndSpaces("hgjhj bn/;'fdz233");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringToNumbers16TestHappyPath(){
        String str = "hgjhj bn/;'fdz233";
        String expected = "233";
        String actual = String_hw10_2.stringToNumbers16("hgjhj bn/;'fdz233");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stringToNumbersAndSpacesTestHappyPath(){
        String str = "hgjhj bn/;'fdz233";
        String expected = " 233";
        String actual = String_hw10_2.stringToNumbersAndSpaces("hgjhj bn/;'fdz233");
        Assertions.assertEquals(expected,actual);
    }

}
