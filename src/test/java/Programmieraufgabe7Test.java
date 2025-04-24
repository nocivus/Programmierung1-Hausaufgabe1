import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Programmieraufgabe7Test {
    @Test
    void getMax() {
        assertEquals(0, Programmieraufgabe7.getMax(0, 0, 0));
        assertEquals(7, Programmieraufgabe7.getMax(0, 7, 0));
        assertEquals(109, Programmieraufgabe7.getMax(12, 99, 109));
        assertEquals(33, Programmieraufgabe7.getMax(33, 12, 31));
        assertEquals(34, Programmieraufgabe7.getMax(33, 34, 34));
    }
}