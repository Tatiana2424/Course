import static org.junit.Assert.*;

public class MainTest1 {

    @org.junit.Test
    public void l() {
        Main num= new Main();
        int actual=num.l(2,7,9);
        int expected=3;
        assertEquals(expected,actual);
    }
    @org.junit.Test
    public void l2() {
        Main num= new Main();
        int actual=num.l(8,7,1);
        int expected=1;
        assertEquals(expected,actual);
    }


    @org.junit.Test
    public void f() {
        Main num= new Main();
        Object actual=num.f("Anna","Archi","Anna");
        Object expected="Is dogs with the same name";
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void f2() {
        Main num= new Main();
        Object actual=num.f("Mia","Archi","Anna");
        Object expected="Is not dogs with the same name";
        assertEquals(expected,actual);
    }
}