import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.set.Set;
import components.set.Set1L;

public class StringReassemblyTest {

    /* combination tests */
    @Test
    public void cobinationTest1() {
        String str1 = "";
        String str2 = "";
        int overlap = 0;
        String combo = StringReassembly.combination(str1, str2, overlap);
        assertEquals("", combo);
    }

    @Test
    public void cobinationTest2() {
        String str1 = "A";
        String str2 = "A";
        int overlap = 1;
        String combo = StringReassembly.combination(str1, str2, overlap);
        assertEquals("A", combo);
    }

    @Test
    public void cobinationTest3() {
        String str1 = "ABC";
        String str2 = "C";
        int overlap = 1;
        String combo = StringReassembly.combination(str1, str2, overlap);
        assertEquals("ABC", combo);
    }

    @Test
    public void cobinationTest4() {
        String str1 = "ABCDE";
        String str2 = "CDEF";
        int overlap = 3;
        String combo = StringReassembly.combination(str1, str2, overlap);
        assertEquals("ABCDEF", combo);
    }

    /* addToSetAvoidingSubstrings tests */
    @Test
    public void addToSetAvoidingSubstringsTest1() {
        Set<String> strSetIn = new Set1L<String>();
        strSetIn.add("he");
        String str = "hello";
        StringReassembly.addToSetAvoidingSubstrings(strSetIn, str);
        Set<String> strSetOut = new Set1L<String>();
        strSetOut.add("hello");
        assertEquals(strSetIn, strSetOut);
    }

    @Test
    public void addToSetAvoidingSubstringsTest2() {
        Set<String> strSetIn = new Set1L<String>();
        strSetIn.add("hello");
        String str = "he";
        StringReassembly.addToSetAvoidingSubstrings(strSetIn, str);
        Set<String> strSetOut = new Set1L<String>();
        strSetOut.add("hello");
        assertEquals(strSetIn, strSetOut);
    }

    @Test
    public void addToSetAvoidingSubstringsTest3() {
        Set<String> strSetIn = new Set1L<String>();
        String str = "he";
        StringReassembly.addToSetAvoidingSubstrings(strSetIn, str);
        Set<String> strSetOut = new Set1L<String>();
        strSetOut.add("he");
        assertEquals(strSetIn, strSetOut);
    }
}
