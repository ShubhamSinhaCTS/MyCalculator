import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for AddNumbers utility
 * Tests all overloaded add methods for int, long, float, and double types
 */
@DisplayName("AddNumbers Test Suite")
public class AddNumbersTest {

    // ==================== Integer Tests ====================

    @Test
    @DisplayName("Should add two positive integers")
    public void testAddPositiveIntegers() {
        int result = AddNumbers.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    @DisplayName("Should add two negative integers")
    public void testAddNegativeIntegers() {
        int result = AddNumbers.add(-10, -20);
        assertEquals(-30, result);
    }

    @Test
    @DisplayName("Should add positive and negative integers")
    public void testAddMixedIntegers() {
        int result = AddNumbers.add(30, -10);
        assertEquals(20, result);
    }

    @Test
    @DisplayName("Should return zero when adding zero and zero (int)")
    public void testAddZeroIntegers() {
        int result = AddNumbers.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Should add integer with zero")
    public void testAddIntegerWithZero() {
        int result = AddNumbers.add(42, 0);
        assertEquals(42, result);
    }

    // ==================== Long Tests ====================

    @Test
    @DisplayName("Should add two positive long numbers")
    public void testAddPositiveLongs() {
        long result = AddNumbers.add(100000000L, 200000000L);
        assertEquals(300000000L, result);
    }

    @Test
    @DisplayName("Should add two negative long numbers")
    public void testAddNegativeLongs() {
        long result = AddNumbers.add(-100000000L, -200000000L);
        assertEquals(-300000000L, result);
    }

    @Test
    @DisplayName("Should add positive and negative long numbers")
    public void testAddMixedLongs() {
        long result = AddNumbers.add(500000000L, -200000000L);
        assertEquals(300000000L, result);
    }

    @Test
    @DisplayName("Should return zero when adding zero and zero (long)")
    public void testAddZeroLongs() {
        long result = AddNumbers.add(0L, 0L);
        assertEquals(0L, result);
    }

    @Test
    @DisplayName("Should handle large long values")
    public void testAddLargeLongs() {
        long result = AddNumbers.add(9000000000L, 1000000000L);
        assertEquals(10000000000L, result);
    }

    // ==================== Float Tests ====================

    @Test
    @DisplayName("Should add two positive float numbers")
    public void testAddPositiveFloats() {
        float result = AddNumbers.add(10.5f, 20.3f);
        assertEquals(30.8f, result, 0.01f);
    }

    @Test
    @DisplayName("Should add two negative float numbers")
    public void testAddNegativeFloats() {
        float result = AddNumbers.add(-10.5f, -20.3f);
        assertEquals(-30.8f, result, 0.01f);
    }

    @Test
    @DisplayName("Should add positive and negative float numbers")
    public void testAddMixedFloats() {
        float result = AddNumbers.add(50.75f, -20.25f);
        assertEquals(30.5f, result, 0.01f);
    }

    @Test
    @DisplayName("Should return zero when adding zero and zero (float)")
    public void testAddZeroFloats() {
        float result = AddNumbers.add(0.0f, 0.0f);
        assertEquals(0.0f, result, 0.01f);
    }

    @Test
    @DisplayName("Should handle float precision")
    public void testAddFloatPrecision() {
        float result = AddNumbers.add(0.1f, 0.2f);
        // Using delta for float comparison due to precision issues
        assertEquals(0.3f, result, 0.01f);
    }

    // ==================== Double Tests ====================

    @Test
    @DisplayName("Should add two positive double numbers")
    public void testAddPositiveDoubles() {
        double result = AddNumbers.add(15.75, 25.25);
        assertEquals(41.0, result, 0.001);
    }

    @Test
    @DisplayName("Should add two negative double numbers")
    public void testAddNegativeDoubles() {
        double result = AddNumbers.add(-15.75, -25.25);
        assertEquals(-41.0, result, 0.001);
    }

    @Test
    @DisplayName("Should add positive and negative double numbers")
    public void testAddMixedDoubles() {
        double result = AddNumbers.add(100.5, -50.3);
        assertEquals(50.2, result, 0.001);
    }

    @Test
    @DisplayName("Should return zero when adding zero and zero (double)")
    public void testAddZeroDoubles() {
        double result = AddNumbers.add(0.0, 0.0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    @DisplayName("Should handle double precision")
    public void testAddDoublePrecision() {
        double result = AddNumbers.add(0.1, 0.2);
        // Using delta for double comparison due to floating-point precision
        assertEquals(0.3, result, 0.001);
    }

    @Test
    @DisplayName("Should handle large double values")
    public void testAddLargeDoubles() {
        double result = AddNumbers.add(1e10, 2e10);
        assertEquals(3e10, result, 1e8);
    }

    // ==================== Edge Case Tests ====================

    @Test
    @DisplayName("Should handle maximum integer values")
    public void testAddMaxIntegers() {
        // Testing with values near max int, but not causing overflow
        int result = AddNumbers.add(1000000, 2000000);
        assertEquals(3000000, result);
    }

    @Test
    @DisplayName("Should handle minimum integer values")
    public void testAddMinIntegers() {
        // Testing with negative values
        int result = AddNumbers.add(-1000000, -2000000);
        assertEquals(-3000000, result);
    }

    @Test
    @DisplayName("Should handle very small float values")
    public void testAddSmallFloats() {
        float result = AddNumbers.add(0.001f, 0.002f);
        assertEquals(0.003f, result, 0.0001f);
    }

    @Test
    @DisplayName("Should handle very small double values")
    public void testAddSmallDoubles() {
        double result = AddNumbers.add(0.000001, 0.000002);
        assertEquals(0.000003, result, 0.0000001);
    }
}
