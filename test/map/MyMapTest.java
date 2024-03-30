package map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMapTest {

    private MyMap<String, Integer> myMap;

    @BeforeEach
    public void setUp() {
        myMap = new MyMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
    }

    @Test
    public void testPutAndGet() {
        myMap.put("Four", 4);
        assertEquals(4, myMap.get("Four"));
    }

    @Test
    public void testPutDuplicateKey() {
        myMap.put("Two", 22);
        assertEquals(22, myMap.get("Two"));
    }

    @Test
    public void testGetNonExistingKey() {
        assertNull(myMap.get("Five"));
    }

    @Test
    public void testRemove() {
        assertEquals(3, myMap.remove("Three"));
        assertNull(myMap.get("Three"));
    }

    @Test
    public void testRemoveNonExistingKey() {
        assertNull(myMap.remove("Five"));
    }
}
