import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Programmieraufgabe4Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    void main() {
        Programmieraufgabe4.main(new String[] {});
        assertEquals("*******" + System.lineSeparator() + "******" + System.lineSeparator() + "....." + System.lineSeparator() + "****" + System.lineSeparator() + "***" + System.lineSeparator() + "**" + System.lineSeparator() + "*", outContent.toString().strip());
    }
}