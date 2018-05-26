import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class WarmupTest {
    private Warmup warmupPractice;

    @Before
    public void setUp() throws Exception {
        warmupPractice = new Warmup();
    }

    @Test
    public void stringTimes() {
        String actual = warmupPractice.stringTimes("Hi", 2);
        String expected = "HiHi";

        assertThat(actual,is(expected));

        assertThat(warmupPractice.stringTimes("Hi", 3),is("HiHiHi"));
        assertThat(warmupPractice.stringTimes("Hi", 1),is("Hi"));
        assertThat(warmupPractice.stringTimes("Hi", 0),is(""));
        assertThat(warmupPractice.stringTimes("Hi", 5),is("HiHiHiHiHi"));
        assertThat(warmupPractice.stringTimes("Oh Boy!", 2),is("Oh Boy!Oh Boy!"));
        assertThat(warmupPractice.stringTimes("x", 4),is("xxxx"));
        assertThat(warmupPractice.stringTimes("", 4),is(""));
        assertThat(warmupPractice.stringTimes("code", 2),is("codecode"));
        assertThat(warmupPractice.stringTimes("code", 3),is("codecodecode"));
    }

    @Test
    public void frontTimes() {
        assertThat(warmupPractice.frontTimes("Chocolate", 2),is("ChoCho"));
        assertThat(warmupPractice.frontTimes("Chocolate", 3),is("ChoChoCho"));
        assertThat(warmupPractice.frontTimes("Abc", 3),is("AbcAbcAbc"));
        assertThat(warmupPractice.frontTimes("Ab", 4),is("AbAbAbAb"));
        assertThat(warmupPractice.frontTimes("A", 4),is("AAAA"));
        assertThat(warmupPractice.frontTimes("", 4),is(""));
        assertThat(warmupPractice.frontTimes("Abc", 0),is(""));
    }

    @Test
    public void countXX() {
        assertThat(warmupPractice.countXX("abcxx"),is(1));
        assertThat(warmupPractice.countXX("xxx"),is(2));
        assertThat(warmupPractice.countXX("xxxx"),is(3));
        assertThat(warmupPractice.countXX("abc"),is(0));
        assertThat(warmupPractice.countXX("Hello there"),is(0));
        assertThat(warmupPractice.countXX("Hexxo thxxe"),is(2));
        assertThat(warmupPractice.countXX(""),is(0));
        assertThat(warmupPractice.countXX("Kittens"),is(0));
        assertThat(warmupPractice.countXX("Kittensxxx"),is(2));
    }

    @Test
    public void doubleX() {
        assertThat(warmupPractice.doubleX("axxbb"),is(true));
        assertThat(warmupPractice.doubleX("axaxax"),is(false));
        assertThat(warmupPractice.doubleX("xxxxx"),is(true));
        assertThat(warmupPractice.doubleX("xaxxx"),is(false));
        assertThat(warmupPractice.doubleX("aaaax"),is(false));
        assertThat(warmupPractice.doubleX(""),is(false));
        assertThat(warmupPractice.doubleX("abc"),is(false));
        assertThat(warmupPractice.doubleX("x"),is(false));
        assertThat(warmupPractice.doubleX("xx"),is(true));
        assertThat(warmupPractice.doubleX("xax"),is(false));
        assertThat(warmupPractice.doubleX("xaxx"),is(false));
    }

    @Test
    public void stringBits() {
        assertThat(warmupPractice.stringBits("Hello"),is("Hlo"));
        assertThat(warmupPractice.stringBits("Hi"),is("H"));
        assertThat(warmupPractice.stringBits("Heeololeo"),is("Hello"));
        assertThat(warmupPractice.stringBits("HiHiHi"),is("HHH"));
        assertThat(warmupPractice.stringBits(""),is(""));
        assertThat(warmupPractice.stringBits("Greetings"),is("Getns"));
        assertThat(warmupPractice.stringBits("Chocoate"),is("Coot"));
        assertThat(warmupPractice.stringBits("pi"),is("p"));
        assertThat(warmupPractice.stringBits("Hello Kitten"),is("HloKte"));
        assertThat(warmupPractice.stringBits("hxaxpxpxy"),is("happy"));
    }

    @Test
    public void stringSplosion() {
        assertThat(warmupPractice.stringSplosion("Code"),is("CCoCodCode"));
        assertThat(warmupPractice.stringSplosion("abc"),is("aababc"));
        assertThat(warmupPractice.stringSplosion("ab"),is("aab"));
        assertThat(warmupPractice.stringSplosion("x"),is("x"));
        assertThat(warmupPractice.stringSplosion("fade"),is("ffafadfade"));
        assertThat(warmupPractice.stringSplosion("There"),is("TThTheTherThere"));
        assertThat(warmupPractice.stringSplosion("Kitten"),is("KKiKitKittKitteKitten"));
        assertThat(warmupPractice.stringSplosion("Bye"),is("BByBye"));
        assertThat(warmupPractice.stringSplosion("Good"),is("GGoGooGood"));
        assertThat(warmupPractice.stringSplosion("Bad"),is("BBaBad"));
    }
}