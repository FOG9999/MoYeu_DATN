import junit.framework.*;

public class Exampletest extends TestCase {

  public static void main (String[] args) {
    junit.textui.TestRunner.run(Exampletest.class);
  }

  @org.junit.jupiter.api.Test
  public void testCase1() {
    Example x19 = new Example();
    Triangle1 x20 = new Triangle1(18);
    x19.checkTriangle(x20);
    System.out.println("OK");
  }

  @org.junit.jupiter.api.Test
  public void testCase2() {
    Example x1 = new Example();
    Triangle1 x2 = new Triangle1(-52);
    x1.checkTriangle(x2);
    System.out.println("OK");
  }

  @org.junit.jupiter.api.Test
  public void testCase3() {
    Example x10 = new Example();
    Triangle1 x11 = new Triangle1(19, 92);
    x10.checkTriangle(x11);
    System.out.println("OK");
  }

  @org.junit.jupiter.api.Test
  public void testCase4() {
    Example x154 = new Example();
    Triangle1 x155 = new Triangle1(64, 37, 35);
    x154.checkTriangle(x155);
    System.out.println("OK");
  }

  }
