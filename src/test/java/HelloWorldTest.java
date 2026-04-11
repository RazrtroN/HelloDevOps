import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testHello() {
        assertEquals("Hello DevOps FINAL", HelloWorld.sayHello());
    }
}