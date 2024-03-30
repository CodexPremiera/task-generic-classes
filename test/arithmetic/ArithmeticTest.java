package arithmetic;

import arithmetic.Arithmetic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    /* FIELDS */
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;

    @BeforeEach
    public void setUp() {
        b = 100;
        s = 10000;
        i = 10000000;
        l = 10000000000L;
        f = 100.0f;
        d = 100.0;
    }

    @Test
    public void testAdd() {

        // Test addition with mixed types
        // Byte with Short
        Arithmetic<Short> byteShortArithmetic = new Arithmetic<>(b, s);
        assertEquals(10100, byteShortArithmetic.add().shortValue());

        // Byte with Integer
        Arithmetic<Integer> byteIntArithmetic = new Arithmetic<>(b, i);
        assertEquals(10000100, byteIntArithmetic.add().intValue());

        // Byte with Long
        Arithmetic<Long> byteLongArithmetic = new Arithmetic<>(b, l);
        assertEquals(10000000100L, byteLongArithmetic.add().longValue());

        // Byte with Float
        Arithmetic<Float> byteFloatArithmetic = new Arithmetic<>(b, f);
        assertEquals(200.0f, byteFloatArithmetic.add().floatValue());

        // Byte with Double
        Arithmetic<Double> byteDoubleArithmetic = new Arithmetic<>(b, d);
        assertEquals(200.0, byteDoubleArithmetic.add().doubleValue());

        // Short with Integer
        Arithmetic<Integer> shortIntArithmetic = new Arithmetic<>(s, i);
        assertEquals(10010000, shortIntArithmetic.add().intValue());

        // Short with Long
        Arithmetic<Long> shortLongArithmetic = new Arithmetic<>(s, l);
        assertEquals(10000010000L, shortLongArithmetic.add().longValue());

        // Short with Float
        Arithmetic<Float> shortFloatArithmetic = new Arithmetic<>(s, f);
        assertEquals(10100.0f, shortFloatArithmetic.add().floatValue());

        // Short with Double
        Arithmetic<Double> shortDoubleArithmetic = new Arithmetic<>(s, d);
        assertEquals(10100.0, shortDoubleArithmetic.add().doubleValue());

        // Integer with Long
        Arithmetic<Long> intLongArithmetic = new Arithmetic<>(i, l);
        assertEquals(10010000000L, intLongArithmetic.add().longValue());

        // Integer with Float
        Arithmetic<Float> intFloatArithmetic = new Arithmetic<>(i, f);
        assertEquals(10000100.0f, intFloatArithmetic.add().floatValue());

        // Integer with Double
        Arithmetic<Double> intDoubleArithmetic = new Arithmetic<>(i, d);
        assertEquals(1.00001E7, intDoubleArithmetic.add().doubleValue());

        // Long with Float
        Arithmetic<Float> longFloatArithmetic = new Arithmetic<>(l, f);
        assertEquals(10000000100.0f, longFloatArithmetic.add().floatValue());

        // Long with Double
        Arithmetic<Double> longDoubleArithmetic = new Arithmetic<>(l, d);
        assertEquals(10000000100.0, longDoubleArithmetic.add().doubleValue());

        // Float with Double
        Arithmetic<Double> floatDoubleArithmetic = new Arithmetic<>(f, d);
        assertEquals(200.0, floatDoubleArithmetic.add().doubleValue());
    }

    @Test
    public void testSubtract() {
        // Test subtraction with mixed types
        // Byte with Short
        Arithmetic<Short> byteShortArithmetic = new Arithmetic<>(b, s);
        assertEquals(-9900, byteShortArithmetic.subtract().shortValue());

        // Byte with Integer
        Arithmetic<Integer> byteIntArithmetic = new Arithmetic<>(b, i);
        assertEquals(-9999900, byteIntArithmetic.subtract().intValue());

        // Byte with Long
        Arithmetic<Long> byteLongArithmetic = new Arithmetic<>(b, l);
        assertEquals(-9999999900L, byteLongArithmetic.subtract().longValue());

        // Byte with Float
        Arithmetic<Float> byteFloatArithmetic = new Arithmetic<>(b, f);
        assertEquals(0.0f, byteFloatArithmetic.subtract().floatValue());

        // Byte with Double
        Arithmetic<Double> byteDoubleArithmetic = new Arithmetic<>(b, d);
        assertEquals(0.0, byteDoubleArithmetic.subtract().doubleValue());

        // Short with Integer
        Arithmetic<Integer> shortIntArithmetic = new Arithmetic<>(s, i);
        assertEquals(-9990000, shortIntArithmetic.subtract().intValue());

        // Short with Long
        Arithmetic<Long> shortLongArithmetic = new Arithmetic<>(s, l);
        assertEquals(-9999990000L, shortLongArithmetic.subtract().longValue());

        // Short with Float
        Arithmetic<Float> shortFloatArithmetic = new Arithmetic<>(s, f);
        assertEquals(9900.0f, shortFloatArithmetic.subtract().floatValue());

        // Short with Double
        Arithmetic<Double> shortDoubleArithmetic = new Arithmetic<>(s, d);
        assertEquals(9900.0, shortDoubleArithmetic.subtract().doubleValue());

        // Integer with Long
        Arithmetic<Long> intLongArithmetic = new Arithmetic<>(i, l);
        assertEquals(-9990000000L, intLongArithmetic.subtract().longValue());

        // Integer with Float
        Arithmetic<Float> intFloatArithmetic = new Arithmetic<>(i, f);
        assertEquals(9999900.0f, intFloatArithmetic.subtract().floatValue());

        // Integer with Double
        Arithmetic<Double> intDoubleArithmetic = new Arithmetic<>(i, d);
        assertEquals(9999900.0, intDoubleArithmetic.subtract().doubleValue());

        // Long with Float
        Arithmetic<Float> longFloatArithmetic = new Arithmetic<>(l, f);
        assertEquals(9999999900.0f, longFloatArithmetic.subtract().floatValue());

        // Long with Double
        Arithmetic<Double> longDoubleArithmetic = new Arithmetic<>(l, d);
        assertEquals(9999999900.0, longDoubleArithmetic.subtract().doubleValue());

        // Float with Double
        Arithmetic<Double> floatDoubleArithmetic = new Arithmetic<>(f, d);
        assertEquals(0.0, floatDoubleArithmetic.subtract().doubleValue());
    }


    @Test
    public void testMultiply() {
        // Test multiplication with mixed types

        // Byte with Integer
        Arithmetic<Integer> byteIntArithmetic = new Arithmetic<>(b, i);
        assertEquals(1000000000, byteIntArithmetic.multiply().intValue());

        // Byte with Long
        Arithmetic<Long> byteLongArithmetic = new Arithmetic<>(b, l);
        assertEquals(1000000000000L, byteLongArithmetic.multiply().longValue());

        // Byte with Float
        Arithmetic<Float> byteFloatArithmetic = new Arithmetic<>(b, f);
        assertEquals(10000.0f, byteFloatArithmetic.multiply().floatValue());

        // Byte with Double
        Arithmetic<Double> byteDoubleArithmetic = new Arithmetic<>(b, d);
        assertEquals(10000.0, byteDoubleArithmetic.multiply().doubleValue());

        // Short with Long
        Arithmetic<Long> shortLongArithmetic = new Arithmetic<>(s, l);
        assertEquals(100000000000000L, shortLongArithmetic.multiply().longValue());

        // Short with Float
        Arithmetic<Float> shortFloatArithmetic = new Arithmetic<>(s, f);
        assertEquals(1000000.0f, shortFloatArithmetic.multiply().floatValue());

        // Short with Double
        Arithmetic<Double> shortDoubleArithmetic = new Arithmetic<>(s, d);
        assertEquals(1000000.0, shortDoubleArithmetic.multiply().doubleValue());

        // Integer with Long
        Arithmetic<Long> intLongArithmetic = new Arithmetic<>(i, l);
        assertEquals(100000000000000000L, intLongArithmetic.multiply().longValue());

        // Integer with Float
        Arithmetic<Float> intFloatArithmetic = new Arithmetic<>(i, f);
        assertEquals(1000000000.0f, intFloatArithmetic.multiply().floatValue());

        // Integer with Double
        Arithmetic<Double> intDoubleArithmetic = new Arithmetic<>(i, d);
        assertEquals(1000000000.0, intDoubleArithmetic.multiply().doubleValue());

        // Long with Float
        Arithmetic<Float> longFloatArithmetic = new Arithmetic<>(l, f);
        assertEquals(1000000000000.0f, longFloatArithmetic.multiply().floatValue());

        // Long with Double
        Arithmetic<Double> longDoubleArithmetic = new Arithmetic<>(l, d);
        assertEquals(1000000000000.0, longDoubleArithmetic.multiply().doubleValue());

        // Float with Double
        Arithmetic<Double> floatDoubleArithmetic = new Arithmetic<>(f, d);
        assertEquals(10000.0, floatDoubleArithmetic.multiply().doubleValue());
    }


    @Test
    public void testDivide() {
        // Test division with mixed types

        // Byte with Integer
        Arithmetic<Integer> byteIntArithmetic = new Arithmetic<>(b, i);
        assertEquals(0.00001, byteIntArithmetic.divide().doubleValue());

        // Byte with Long
        Arithmetic<Long> byteLongArithmetic = new Arithmetic<>(b, l);
        assertEquals(0.00000001, byteLongArithmetic.divide().doubleValue());

        // Byte with Float
        Arithmetic<Float> byteFloatArithmetic = new Arithmetic<>(b, f);
        assertEquals(1.0, byteFloatArithmetic.divide().doubleValue());

        // Byte with Double
        Arithmetic<Double> byteDoubleArithmetic = new Arithmetic<>(b, d);
        assertEquals(1.0, byteDoubleArithmetic.divide().doubleValue());

        // Short with Long
        Arithmetic<Long> shortLongArithmetic = new Arithmetic<>(s, l);
        assertEquals(0.000001, shortLongArithmetic.divide().doubleValue());

        // Short with Float
        Arithmetic<Float> shortFloatArithmetic = new Arithmetic<>(s, f);
        assertEquals(100.0, shortFloatArithmetic.divide().doubleValue());

        // Short with Double
        Arithmetic<Double> shortDoubleArithmetic = new Arithmetic<>(s, d);
        assertEquals(100.0, shortDoubleArithmetic.divide().doubleValue());

        // Integer with Long
        Arithmetic<Long> intLongArithmetic = new Arithmetic<>(i, l);
        assertEquals(0.001, intLongArithmetic.divide().doubleValue());

        // Integer with Float
        Arithmetic<Float> intFloatArithmetic = new Arithmetic<>(i, f);
        assertEquals(100000.0, intFloatArithmetic.divide().doubleValue());

        // Integer with Double
        Arithmetic<Double> intDoubleArithmetic = new Arithmetic<>(i, d);
        assertEquals(100000.0, intDoubleArithmetic.divide().doubleValue());

        // Long with Float
        Arithmetic<Float> longFloatArithmetic = new Arithmetic<>(l, f);
        assertEquals(100000000.0, longFloatArithmetic.divide().doubleValue());

        // Long with Double
        Arithmetic<Double> longDoubleArithmetic = new Arithmetic<>(l, d);
        assertEquals(100000000.0, longDoubleArithmetic.divide().doubleValue());

        // Float with Double
        Arithmetic<Double> floatDoubleArithmetic = new Arithmetic<>(f, d);
        assertEquals(1.0, floatDoubleArithmetic.divide().doubleValue());

        // Test division by zero
        Arithmetic<Integer> zeroIntArithmetic = new Arithmetic<>(i, 0);
        assertThrows(ArithmeticException.class, zeroIntArithmetic::divide);

        Arithmetic<Long> zeroLongArithmetic = new Arithmetic<>(l, 0);
        assertThrows(ArithmeticException.class, zeroLongArithmetic::divide);

        Arithmetic<Float> zeroFloatArithmetic = new Arithmetic<>(f, 0);
        assertThrows(ArithmeticException.class, zeroFloatArithmetic::divide);

        Arithmetic<Double> zeroDoubleArithmetic = new Arithmetic<>(d, 0);
        assertThrows(ArithmeticException.class, zeroDoubleArithmetic::divide);
    }


    @Test
    public void testGetMinAndMax() {
        // Test getMin() and getMax() with mixed types

        // Byte with Integer
        Arithmetic<Integer> byteIntArithmetic = new Arithmetic<>(b, i);
        assertEquals(100, byteIntArithmetic.getMin().intValue());
        assertEquals(10000000, byteIntArithmetic.getMax().intValue());

        // Byte with Long
        Arithmetic<Long> byteLongArithmetic = new Arithmetic<>(b, l);
        assertEquals(100, byteLongArithmetic.getMin().longValue());
        assertEquals(10000000000L, byteLongArithmetic.getMax().longValue());

        // Byte with Float
        Arithmetic<Float> byteFloatArithmetic = new Arithmetic<>(b, f);
        assertEquals(100.0f, byteFloatArithmetic.getMin().floatValue());
        assertEquals(100.0f, byteFloatArithmetic.getMax().floatValue());

        // Byte with Double
        Arithmetic<Double> byteDoubleArithmetic = new Arithmetic<>(b, d);
        assertEquals(100.0, byteDoubleArithmetic.getMin().doubleValue());
        assertEquals(100.0, byteDoubleArithmetic.getMax().doubleValue());

        // Short with Long
        Arithmetic<Long> shortLongArithmetic = new Arithmetic<>(s, l);
        assertEquals(10000, shortLongArithmetic.getMin().longValue());
        assertEquals(10000000000L, shortLongArithmetic.getMax().longValue());

        // Short with Float
        Arithmetic<Float> shortFloatArithmetic = new Arithmetic<>(s, f);
        assertEquals(100.0f, shortFloatArithmetic.getMin().floatValue());
        assertEquals(10000.0f, shortFloatArithmetic.getMax().floatValue());

        // Short with Double
        Arithmetic<Double> shortDoubleArithmetic = new Arithmetic<>(s, d);
        assertEquals(100.0, shortDoubleArithmetic.getMin().doubleValue());
        assertEquals(10000.0, shortDoubleArithmetic.getMax().doubleValue());

        // Integer with Long
        Arithmetic<Long> intLongArithmetic = new Arithmetic<>(i, l);
        assertEquals(10000000, intLongArithmetic.getMin().longValue());
        assertEquals(10000000000L, intLongArithmetic.getMax().longValue());

        // Integer with Float
        Arithmetic<Float> intFloatArithmetic = new Arithmetic<>(i, f);
        assertEquals(100.0f, intFloatArithmetic.getMin().floatValue());
        assertEquals(10000000.0f, intFloatArithmetic.getMax().floatValue());

        // Integer with Double
        Arithmetic<Double> intDoubleArithmetic = new Arithmetic<>(i, d);
        assertEquals(100.0, intDoubleArithmetic.getMin().doubleValue());
        assertEquals(10000000.0, intDoubleArithmetic.getMax().doubleValue());

        // Long with Float
        Arithmetic<Float> longFloatArithmetic = new Arithmetic<>(l, f);
        assertEquals(100.0f, longFloatArithmetic.getMin().floatValue());
        assertEquals(10000000000.0f, longFloatArithmetic.getMax().floatValue());

        // Long with Double
        Arithmetic<Double> longDoubleArithmetic = new Arithmetic<>(l, d);
        assertEquals(100.0, longDoubleArithmetic.getMin().doubleValue());
        assertEquals(10000000000.0, longDoubleArithmetic.getMax().doubleValue());

        // Float with Double
        Arithmetic<Double> floatDoubleArithmetic = new Arithmetic<>(f, d);
        assertEquals(100.0, floatDoubleArithmetic.getMin().doubleValue());
        assertEquals(100.0, floatDoubleArithmetic.getMax().doubleValue());
    }
}
