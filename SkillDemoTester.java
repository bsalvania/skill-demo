import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void testMultiplication(){
        assertEquals(10, SkillDemo.multiplication(2, 5));
    }
}
