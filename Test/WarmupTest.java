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

    @Test
    public void last2() {
        assertThat(warmupPractice.last2("hixxhi"),is(1));
        assertThat(warmupPractice.last2("xaxxaxaxx"),is(1));
        assertThat(warmupPractice.last2("axxxaaxx"),is(2));
        assertThat(warmupPractice.last2("xxaxxaxxaxx"),is(3));
        assertThat(warmupPractice.last2("xaxaxaxx"),is(0));
        assertThat(warmupPractice.last2("xxxx"),is(2));
        assertThat(warmupPractice.last2("13121312"),is(1));
        assertThat(warmupPractice.last2("11212"),is(1));
        assertThat(warmupPractice.last2("13121311"),is(0));
        assertThat(warmupPractice.last2("1717171"),is(2));
        assertThat(warmupPractice.last2("hi"),is(0));
        assertThat(warmupPractice.last2("h"),is(0));
        assertThat(warmupPractice.last2(""),is(0));
    }

    @Test
    public void arryCount9() {
        assertThat(warmupPractice.arrayCount9(new int[]{1,2,9}),is(1));
        assertThat(warmupPractice.arrayCount9(new int[]{1,9,9}),is(2));
        assertThat(warmupPractice.arrayCount9(new int[]{1,9,9,3,9}),is(3));
        assertThat(warmupPractice.arrayCount9(new int[]{1,2,3}),is(0));
        assertThat(warmupPractice.arrayCount9(new int[]{}),is(0));
        assertThat(warmupPractice.arrayCount9(new int[]{4, 2, 4, 3, 1}),is(0));
        assertThat(warmupPractice.arrayCount9(new int[]{9, 2, 4, 3, 1}),is(1));
    }

    @Test
    public void arrayFront9() {
        assertThat(warmupPractice.arrayFront9(new int[]{1, 2, 9, 3, 4}),is(true));
        assertThat(warmupPractice.arrayFront9(new int[]{1, 2, 3, 4, 9}),is(false));
        assertThat(warmupPractice.arrayFront9(new int[]{1, 2, 3, 4, 5}),is(false));
        assertThat(warmupPractice.arrayFront9(new int[]{9, 2, 3}),is(true));
        assertThat(warmupPractice.arrayFront9(new int[]{1, 9, 9}),is(true));
        assertThat(warmupPractice.arrayFront9(new int[]{1, 2, 3}),is(false));
        assertThat(warmupPractice.arrayFront9(new int[]{1, 9}),is(true));
        assertThat(warmupPractice.arrayFront9(new int[]{5, 5}),is(false));
        assertThat(warmupPractice.arrayFront9(new int[]{2}),is(false));
        assertThat(warmupPractice.arrayFront9(new int[]{9}),is(true));
        assertThat(warmupPractice.arrayFront9(new int[]{}),is(false));
        assertThat(warmupPractice.arrayFront9(new int[]{3, 9, 2, 3, 3}),is(true));
    }

    @Test
    public void array123() {
        assertThat(warmupPractice.array123(new int[]{1, 1, 2, 3, 1}), is(true));
        assertThat(warmupPractice.array123(new int[]{1, 1, 2, 4, 1}), is(false));
        assertThat(warmupPractice.array123(new int[]{1, 1, 2, 1, 2, 3}), is(true));
        assertThat(warmupPractice.array123(new int[]{1, 1, 2, 1, 2, 1}), is(false));
        assertThat(warmupPractice.array123(new int[]{1, 2, 3, 1, 2, 3}), is(true));
        assertThat(warmupPractice.array123(new int[]{1, 2, 3}), is(true));
        assertThat(warmupPractice.array123(new int[]{1, 1, 1}), is(false));
        assertThat(warmupPractice.array123(new int[]{1, 2}), is(false));
        assertThat(warmupPractice.array123(new int[]{1}), is(false));
        assertThat(warmupPractice.array123(new int[]{}), is(false));
    }

    @Test
    public void stringMatch() {
        assertThat(warmupPractice.stringMatch("xxcaazz", "xxbaaz"), is(3));
        assertThat(warmupPractice.stringMatch("abc", "abc"), is(2));
        assertThat(warmupPractice.stringMatch("abc", "axc"), is(0));
        assertThat(warmupPractice.stringMatch("hello", "he"), is(1));
        assertThat(warmupPractice.stringMatch("he", "hello"), is(1));
        assertThat(warmupPractice.stringMatch("h", "hello"), is(0));
        assertThat(warmupPractice.stringMatch("", "hello"), is(0));
        assertThat(warmupPractice.stringMatch("aabbccdd", "abbbxxd"), is(1));
        assertThat(warmupPractice.stringMatch("aaxxaaxx", "iaxxai"), is(3));
        assertThat(warmupPractice.stringMatch("iaxxai", "aaxxaaxx"), is(3));
    }

    @Test
    public void stringX() {
        assertThat(warmupPractice.stringX("xxHxix"),is("xHix"));
        assertThat(warmupPractice.stringX("abxxxcd"),is("abcd"));
        assertThat(warmupPractice.stringX("xabxxxcdx"),is("xabcdx"));
        assertThat(warmupPractice.stringX("xKittenx"),is("xKittenx"));
        assertThat(warmupPractice.stringX("Hello"),is("Hello"));
        assertThat(warmupPractice.stringX("xx"),is("xx"));
        assertThat(warmupPractice.stringX("x"),is("x"));
        assertThat(warmupPractice.stringX(""),is(""));
    }

    @Test
    public void altPairs() {
        assertThat(warmupPractice.altPairs("kitten"), is("kien"));
        assertThat(warmupPractice.altPairs("Chocolate"), is("Chole"));
        assertThat(warmupPractice.altPairs("CodingHorror"), is("Congrr"));
        assertThat(warmupPractice.altPairs("yak"), is("ya"));
        assertThat(warmupPractice.altPairs("ya"), is("ya"));
        assertThat(warmupPractice.altPairs("y"), is("y"));
        assertThat(warmupPractice.altPairs(""), is(""));
        assertThat(warmupPractice.altPairs("ThisThatTheOther"), is("ThThThth"));
    }

    @Test
    public void stringYak() {
        assertThat(warmupPractice.stringYak("yakpak"), is("pak"));
        assertThat(warmupPractice.stringYak("pakyak"), is("pak"));
        assertThat(warmupPractice.stringYak("yak123ya"), is("123ya"));
        assertThat(warmupPractice.stringYak("yak"), is(""));
        assertThat(warmupPractice.stringYak("yakxxxyak"), is("xxx"));
        assertThat(warmupPractice.stringYak("HiyakHi"), is( "HiHi"));
        assertThat(warmupPractice.stringYak("xxxyakyyyakzzz"), is("xxxyyzzz"	));
    }

    @Test
    public void array667() {
        assertThat(warmupPractice.array667(new int[]{6, 6, 2}), is(1));
        assertThat(warmupPractice.array667(new int[]{6, 6, 2, 6}), is(1));
        assertThat(warmupPractice.array667(new int[]{6, 7, 2, 6}), is(1));
        assertThat(warmupPractice.array667(new int[]{6, 6, 2, 6, 7}), is(2));
        assertThat(warmupPractice.array667(new int[]{1, 6, 3}), is(0));
        assertThat(warmupPractice.array667(new int[]{6, 1}), is(0));
        assertThat(warmupPractice.array667(new int[]{}), is(0));
        assertThat(warmupPractice.array667(new int[]{3, 6, 7, 6}), is(1));
        assertThat(warmupPractice.array667(new int[]{3, 6, 6, 7}), is(2));
        assertThat(warmupPractice.array667(new int[]{6, 3, 6, 6}), is(1));
        assertThat(warmupPractice.array667(new int[]{6, 7, 6, 6}), is(2));
        assertThat(warmupPractice.array667(new int[]{1, 2, 3, 5, 6}), is(0));
        assertThat(warmupPractice.array667(new int[]{1, 2, 3, 6, 6}), is(1));
    }

    @Test
    public void noTriples() {
        assertThat(warmupPractice.noTriples(new int[]{1, 1, 2, 2, 1}), is(true));
        assertThat(warmupPractice.noTriples(new int[]{1, 1, 2, 2, 2, 1}), is(false));
        assertThat(warmupPractice.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}), is(false));
        assertThat(warmupPractice.noTriples(new int[]{1, 1, 2, 2, 1, 2, 1}), is(true));
        assertThat(warmupPractice.noTriples(new int[]{1, 2, 1}), is(true));
        assertThat(warmupPractice.noTriples(new int[]{1, 1, 1}), is(false));
        assertThat(warmupPractice.noTriples(new int[]{1, 1}), is(true));
        assertThat(warmupPractice.noTriples(new int[]{1}), is(true));
        assertThat(warmupPractice.noTriples(new int[]{}), is(true));

    }

    @Test
    public void has271() {
        assertThat(warmupPractice.has271(new int[]{1, 2, 7, 1}), is(true));
        assertThat(warmupPractice.has271(new int[]{1, 2, 8, 1}), is(false));
        assertThat(warmupPractice.has271(new int[]{2, 7, 1}), is(true));
        assertThat(warmupPractice.has271(new int[]{3, 8, 2}), is(true));
        assertThat(warmupPractice.has271(new int[]{2, 7, 3}), is(true));
        assertThat(warmupPractice.has271(new int[]{2, 7, 4}), is(false));
        assertThat(warmupPractice.has271(new int[]{2, 7, -1}), is(true));
        assertThat(warmupPractice.has271(new int[]{2, 7, -2}), is(false));
        assertThat(warmupPractice.has271(new int[]{4, 5, 3, 8, 0}), is(true));
        assertThat(warmupPractice.has271(new int[]{2, 7, 5, 10, 4}), is(true));
        assertThat(warmupPractice.has271(new int[]{2, 7, 5, 10, 1}), is(false));
        assertThat(warmupPractice.has271(new int[]{2, 7, -2, 4, 10, 2}), is(false));
        assertThat(warmupPractice.has271(new int[]{1, 1, 4, 9, 0}), is(false));
        assertThat(warmupPractice.has271(new int[]{1, 1, 4, 9, 4, 9, 2}), is(true));
    }


}