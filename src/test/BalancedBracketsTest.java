package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void onlyOneOpenBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void moreOpenBracketsThanCloseBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

    @Test
    public void lessOpenBracketsThanCloseBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]]]"));
    }

    @Test
    public void emptyStringReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    public void stringWithNoBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

}
