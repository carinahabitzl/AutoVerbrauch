import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    Auto auto;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        auto = new Auto("BMW", 2021, "45000", 2020);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Erster Test")
    void differenz() {
        assertEquals(1, auto.differenz());
    }
}