import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class String2Test {

    private String2 string2Practice;
    @Before
    public void setUp() throws Exception {
        string2Practice = new String2();
    }


    @Test
    public void doubleChar() {
        assertThat(string2Practice.doubleChar("The"),is("TThhee"));
        assertThat(string2Practice.doubleChar("AAbb"),is("AAAAbbbb"));
        assertThat(string2Practice.doubleChar("Hi-There"),is("HHii--TThheerree"));
        assertThat(string2Practice.doubleChar("Word!"),is("WWoorrdd!!"));
        assertThat(string2Practice.doubleChar("!!"),is("!!!!"));
        assertThat(string2Practice.doubleChar(""),is(""));
        assertThat(string2Practice.doubleChar("a"),is("aa"));
        assertThat(string2Practice.doubleChar("."),is(".."));
        assertThat(string2Practice.doubleChar("aa"),is("aaaa"));

    }

}