import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 *
<!--//# BEGIN TODO: Name, student ID, and date-->
<p><b>Boldizsar Keszthelyi, 1939718, 07/05/2024</b></p>
<!--//# END TODO-->
 */
public class CandyTest {

    static final Candy SUT = null; // to simplify method calls

    static final long MAX_VALUE = 999999999999999999L;

    /**
     * Checks the result of SUT.divide(k, c).
     */
    private void check(long k, long c, boolean expected) {
        System.out.println("divide(" + k + ", " + c + ")");
        long result = SUT.divide(k, c);
        System.out.println("  result = " + result);
        assertEquals(expected, 0 <= result, "possible (0 <= result)");
        if (0 <= result) {
            assertTrue(result <= MAX_VALUE, "range (result <= MAX_VALUE)");
            assertEquals(result * k, c, "quotient (result * k == c)");
        }
    }

    // Test cases

    /** The given example. */
    @Test
    public void testDivideGivenExample() {
        check(3, 15, true);
    }

//# BEGIN TODO: Additional test cases
    @Test
    public void testEqual() {
        check(3, 3, true);
    }
    
    @Test
    public void testRegular() {
        check(10, 30, true);
    }
    
    @Test
    public void testNotDivisible() {
        check(10, 31, false);
    }
    
    @Test
    public void testMoreKids() {
        check(4, 3, false);
    }
    
    @Test
    public void testNoKids() {
        check(0, 3, false);
    }
    
    @Test
    public void testNoCandy() {
        check(4, 0, true);
    }
    
    @Test
    public void testNegativeCandy() {
        check(4, -3, false);
    }
    
    @Test
    public void testNegativeKids() {
        check(-4, 3, false);
    }
    
    @Test
    public void testNegativeBoth() {
        check(-4, -3, false);
    }
    
    @Test
    public void testTooManyCandy() {
        check(4, 1000000000000000000L, false);
    }
    
    @Test
    public void testTooManyKids() {
        check(1000000000000000000L, 3, false);
    }
    
    @Test
    public void testTooManyBoth() {
        check(1000000000000000000L, 1000000000000000000L, false);
    }
//# END TODO

}
