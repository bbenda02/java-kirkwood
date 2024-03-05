import edu.kirkwood.codingbat.String1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class String1Test {
    // In-Class: 9 Challenges from String 1 Section
    @Test
    public void testHelloName() {
        String1 string1 = new String1();
        assertEquals("Hello Alice!", string1.helloName("Alice"));
        assertEquals("Hello Bob!", string1.helloName("Bob"));
    }

    @Test
    public void testMakeAbba() {
        String1 string1 = new String1();
        assertEquals("HiByeByeHi", string1.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", string1.makeAbba("Yo", "Alice"));
    }

    @Test
    public void testMakeTags() {
        String1 string1 = new String1();
        assertEquals("<i>Yay</i>", string1.makeTags("i", "Yay"));
        assertEquals("<body>Hello</body>", string1.makeTags("body", "Hello"));
    }

    @Test
    public void testMakeOutWord() {
        String1 string1 = new String1();
        assertEquals("<<Yay>>", string1.makeOutWord("<<>>", "Yay"));
        assertEquals("[[word]]", string1.makeOutWord("[[]]", "word"));
        assertEquals("{{Hello}}", string1.makeOutWord("{{}}", "Hello"));
    }

    @Test
    public void testExtraEnd() {
        String1 string1 = new String1();
        assertEquals("lololo", string1.extraEnd("Hello"));
        assertEquals("ababab", string1.extraEnd("ab"));
        assertEquals("HiHiHi", string1.extraEnd("Hi"));
    }

    @Test
    public void testFirstTwo() {
        String1 string1 = new String1();
        assertEquals("He", string1.firstTwo("Hello"));
        assertEquals("ab", string1.firstTwo("ab"));
        assertEquals("a", string1.firstTwo("a"));
    }

    @Test
    public void testFirstHalf() {
        String1 string1 = new String1();
        assertEquals("Woo", string1.firstHalf("WooHoo"));
        assertEquals("Hello", string1.firstHalf("HelloThere"));
        assertEquals("abc", string1.firstHalf("abcdef"));
    }

    @Test
    public void testWithoutEnd() {
        String1 string1 = new String1();
        assertEquals("ell", string1.withoutEnd("Hello"));
        assertEquals("av", string1.withoutEnd("java"));
        assertEquals("odin", string1.withoutEnd("coding"));
    }

    @Test
    public void testComboString() {
        String1 string1 = new String1();
        assertEquals("hiHellohi", string1.comboString("Hello", "hi"));
        assertEquals("hiHellohi", string1.comboString("hi", "Hello"));
        assertEquals("baaab", string1.comboString("aaa", "b"));
    }

}
