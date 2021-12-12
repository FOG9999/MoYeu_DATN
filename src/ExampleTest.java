import junit.framework.*;

public class ExampleTest extends TestCase {

  public static void main (String[] args) {
    junit.textui.TestRunner.run(ExampleTest.class);
  }

  @org.junit.jupiter.api.Test
  public void testCase1() {
    Example x184 = new Example();
    Triangle1 x185 = new Triangle1(41, 92, 94);
    x184.checkTriangle(x185);
    System.out.println("OK");
  }

  @org.junit.jupiter.api.Test
  public void testCase2() {
    Example x16 = new Example();
    Triangle1 x17 = new Triangle1(45, 93);
    x16.checkTriangle(x17);
    System.out.println("OK");
  }

  @org.junit.jupiter.api.Test
  public void testCase3() {
    Example x1 = new Example();
    Triangle1 x2 = new Triangle1(-35, -20);
    x1.checkTriangle(x2);
    System.out.println("OK");
  }

  @org.junit.jupiter.api.Test
  public void testCase4() {
    Example x7 = new Example();
    Triangle1 x8 = new Triangle1(30);
    x7.checkTriangle(x8);
    System.out.println("OK");
  }

  }
