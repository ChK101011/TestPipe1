package ma.ensa.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatriceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	main calc = new main();

    @Test
    void testAdd() {
        assertEquals(9, calc.add(4, 5));
    }

    @Test
    void testSub() {
        assertEquals(1, calc.sub(6, 5));
    }

    @Test
    void testMul() {
        assertEquals(24, calc.mul(4, 6));
    }

    @Test
    void testDiv() {
        assertEquals(5, calc.div(10, 2));
    }

    @Test
    void testDivByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.div(10, 0));
    }

}
