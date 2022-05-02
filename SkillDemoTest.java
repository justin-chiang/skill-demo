import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void testGetLength(){
        assertEquals(5, SkillDemo.getLength("hello")); // working test case
    }
}

