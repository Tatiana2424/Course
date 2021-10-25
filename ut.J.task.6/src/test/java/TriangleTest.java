import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void area() {
        Triangle triangle=new Triangle(3,4,5);
        assertEquals(6,triangle.area());
    }

    @org.junit.jupiter.api.Test
    void area2() {
        Triangle triangle=new Triangle(-1,-6,-4);
        assertEquals(0,triangle.area());
    }


    @org.junit.jupiter.api.Test
    void height() {
        Triangle triangle=new Triangle(3,4,6);
        assertEquals(2,triangle.height());
    }

    @org.junit.jupiter.api.Test
    void perimeter() {
        Triangle triangle=new Triangle(-3,-4,-5);
        assertEquals(0,triangle.perimeter());
    }

    @org.junit.jupiter.api.Test
    void perimeter2() {
        Triangle triangle=new Triangle(8,1,5);
        assertEquals(14,triangle.perimeter());
    }
}