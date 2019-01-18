import static org.junit.Assert.*;
import org.junit.Test;


public class FlikTest {

    /**
     * Test if two number is the same
     */
    @Test
    public void testIsSameNumber() {
        assertTrue(Flik.isSameNumber(1, 1));
        assertTrue(Flik.isSameNumber(255, 255));
        assertTrue(Flik.isSameNumber(128, 128));
    }
}
