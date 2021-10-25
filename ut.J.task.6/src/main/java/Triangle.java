public class Triangle {

    private int a;
    private int b;
    private int c;
    private int hashCodeTriangle = 0;

    public Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }
    public Triangle(int a, int b,int c) {
        if(a < 0) {
            System.out.println("Error");
            this.a = 0;
        }else {
            this.a = a;
        }
        if(b < 0) {
            System.out.println("Error");
            this.b = 0;
        } else {
            this.b = b;
        }
        if(c < 0) {
            System.out.println("Error");
            this.c = 0;
        } else {
            this.c = c;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        if (a < 0) {
            System.out.println("Error");
            this.a = 0;
        } else {
            this.a = a;
        }
    }
    public void setB(int b) {
        if (b < 0) {
            System.out.println("Error");
            this.b = 0;
        } else {
            this.b = b;
        }
    }
    public void setC(int c) {
        if (c < 0) {
            System.out.println("Error");
            this.c = 0;
        } else {
            this.c = c;
        }
    }
    public float area() {
        return a*b/2;
    }
    public float height() {
        return (a*b/c);
    }
    public float perimeter() {
        return (a+b+c);
    }
    @Override
    public String toString() {
        return "Triangle(" + "a = " + a + ", b = " + b +", c = " + c + ')';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle t)) return false;

        return (this.a == t.a && this.b == t.b && this.c==t.c);
    }

    @Override
    public int hashCode() {
        ++hashCodeTriangle;
        return hashCodeTriangle + 10;
    }


}
