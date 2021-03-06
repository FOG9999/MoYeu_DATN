


public class Triangle2
{

    int side1;

    int side2;

    int side3;

    public Triangle2( int side1, int side2, int side3 )
    {
        super();
        trace.add( new java.lang.Integer( 1 ) );
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle2( int side1, int side2 )
    {
        super();
        trace.add( new java.lang.Integer( 2 ) );
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side2;
    }

    public Triangle2( int side1 )
    {
        super();
        trace.add( new java.lang.Integer( 3 ) );
        this.side1 = side1;
        this.side2 = side1;
        this.side3 = side1;
    }

    public java.lang.String sizeOfTriangle()
    {
        trace.add( new java.lang.Integer( 5 ) );
        int perimeter = this.side1 + this.side2 + this.side3;
        if (perimeter < 0) {
            trace.add( new java.lang.Integer( 6 ) );
            return "Invalid Triangle";
        } else {
            trace.add( new java.lang.Integer( 7 ) );
            if (perimeter > 1000) {
                trace.add( new java.lang.Integer( 8 ) );
                return "Big";
            } else {
                trace.add( new java.lang.Integer( 9 ) );
                if (perimeter < 100) {
                    trace.add( new java.lang.Integer( 10 ) );
                    return "Small";
                } else {
                    trace.add( new java.lang.Integer( 11 ) );
                    return "Medium";
                }
            }
        }
    }

    public Triangle2()
    {
        super();
        trace.add( new java.lang.Integer( 4 ) );
    }

    public java.lang.String checkTriangle()
    {
        trace.add( new java.lang.Integer( 12 ) );
        java.lang.String type = "";
        if (side1 + side2 > side3 && side3 + side2 > side1 && side1 + side3 > side2) {
            trace.add( new java.lang.Integer( 13 ) );
            if (side1 != side2 && side1 != side3 && side2 != side3) {
                trace.add( new java.lang.Integer( 14 ) );
                type = "Is triangle scalene";
            } else {
                trace.add( new java.lang.Integer( 15 ) );
                if (side1 == side2 && side1 != side3 || side1 == side3 && side1 != side2 || side2 == side3 && side2 != side1) {
                    trace.add( new java.lang.Integer( 16 ) );
                    type = "Is triangle isosceles ";
                } else {
                    trace.add( new java.lang.Integer( 17 ) );
                    type = "Is triangle equilateral ";
                }
            }
        } else {
            trace.add( new java.lang.Integer( 18 ) );
            type = "Not a triangle";
        }
        return type;
    }

    public void setTriangle( Triangle2 triangle )
    {
        trace.add( new java.lang.Integer( 19 ) );
        side1 = triangle.getSide1();
        side2 = triangle.getSide2();
        side3 = triangle.getSide3();
    }

    public int getSide1()
    {
        trace.add( new java.lang.Integer( 20 ) );
        return side1;
    }

    public void setSide1( int side1 )
    {
        trace.add( new java.lang.Integer( 21 ) );
        this.side1 = side1;
    }

    public int getSide2()
    {
        trace.add( new java.lang.Integer( 22 ) );
        return side2;
    }

    public void setSide2( int side2 )
    {
        trace.add( new java.lang.Integer( 23 ) );
        this.side2 = side2;
    }

    public int getSide3()
    {
        trace.add( new java.lang.Integer( 24 ) );
        return side3;
    }

    public void setSide3( int side3 )
    {
        trace.add( new java.lang.Integer( 25 ) );
        this.side3 = side3;
    }

//    public void scale( Scale scale2)
//    {
//        trace.add( new java.lang.Integer( 26 ) );
//        if (scale2.getWidth() != 1 || scale2.getHeight() != 1) {
//            trace.add( new java.lang.Integer( 27 ) );
//            side1 = side1 * scale2.getHeight() * scale2.getWidth();
//            side2 = side2 * scale2.getHeight() * scale2.getWidth();
//            side2 = side2 * scale2.getHeight() * scale2.getWidth();
//        } else {
//            trace.add( new java.lang.Integer( 28 ) );
//        }
//    }

    static java.util.Set trace = new java.util.HashSet();

    public static void newTrace()
    {
        trace = new java.util.HashSet();
    }

    public static java.util.Set getTrace()
    {
        return trace;
    }

}
