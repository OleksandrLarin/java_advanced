package lecture5.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class ApplicationTest {

    private Application tested = new Application();

    @Before
    public void setup() {
        tested.setName("Application.class");
        System.out.println("Set Up");
    }

    @After
    public void finish() {
        System.out.println("Finish");
    }

    @BeforeClass
    public static void init() {
        System.out.println("Initialize class");
    }

    @AfterClass
    public static void finalMethod() {
        System.out.println("After all tests");
    }

    @Test
    public void shouldReturnName() {
        String expected = "Application.class";

        String actual = tested.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBeTheSame() {
        String expected = new String("Application.class");

        String actual = tested.getName();

        assertNotSame(expected, actual);
    }

    @Test
    public void shouldBeTheSame() {
        String expected = new String("Application.class").intern();

        String actual = tested.getName();

        assertSame(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowAnExceptionWhenNameIsNull() {
        tested.setName(null);
    }

    @Test
    public void shouldThrowAnExceptionWhenNameIsEmptyString() {
        String expected = "Empty string is not allowed here!";
        try {
            tested.setName("");
        } catch (RuntimeException e) {
            assertEquals(expected, e.getMessage());
        }
    }

}
