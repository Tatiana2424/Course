import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void checkRange() {

            Main num= new Main();
            float actual=num.checkRange(3.5f);
            int expected=1;
            assertEquals(expected,actual,0.0f);

    }

    @org.junit.Test
    public void max() {
        Main num= new Main();
        int actual=num.Max(4,5,8);
        int expected=8;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void min() {
        Main num= new Main();
        int actual=num.Min(4,5,8);
        int expected=4;
        assertEquals(expected,actual);
    }
}