import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import controllers.MainController;

public class TestWeight {
    MainController mc;

    @BeforeEach
    public void initEach() {
        mc = new MainController();
    }

    @Test
    public void testCalcWeight01() {
        double actual = mc.calcWeight(30, 35);
        double expected = 2.6521848951755493;
        assertEquals(expected, actual, 0.01);
    }

    @Test

    public void testCalclWeigth02() {
        double actual = mc.calcWeight(130, 135);
        double expected = 192.0939631220005;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalclWeigth03() {
        double actual = mc.calcWeight(150, 160);
        double expected = 303.1068451629199;
        assertEquals(expected, actual, 0.01);
    }
}
