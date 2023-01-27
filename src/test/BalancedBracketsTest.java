package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue() {
        String spec = "Tests whether a string contains equal numbers of [ and ]";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]");
        assertTrue(spec, actual);
    }
    @Test
    public void bracketOrderMatters() {
        String spec = "brackets should only appear in the correct order - open/close";
        boolean actual = BalancedBrackets.hasBalancedBrackets("][");
        assertFalse(spec, actual);
    }
    @Test
    public void singleBracketsReturnFalse() {
        String spec = "Tests whether a single bracket returns false";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[");
        assertFalse(spec, actual);
    }
    @Test
    public void encapsulatedStringReturnTrue() {
        String spec = "tests whether a string of multiple characters surrounded by [] if true";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[Launchcode]");
        assertTrue(spec, actual);
    }
    @Test
    public void sporadicEqualBracketsReturnTrue() {
        String spec = "test whether a word with equal brackets interspersed returns true";
        boolean actual = BalancedBrackets.hasBalancedBrackets("Launch[Code]");
        assertTrue(spec, actual);
    }
    @Test
    public void bracketBeginningReturnsFalse() {
        String spec = "test whether a word with bracket at beginning of word returns false";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[Launchcode");
        assertFalse(spec, actual);
    }
    @Test
    public void bracketEndReturnsFalse() {
        String spec = "test whether a word with bracket at end of word returns false";
        boolean actual = BalancedBrackets.hasBalancedBrackets("Launchcode]");
        assertFalse(spec, actual);
    }
    @Test
    public void bracketOpenInMiddleReturnFalse() {
        String spec = "test whether a word with open bracket in middle of word returns false";
        boolean actual = BalancedBrackets.hasBalancedBrackets("Launch[code");
        assertFalse(spec, actual);
    }
    @Test
    public void bracketClosedInMiddleReturnFalse() {
        String spec = "test whether a word with closed bracket in middle of word returns false";
        boolean actual = BalancedBrackets.hasBalancedBrackets("Launch]code");
        assertFalse(spec, actual);
    }
    @Test
    public void equalBracketsInUnequalOrderReturnFalse() {
        String spec = "test whether equal bracket amounts will return false if put in unequal order";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]][");
        assertFalse(spec, actual);
    }
    @Test
    public void equalBracketPairsReturnTrue() {
        String spec = "test whether equal bracket pairs return true";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[][][]");
        assertTrue(spec, actual);
    }
    @Test
    public void equalBracketNestedPairReturnTrue() {
        String spec = "test whether equal bracket pairs return true while nested";
        boolean actual = BalancedBrackets.hasBalancedBrackets("[[[]]]");
        assertTrue(spec, actual);
    }


}
