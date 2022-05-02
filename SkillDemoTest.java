import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void testGetLength(){
        assertEquals(4, SkillDemo.getLength("hello")); // failing test case
    }
}
